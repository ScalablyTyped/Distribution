package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralStem
  extends StObject
     with _valueSetValue {
  
  /**
    * substring of Literal to be matched.
    */
  var stem: STRING
  
  /**
    * Mandatory type "LiteralStem".
    */
  var `type`: typings.shexj.shexjStrings.LiteralStem
}
object LiteralStem {
  
  inline def apply(stem: STRING): LiteralStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStem")
    __obj.asInstanceOf[LiteralStem]
  }
  
  extension [Self <: LiteralStem](x: Self) {
    
    inline def setStem(value: STRING): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.LiteralStem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
