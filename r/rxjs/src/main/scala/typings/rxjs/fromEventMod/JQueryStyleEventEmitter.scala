package typings.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStyleEventEmitter
  extends EventTargetLike[js.Any] {
  def off(eventName: String, handler: js.Function): Unit
  def on(eventName: String, handler: js.Function): Unit
}

object JQueryStyleEventEmitter {
  @scala.inline
  def apply(off: (String, js.Function) => Unit, on: (String, js.Function) => Unit): JQueryStyleEventEmitter = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[JQueryStyleEventEmitter]
  }
}

