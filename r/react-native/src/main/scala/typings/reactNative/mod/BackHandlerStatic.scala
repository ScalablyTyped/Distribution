package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackHandlerStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[Unit]): NativeEventSubscription
  def exitApp(): Unit
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[Unit]): Unit
}

object BackHandlerStatic {
  @scala.inline
  def apply(
    addEventListener: (BackPressEventName, js.Function0[Unit]) => NativeEventSubscription,
    exitApp: () => Unit,
    removeEventListener: (BackPressEventName, js.Function0[Unit]) => Unit
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = js.Any.fromFunction0(exitApp), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[BackHandlerStatic]
  }
}

