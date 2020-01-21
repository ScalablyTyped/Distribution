package typings.reactScroll.scrollEventsMod.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollEvent extends js.Object {
  def register(eventName: String, callback: js.Function2[/* to */ String, /* element */ js.Any, Unit]): Unit
  def remove(eventName: String): Unit
}

object ScrollEvent {
  @scala.inline
  def apply(
    register: (String, js.Function2[/* to */ String, /* element */ js.Any, Unit]) => Unit,
    remove: String => Unit
  ): ScrollEvent = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ScrollEvent]
  }
}

