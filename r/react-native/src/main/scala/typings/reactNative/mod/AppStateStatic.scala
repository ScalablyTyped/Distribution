package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppStateStatic extends StObject {
  
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit
  
  var currentState: AppStateStatus
  
  /**
    * Remove a handler by passing the change event type and the handler
    */
  def removeEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit
}
object AppStateStatic {
  
  inline def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit,
    currentState: AppStateStatus,
    removeEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), currentState = currentState.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[AppStateStatic]
  }
  
  extension [Self <: AppStateStatic](x: Self) {
    
    inline def setAddEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setCurrentState(value: AppStateStatus): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
