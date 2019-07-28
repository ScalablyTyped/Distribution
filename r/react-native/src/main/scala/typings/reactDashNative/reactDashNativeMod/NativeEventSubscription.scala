package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventSubscription extends js.Object {
  /**
    * Call this method to un-subscribe from a native-event
    */
  def remove(): Unit
}

object NativeEventSubscription {
  @scala.inline
  def apply(remove: () => Unit): NativeEventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[NativeEventSubscription]
  }
}

