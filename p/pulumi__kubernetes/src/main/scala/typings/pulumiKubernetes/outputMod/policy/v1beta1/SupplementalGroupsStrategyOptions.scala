package typings.pulumiKubernetes.outputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
  */
trait SupplementalGroupsStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRange]
  
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
    */
  var rule: String
}
object SupplementalGroupsStrategyOptions {
  
  inline def apply(ranges: js.Array[IDRange], rule: String): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
  
  extension [Self <: SupplementalGroupsStrategyOptions](x: Self) {
    
    inline def setRanges(value: js.Array[IDRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: IDRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
