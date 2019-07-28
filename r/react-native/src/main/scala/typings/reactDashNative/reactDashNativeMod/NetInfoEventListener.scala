package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetInfoEventListener extends js.Object {
  def remove(): Unit
}

object NetInfoEventListener {
  @scala.inline
  def apply(remove: () => Unit): NetInfoEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[NetInfoEventListener]
  }
}

