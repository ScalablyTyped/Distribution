package typings.reactOverlays.anon

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyDown extends js.Object {
  def onKeyDown(event: SyntheticEvent[_, Event]): Unit
}

object OnKeyDown {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[_, Event] => Unit): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDown]
  }
}

