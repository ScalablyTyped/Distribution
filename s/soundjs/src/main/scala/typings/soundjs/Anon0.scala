package typings.soundjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def handleEvent(eventObj: js.Object): Unit
}

object Anon0 {
  @scala.inline
  def apply(handleEvent: js.Object => Unit): Anon0 = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[Anon0]
  }
}

