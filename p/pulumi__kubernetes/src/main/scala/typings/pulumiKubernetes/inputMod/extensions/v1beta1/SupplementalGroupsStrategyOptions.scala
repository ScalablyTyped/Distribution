package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy. Deprecated: use SupplementalGroupsStrategyOptions from policy API Group instead.
  */
@js.native
trait SupplementalGroupsStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.native
  
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.native
}
object SupplementalGroupsStrategyOptions {
  
  @scala.inline
  def apply(): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
  
  @scala.inline
  implicit class SupplementalGroupsStrategyOptionsMutableBuilder[Self <: SupplementalGroupsStrategyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: Input[js.Array[Input[IDRange]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: Input[IDRange]*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
