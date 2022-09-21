package typings.rollup.anon

import typings.rollup.rollupStrings.post
import typings.rollup.rollupStrings.pre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler[T] extends StObject {
  
  var handler: T
  
  var order: js.UndefOr[pre | post | Null] = js.undefined
}
object Handler {
  
  inline def apply[T](handler: T): Handler[T] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler[T]]
  }
  
  extension [Self <: Handler[?], T](x: Self & Handler[T]) {
    
    inline def setHandler(value: T): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: pre | post): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
