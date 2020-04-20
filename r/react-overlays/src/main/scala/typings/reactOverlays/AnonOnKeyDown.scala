package typings.reactOverlays

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnKeyDown extends js.Object {
  def onKeyDown(event: SyntheticEvent[_, Event_]): Unit
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[_, Event_] => Unit): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[AnonOnKeyDown]
  }
}

