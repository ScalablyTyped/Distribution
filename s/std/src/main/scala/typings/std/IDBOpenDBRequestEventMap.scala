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
    val __obj = js.Dynamic.literal(blocked = blocked, error = error, success = success, upgradeneeded = upgradeneeded)
  
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
}

