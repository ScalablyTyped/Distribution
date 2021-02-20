package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use RunAsUserStrategyOptions from policy API Group instead.
  */
@js.native
trait RunAsUserStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.native
  
  /**
    * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var rule: Input[String] = js.native
}
object RunAsUserStrategyOptions {
  
  @scala.inline
  def apply(rule: Input[String]): RunAsUserStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsUserStrategyOptions]
  }
  
  @scala.inline
  implicit class RunAsUserStrategyOptionsMutableBuilder[Self <: RunAsUserStrategyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: Input[js.Array[Input[IDRange]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: Input[IDRange]*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
