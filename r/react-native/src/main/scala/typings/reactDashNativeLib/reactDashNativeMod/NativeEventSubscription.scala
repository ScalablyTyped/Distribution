package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventSubscription extends js.Object {
  /**
    * Call this method to un-subscribe from a native-event
    */
  def remove(): scala.Unit
}

object NativeEventSubscription {
  @scala.inline
  def apply(remove: js.Function0[scala.Unit]): NativeEventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[NativeEventSubscription]
  }
}

