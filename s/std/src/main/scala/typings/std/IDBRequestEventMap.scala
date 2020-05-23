package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBRequestEventMap extends js.Object {
  var error: Event
  var success: Event
}

object IDBRequestEventMap {
  @scala.inline
  def apply(error: Event, success: Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBRequestEventMap]
  }
}

