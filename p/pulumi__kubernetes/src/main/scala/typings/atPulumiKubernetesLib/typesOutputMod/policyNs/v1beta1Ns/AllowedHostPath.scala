package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods
  * to use. It requires the path prefix to be defined.
  */
trait AllowedHostPath extends js.Object {
  /**
    * pathPrefix is the path prefix that the host volume must match. It does not support `*`.
    * Trailing slashes are trimmed when validating the path prefix with a host path.
    *
    * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food`
    * or `/etc/foo`
    */
  val pathPrefix: java.lang.String
  /**
    * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts
    * are readOnly.
    */
  val readOnly: scala.Boolean
}

object AllowedHostPath {
  @scala.inline
  def apply(pathPrefix: java.lang.String, readOnly: scala.Boolean): AllowedHostPath = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix, readOnly = readOnly)
  
    __obj.asInstanceOf[AllowedHostPath]
  }
}

