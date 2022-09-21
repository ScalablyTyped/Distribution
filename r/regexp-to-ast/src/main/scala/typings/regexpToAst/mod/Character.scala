package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Character
  extends StObject
     with IRegExpAST
     with Atom {
  
  var quantifier: js.UndefOr[Quantifier] = js.undefined
  
  @JSName("type")
  var type_Character: typings.regexpToAst.regexpToAstStrings.Character
  
  var value: Double
}
object Character {
  
  inline def apply(loc: Begin, value: Double): Character = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Character")
    __obj.asInstanceOf[Character]
  }
  
  extension [Self <: Character](x: Self) {
    
    inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
    
    inline def setQuantifierUndefined: Self = StObject.set(x, "quantifier", js.undefined)
    
    inline def setType(value: typings.regexpToAst.regexpToAstStrings.Character): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
