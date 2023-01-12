package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexQuery extends StObject {
  
  var gt: String
  
  var gte: Boolean
  
  var index: InternalIndex
  
  var lt: String
  
  var lte: Boolean
  
  var order: js.Array[TermName]
}
object IndexQuery {
  
  inline def apply(
    gt: String,
    gte: Boolean,
    index: InternalIndex,
    lt: String,
    lte: Boolean,
    order: js.Array[TermName]
  ): IndexQuery = {
    val __obj = js.Dynamic.literal(gt = gt.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexQuery] (val x: Self) extends AnyVal {
    
    inline def setGt(value: String): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGte(value: Boolean): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: InternalIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLt(value: String): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLte(value: Boolean): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Array[TermName]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: TermName*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
