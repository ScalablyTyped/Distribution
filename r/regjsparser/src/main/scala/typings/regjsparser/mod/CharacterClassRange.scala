package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.characterClassRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterClassRange
  extends StObject
     with Base[characterClassRange]
     with CharacterClassBody
     with _AstNode[Any] {
  
  var max: Value
  
  var min: Value
}
object CharacterClassRange {
  
  inline def apply(max: Value, min: Value, range: js.Tuple2[Double, Double], raw: String): CharacterClassRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassRange")
    __obj.asInstanceOf[CharacterClassRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacterClassRange] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Value): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Value): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
