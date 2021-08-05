package typings.pulumiKubernetes.outputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
  */
trait RunAsGroupStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRange]
  
  /**
    * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
    */
  var rule: String
}
object RunAsGroupStrategyOptions {
  
  inline def apply(ranges: js.Array[IDRange], rule: String): RunAsGroupStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsGroupStrategyOptions]
  }
  
  extension [Self <: RunAsGroupStrategyOptions](x: Self) {
    
    inline def setRanges(value: js.Array[IDRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: IDRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
