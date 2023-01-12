package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.characterClassEscape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterClassEscape
  extends StObject
     with Base[characterClassEscape]
     with CharacterClassBody
     with _AstNode[Any] {
  
  var value: String
}
object CharacterClassEscape {
  
  inline def apply(range: js.Tuple2[Double, Double], raw: String, value: String): CharacterClassEscape = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassEscape")
    __obj.asInstanceOf[CharacterClassEscape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacterClassEscape] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
