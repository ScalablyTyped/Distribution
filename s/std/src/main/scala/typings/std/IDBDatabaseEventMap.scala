package typings.std

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
    val __obj = js.Dynamic.literal(abort = abort, close = close, error = error, versionchange = versionchange)
  
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
}

