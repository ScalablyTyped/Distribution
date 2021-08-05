package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
  */
trait ServiceAccountTokenProjection extends StObject {
  
  /**
    * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
    */
  var audience: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
    */
  var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Path is the path relative to the mount point of the file to project the token into.
    */
  var path: Input[String]
}
object ServiceAccountTokenProjection {
  
  inline def apply(path: Input[String]): ServiceAccountTokenProjection = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountTokenProjection]
  }
  
  extension [Self <: ServiceAccountTokenProjection](x: Self) {
    
    inline def setAudience(value: Input[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
