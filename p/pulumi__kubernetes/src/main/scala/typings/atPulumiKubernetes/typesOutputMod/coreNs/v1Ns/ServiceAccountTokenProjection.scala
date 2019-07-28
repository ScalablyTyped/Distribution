package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccountTokenProjection represents a projected service account token volume. This
  * projection can be used to insert a service account token into the pods runtime filesystem for
  * use against APIs (Kubernetes API Server or otherwise).
  */
trait ServiceAccountTokenProjection extends js.Object {
  /**
    * Audience is the intended audience of the token. A recipient of a token must identify itself
    * with an identifier specified in the audience of the token, and otherwise should reject the
    * token. The audience defaults to the identifier of the apiserver.
    */
  val audience: String
  /**
    * ExpirationSeconds is the requested duration of validity of the service account token. As
    * the token approaches expiration, the kubelet volume plugin will proactively rotate the
    * service account token. The kubelet will start trying to rotate the token if the token is
    * older than 80 percent of its time to live or if the token is older than 24 hours.Defaults
    * to 1 hour and must be at least 10 minutes.
    */
  val expirationSeconds: Double
  /**
    * Path is the path relative to the mount point of the file to project the token into.
    */
  val path: String
}

object ServiceAccountTokenProjection {
  @scala.inline
  def apply(audience: String, expirationSeconds: Double, path: String): ServiceAccountTokenProjection = {
    val __obj = js.Dynamic.literal(audience = audience, expirationSeconds = expirationSeconds, path = path)
  
    __obj.asInstanceOf[ServiceAccountTokenProjection]
  }
}

