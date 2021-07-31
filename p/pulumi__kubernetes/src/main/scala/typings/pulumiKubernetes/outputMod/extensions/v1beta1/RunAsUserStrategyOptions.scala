package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use RunAsUserStrategyOptions from policy API Group instead.
  */
trait RunAsUserStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRange]
  
  /**
    * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var rule: String
}
object RunAsUserStrategyOptions {
  
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): RunAsUserStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsUserStrategyOptions]
  }
  
  @scala.inline
  implicit class RunAsUserStrategyOptionsMutableBuilder[Self <: RunAsUserStrategyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[IDRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: IDRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
