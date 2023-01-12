package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpts extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[js.Array[TermName]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
}
object GetOpts {
  
  inline def apply(): GetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOpts] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOrder(value: js.Array[TermName]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: TermName*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
