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
    off: (java.lang.String, js.Function) => scala.Unit,
    on: (java.lang.String, js.Function) => scala.Unit
  ): JQueryStyleEventEmitter = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[JQueryStyleEventEmitter]
  }
}

