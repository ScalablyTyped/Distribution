package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximized extends js.Object {
  var maximized: Boolean
  var originalEvent: Event_
}

object AnonMaximized {
  @scala.inline
  def apply(maximized: Boolean, originalEvent: Event_): AnonMaximized = {
    val __obj = js.Dynamic.literal(maximized = maximized.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaximized]
  }
}

