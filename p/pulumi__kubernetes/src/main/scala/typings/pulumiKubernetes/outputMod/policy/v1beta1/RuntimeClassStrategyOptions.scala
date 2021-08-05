package typings.pulumiKubernetes.outputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
  */
trait RuntimeClassStrategyOptions extends StObject {
  
  /**
    * allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod. A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
    */
  var allowedRuntimeClassNames: js.Array[String]
  
  /**
    * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
    */
  var defaultRuntimeClassName: String
}
object RuntimeClassStrategyOptions {
  
  inline def apply(allowedRuntimeClassNames: js.Array[String], defaultRuntimeClassName: String): RuntimeClassStrategyOptions = {
    val __obj = js.Dynamic.literal(allowedRuntimeClassNames = allowedRuntimeClassNames.asInstanceOf[js.Any], defaultRuntimeClassName = defaultRuntimeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClassStrategyOptions]
  }
  
  extension [Self <: RuntimeClassStrategyOptions](x: Self) {
    
    inline def setAllowedRuntimeClassNames(value: js.Array[String]): Self = StObject.set(x, "allowedRuntimeClassNames", value.asInstanceOf[js.Any])
    
    inline def setAllowedRuntimeClassNamesVarargs(value: String*): Self = StObject.set(x, "allowedRuntimeClassNames", js.Array(value :_*))
    
    inline def setDefaultRuntimeClassName(value: String): Self = StObject.set(x, "defaultRuntimeClassName", value.asInstanceOf[js.Any])
  }
}
