package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject extends js.Object {
  def handleEvent(evt: Event): scala.Unit
}

object EventListenerObject {
  @scala.inline
  def apply(handleEvent: js.Function1[Event, scala.Unit]): EventListenerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(handleEvent)
    __obj.asInstanceOf[EventListenerObject]
  }
}

