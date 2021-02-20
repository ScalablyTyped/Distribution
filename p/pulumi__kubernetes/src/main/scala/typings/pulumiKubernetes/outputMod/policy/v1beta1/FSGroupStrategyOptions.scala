package typings.pulumiKubernetes.outputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
  */
@js.native
trait FSGroupStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRange] = js.native
  
  /**
    * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
    */
  var rule: String = js.native
}
object FSGroupStrategyOptions {
  
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): FSGroupStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSGroupStrategyOptions]
  }
  
  @scala.inline
  implicit class FSGroupStrategyOptionsMutableBuilder[Self <: FSGroupStrategyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[IDRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: IDRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
