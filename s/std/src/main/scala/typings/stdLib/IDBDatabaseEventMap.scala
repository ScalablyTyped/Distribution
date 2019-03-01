package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBDatabaseEventMap extends js.Object {
  var abort: Event
  var close: Event
  var error: Event
  var versionchange: IDBVersionChangeEvent
}

object IDBDatabaseEventMap {
  @scala.inline
  def apply(abort: Event, close: Event, error: Event, versionchange: IDBVersionChangeEvent): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("versionchange")(versionchange)
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
}

