package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBDatabaseEventMap extends js.Object {
  var abort: Event = js.native
  var close: Event = js.native
  var error: Event = js.native
  var versionchange: IDBVersionChangeEvent = js.native
}

object IDBDatabaseEventMap {
  @scala.inline
  def apply(abort: Event, close: Event, error: Event, versionchange: IDBVersionChangeEvent): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
  @scala.inline
  implicit class IDBDatabaseEventMapOps[Self <: IDBDatabaseEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: Event): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: Event): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionchange(value: IDBVersionChangeEvent): Self = this.set("versionchange", value.asInstanceOf[js.Any])
  }
  
}

