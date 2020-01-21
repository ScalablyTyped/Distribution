package typings.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseStats extends js.Object {
  def onEvent(event: EventType): Unit
}

object LeaseStats {
  @scala.inline
  def apply(onEvent: EventType => Unit): LeaseStats = {
    val __obj = js.Dynamic.literal(onEvent = js.Any.fromFunction1(onEvent))
  
    __obj.asInstanceOf[LeaseStats]
  }
}

