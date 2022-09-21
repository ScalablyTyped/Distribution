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
  var exclusions: js.Array[STRING | LiteralStem]
  
  /**
    * substring of Literal to be matched or a {@link Wildcard} matching any Literal.
    */
  var stem: STRING | Wildcard
  
  /**
    * Mandatory type "LiteralStemRange".
    */
  var `type`: typings.shexj.shexjStrings.LiteralStemRange
}
object LiteralStemRange {
  
  inline def apply(exclusions: js.Array[STRING | LiteralStem], stem: STRING | Wildcard): LiteralStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStemRange")
    __obj.asInstanceOf[LiteralStemRange]
  }
  
  extension [Self <: LiteralStemRange](x: Self) {
    
    inline def setExclusions(value: js.Array[STRING | LiteralStem]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsVarargs(value: (STRING | LiteralStem)*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setStem(value: STRING | Wildcard): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.LiteralStemRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
