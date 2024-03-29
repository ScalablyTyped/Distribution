package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackHandlerStatic extends StObject {
  
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): NativeEventSubscription
  
  def exitApp(): Unit
  
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): Unit
}
object BackHandlerStatic {
  
  inline def apply(
    addEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription,
    exitApp: () => Unit,
    removeEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Unit
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = js.Any.fromFunction0(exitApp), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[BackHandlerStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackHandlerStatic] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setExitApp(value: () => Unit): Self = StObject.set(x, "exitApp", js.Any.fromFunction0(value))
    
    inline def setRemoveEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
