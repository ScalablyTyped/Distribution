package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.SELinuxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use SELinuxStrategyOptions from policy API Group instead.
  */
trait SELinuxStrategyOptions extends StObject {
  
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  var rule: String
  
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: SELinuxOptions
}
object SELinuxStrategyOptions {
  
  inline def apply(rule: String, seLinuxOptions: SELinuxOptions): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], seLinuxOptions = seLinuxOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
  
  extension [Self <: SELinuxStrategyOptions](x: Self) {
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxOptions(value: SELinuxOptions): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
  }
}
