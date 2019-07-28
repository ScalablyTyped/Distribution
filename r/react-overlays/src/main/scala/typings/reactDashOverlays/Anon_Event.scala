package typings.reactDashOverlays

import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def onKeyDown(event: SyntheticEvent[_, Event]): Unit
}

object Anon_Event {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[_, Event] => Unit): Anon_Event = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

