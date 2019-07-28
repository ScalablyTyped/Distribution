package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.NetInfoEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListener extends js.Object {
  /**
    * eventName is expected to be `change`(deprecated) or `connectionChange`
    */
  def addEventListener(eventName: String, listener: js.Function1[/* result */ Boolean, Unit]): NetInfoEventListener
  def fetch(): js.Promise[Boolean]
  /**
    * eventName is expected to be `change`(deprecated) or `connectionChange`
    */
  def removeEventListener(eventName: String, listener: js.Function1[/* result */ Boolean, Unit]): Unit
}

object Anon_AddEventListener {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* result */ Boolean, Unit]) => NetInfoEventListener,
    fetch: () => js.Promise[Boolean],
    removeEventListener: (String, js.Function1[/* result */ Boolean, Unit]) => Unit
  ): Anon_AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), fetch = js.Any.fromFunction0(fetch), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[Anon_AddEventListener]
  }
}

