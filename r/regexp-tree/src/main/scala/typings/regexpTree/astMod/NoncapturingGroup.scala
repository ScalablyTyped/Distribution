package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoncapturingGroup
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Group]
     with Group {
  
  var capturing: `false`
  
  var expression: Expression | Null
}
object NoncapturingGroup {
  
  inline def apply(): NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[NoncapturingGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoncapturingGroup] (val x: Self) extends AnyVal {
    
    inline def setCapturing(value: `false`): Self = StObject.set(x, "capturing", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
  }
}
