package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[NotificationEventMap]
  }
}

