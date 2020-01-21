package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventMap extends js.Object {
  var click: Event_
  var close: Event_
  var error: Event_
  var show: Event_
}

object NotificationEventMap {
  @scala.inline
  def apply(click: Event_, close: Event_, error: Event_, show: Event_): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEventMap]
  }
}

