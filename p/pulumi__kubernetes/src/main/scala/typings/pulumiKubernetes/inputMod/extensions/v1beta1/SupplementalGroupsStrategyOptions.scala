package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy. Deprecated: use SupplementalGroupsStrategyOptions from policy API Group instead.
  */
trait SupplementalGroupsStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.undefined
  
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.undefined
}
object SupplementalGroupsStrategyOptions {
  
  inline def apply(): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
  
  extension [Self <: SupplementalGroupsStrategyOptions](x: Self) {
    
    inline def setRanges(value: Input[js.Array[Input[IDRange]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: Input[IDRange]*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
