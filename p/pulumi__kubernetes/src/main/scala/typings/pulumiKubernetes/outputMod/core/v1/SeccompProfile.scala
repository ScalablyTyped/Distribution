package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
  */
trait SeccompProfile extends StObject {
  
  /**
    * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
    */
  var localhostProfile: String
  
  /**
    * type indicates which kind of seccomp profile will be applied. Valid options are:
    *
    * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
    */
  var `type`: String
}
object SeccompProfile {
  
  inline def apply(localhostProfile: String, `type`: String): SeccompProfile = {
    val __obj = js.Dynamic.literal(localhostProfile = localhostProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeccompProfile]
  }
  
  extension [Self <: SeccompProfile](x: Self) {
    
    inline def setLocalhostProfile(value: String): Self = StObject.set(x, "localhostProfile", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
