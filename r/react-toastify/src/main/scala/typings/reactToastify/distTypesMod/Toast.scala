package typings.reactToastify.distTypesMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toast extends StObject {
  
  var content: ToastContent[Any]
  
  var props: ToastProps
}
object Toast {
  
  inline def apply(props: ToastProps): Toast = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ToastContent[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* props */ ToastContentProps[Any] => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setProps(value: ToastProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
