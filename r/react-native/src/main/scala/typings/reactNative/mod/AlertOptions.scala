package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dark
import typings.reactNative.reactNativeStrings.light
import typings.reactNative.reactNativeStrings.unspecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertOptions extends StObject {
  
  /** @platform android */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  /** @platform android */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[unspecified | light | dark] = js.undefined
}
object AlertOptions {
  
  inline def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setUserInterfaceStyle(value: unspecified | light | dark): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
  }
}
