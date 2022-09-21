package typings.stencilCore.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onClose: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var returnValue: js.UndefOr[String] = js.undefined
}
object DialogHTMLAttributes {
  
  inline def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  extension [Self <: DialogHTMLAttributes[?], T](x: Self & DialogHTMLAttributes[T]) {
    
    inline def setOnClose(value: /* event */ Event => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setReturnValue(value: String): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
