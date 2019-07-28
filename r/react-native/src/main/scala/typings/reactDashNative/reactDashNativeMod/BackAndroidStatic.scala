package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackAndroidStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[Unit]): Unit
  def exitApp(): Unit
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[Unit]): Unit
}

object BackAndroidStatic {
  @scala.inline
  def apply(
    addEventListener: (BackPressEventName, js.Function0[Unit]) => Unit,
    exitApp: () => Unit,
    removeEventListener: (BackPressEventName, js.Function0[Unit]) => Unit
  ): BackAndroidStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = js.Any.fromFunction0(exitApp), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[BackAndroidStatic]
  }
}

