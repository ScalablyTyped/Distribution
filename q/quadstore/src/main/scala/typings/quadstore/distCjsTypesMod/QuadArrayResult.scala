package typings.quadstore.distCjsTypesMod

import typings.quadstore.distCjsTypesMod.ResultType.QUADS
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuadArrayResult extends StObject {
  
  var items: js.Array[Quad]
  
  var order: js.Array[TermName]
  
  var `type`: QUADS
}
object QuadArrayResult {
  
  inline def apply(items: js.Array[Quad], order: js.Array[TermName], `type`: QUADS): QuadArrayResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadArrayResult]
  }
  
  extension [Self <: QuadArrayResult](x: Self) {
    
    inline def setItems(value: js.Array[Quad]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Quad*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOrder(value: js.Array[TermName]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: TermName*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setType(value: QUADS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
