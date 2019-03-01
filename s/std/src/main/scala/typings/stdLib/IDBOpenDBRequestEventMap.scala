package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blocked")(blocked)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("upgradeneeded")(upgradeneeded)
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
}

