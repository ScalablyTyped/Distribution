package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterClass
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.CharacterClass]
     with Expression {
  
  var expressions: js.Array[Char | ClassRange]
  
  var negative: js.UndefOr[`true`] = js.undefined
}
object CharacterClass {
  
  inline def apply(expressions: js.Array[Char | ClassRange]): CharacterClass = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClass")
    __obj.asInstanceOf[CharacterClass]
  }
  
  extension [Self <: CharacterClass](x: Self) {
    
    inline def setExpressions(value: js.Array[Char | ClassRange]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: (Char | ClassRange)*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setNegative(value: `true`): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
