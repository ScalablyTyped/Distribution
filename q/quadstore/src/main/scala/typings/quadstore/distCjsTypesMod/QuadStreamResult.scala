package typings.quadstore.distCjsTypesMod

import typings.asynciterator.mod.AsyncIterator
import typings.quadstore.distCjsTypesMod.ResultType.QUADS
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuadStreamResult extends StObject {
  
  var iterator: AsyncIterator[Quad]
  
  var order: js.Array[TermName]
  
  var `type`: QUADS
}
object QuadStreamResult {
  
  inline def apply(iterator: AsyncIterator[Quad], order: js.Array[TermName], `type`: QUADS): QuadStreamResult = {
    val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadStreamResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuadStreamResult] (val x: Self) extends AnyVal {
    
    inline def setIterator(value: AsyncIterator[Quad]): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Array[TermName]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: TermName*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setType(value: QUADS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
