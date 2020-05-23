package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBOpenDBRequestEventMap extends IDBRequestEventMap {
  var blocked: Event
  var upgradeneeded: IDBVersionChangeEvent
}

object IDBOpenDBRequestEventMap {
  @scala.inline
  def apply(blocked: Event, error: Event, success: Event, upgradeneeded: IDBVersionChangeEvent): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
}

