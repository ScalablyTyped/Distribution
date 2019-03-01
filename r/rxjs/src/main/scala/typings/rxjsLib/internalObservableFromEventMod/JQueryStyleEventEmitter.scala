package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStyleEventEmitter
  extends EventTargetLike[js.Any] {
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit
}

object JQueryStyleEventEmitter {
  @scala.inline
  def apply(
    off: js.Function2[java.lang.String, js.Function, scala.Unit],
    on: js.Function2[java.lang.String, js.Function, scala.Unit]
  ): JQueryStyleEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.asInstanceOf[JQueryStyleEventEmitter]
  }
}

