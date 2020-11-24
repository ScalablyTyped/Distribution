package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackHandlerStatic extends js.Object {
  
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): NativeEventSubscription = js.native
  
  def exitApp(): Unit = js.native
  
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): Unit = js.native
}
object BackHandlerStatic {
  
  @scala.inline
  def apply(
    addEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription,
    exitApp: () => Unit,
    removeEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Unit
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = js.Any.fromFunction0(exitApp), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[BackHandlerStatic]
  }
  
  @scala.inline
  implicit class BackHandlerStaticOps[Self <: BackHandlerStatic] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitApp(value: () => Unit): Self = this.set("exitApp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
}
