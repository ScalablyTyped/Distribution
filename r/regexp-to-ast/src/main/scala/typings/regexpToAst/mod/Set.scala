package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set
  extends StObject
     with IRegExpAST
     with Atom {
  
  var complement: Boolean
  
  var quantifier: js.UndefOr[Quantifier] = js.undefined
  
  @JSName("type")
  var type_Set: typings.regexpToAst.regexpToAstStrings.Set
  
  var value: js.Array[Double | Range]
}
object Set {
  
  inline def apply(complement: Boolean, loc: Begin, value: js.Array[Double | Range]): Set = {
    val __obj = js.Dynamic.literal(complement = complement.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Set")
    __obj.asInstanceOf[Set]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
    
    inline def setComplement(value: Boolean): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
    
    inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
    
    inline def setQuantifierUndefined: Self = StObject.set(x, "quantifier", js.undefined)
    
    inline def setType(value: typings.regexpToAst.regexpToAstStrings.Set): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Double | Range]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (Double | Range)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
