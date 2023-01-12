package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppStateStatic extends StObject {
  
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): NativeEventSubscription
  
  var currentState: AppStateStatus
  
  var isAvailable: Boolean
}
object AppStateStatic {
  
  inline def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => NativeEventSubscription,
    currentState: AppStateStatus,
    isAvailable: Boolean
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), currentState = currentState.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppStateStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppStateStatic] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => NativeEventSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setCurrentState(value: AppStateStatus): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
  }
}
