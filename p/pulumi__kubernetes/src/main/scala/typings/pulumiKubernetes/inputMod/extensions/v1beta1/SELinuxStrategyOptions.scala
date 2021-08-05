package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.SELinuxOptions
import typings.pulumiPulumi.outputMod.Input
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
  var rule: Input[String]
  
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.undefined
}
object SELinuxStrategyOptions {
  
  inline def apply(rule: Input[String]): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
  
  extension [Self <: SELinuxStrategyOptions](x: Self) {
    
    inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxOptions(value: Input[SELinuxOptions]): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxOptionsUndefined: Self = StObject.set(x, "seLinuxOptions", js.undefined)
  }
}
