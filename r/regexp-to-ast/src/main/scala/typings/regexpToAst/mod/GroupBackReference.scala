package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupBackReference
  extends StObject
     with IRegExpAST
     with Atom {
  
  var quantifier: js.UndefOr[Quantifier] = js.undefined
  
  @JSName("type")
  var type_GroupBackReference: typings.regexpToAst.regexpToAstStrings.GroupBackReference
  
  var value: Double
}
object GroupBackReference {
  
  inline def apply(loc: Begin, value: Double): GroupBackReference = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GroupBackReference")
    __obj.asInstanceOf[GroupBackReference]
  }
  
  extension [Self <: GroupBackReference](x: Self) {
    
    inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
    
    inline def setQuantifierUndefined: Self = StObject.set(x, "quantifier", js.undefined)
    
    inline def setType(value: typings.regexpToAst.regexpToAstStrings.GroupBackReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
