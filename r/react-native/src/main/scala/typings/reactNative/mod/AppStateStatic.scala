package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppStateStatic extends js.Object {
  var currentState: AppStateStatus = js.native
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit = js.native
  /**
    * Remove a handler by passing the change event type and the handler
    */
  def removeEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit = js.native
}

object AppStateStatic {
  @scala.inline
  def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit,
    currentState: AppStateStatus,
    removeEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), currentState = currentState.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[AppStateStatic]
  }
  @scala.inline
  implicit class AppStateStaticOps[Self <: AppStateStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setCurrentState(value: AppStateStatus): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
  
}

