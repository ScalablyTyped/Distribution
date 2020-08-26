package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var m: SnapshotMeta | Null = js.native
  var `type`: String | Null = js.native
  var v: Double = js.native
}

object Snapshot {
  @scala.inline
  def apply(id: String, v: Double): Snapshot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setM(value: SnapshotMeta): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def setMNull: Self = this.set("m", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

