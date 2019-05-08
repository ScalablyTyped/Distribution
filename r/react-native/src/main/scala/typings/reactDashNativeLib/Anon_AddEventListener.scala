package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListener extends js.Object {
  /**
    * eventName is expected to be `change`(deprecated) or `connectionChange`
    */
  def addEventListener(eventName: java.lang.String, listener: js.Function1[/* result */ scala.Boolean, scala.Unit]): reactDashNativeLib.reactDashNativeMod.NetInfoEventListener
  def fetch(): js.Promise[scala.Boolean]
  /**
    * eventName is expected to be `change`(deprecated) or `connectionChange`
    */
  def removeEventListener(eventName: java.lang.String, listener: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
}

object Anon_AddEventListener {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* result */ scala.Boolean, scala.Unit]) => reactDashNativeLib.reactDashNativeMod.NetInfoEventListener,
    fetch: () => js.Promise[scala.Boolean],
    removeEventListener: (java.lang.String, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit
  ): Anon_AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), fetch = js.Any.fromFunction0(fetch), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[Anon_AddEventListener]
  }
}

