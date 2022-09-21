package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaxPortal
  extends StObject
     with RaxElement[Any, String | JSXElementConstructor[Any]] {
  
  var children: RaxNode
}
object RaxPortal {
  
  inline def apply(props: Any, `type`: String | JSXElementConstructor[Any]): RaxPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxPortal]
  }
  
  extension [Self <: RaxPortal](x: Self) {
    
    inline def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
