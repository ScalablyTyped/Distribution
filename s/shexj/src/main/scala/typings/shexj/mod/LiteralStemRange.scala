package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralStemRange
  extends StObject
     with _valueSetValue {
  
  /**
    * Literals or {@link LiteralStem}s to exclude.
    */
  var exclusions: js.Array[literalRangeExclusion]
  
  /**
    * substring of Literal to be matched or a {@link Wildcard} matching any Literal.
    */
  var stem: literalRangeStem
  
  /**
    * Mandatory type "LiteralStemRange".
    */
  var `type`: typings.shexj.shexjStrings.LiteralStemRange
}
object LiteralStemRange {
  
  inline def apply(exclusions: js.Array[literalRangeExclusion], stem: literalRangeStem): LiteralStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStemRange")
    __obj.asInstanceOf[LiteralStemRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiteralStemRange] (val x: Self) extends AnyVal {
    
    inline def setExclusions(value: js.Array[literalRangeExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsVarargs(value: literalRangeExclusion*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setStem(value: literalRangeStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.LiteralStemRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
