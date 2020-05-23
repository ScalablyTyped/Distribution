package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventMap extends js.Object {
  var click: Event
  var close: Event
  var error: Event
  var show: Event
}

object NotificationEventMap {
  @scala.inline
  def apply(click: Event, close: Event, error: Event, show: Event): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMap]
  }
}

