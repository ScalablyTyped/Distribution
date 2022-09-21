package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disjunction
  extends StObject
     with IRegExpAST {
  
  @JSName("type")
  var type_Disjunction: typings.regexpToAst.regexpToAstStrings.Disjunction
  
  var value: js.Array[Alternative]
}
object Disjunction {
  
  inline def apply(loc: Begin, value: js.Array[Alternative]): Disjunction = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Disjunction")
    __obj.asInstanceOf[Disjunction]
  }
  
  extension [Self <: Disjunction](x: Self) {
    
    inline def setType(value: typings.regexpToAst.regexpToAstStrings.Disjunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Alternative]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Alternative*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
