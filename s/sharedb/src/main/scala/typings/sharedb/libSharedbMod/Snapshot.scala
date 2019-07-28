package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var id: String
  var m: SnapshotMeta | Null
  var `type`: String | Null
  var v: Double
}

object Snapshot {
  @scala.inline
  def apply(id: String, v: Double, data: js.Any = null, m: SnapshotMeta = null, `type`: String = null): Snapshot = {
    val __obj = js.Dynamic.literal(id = id, v = v)
    if (data != null) __obj.updateDynamic("data")(data)
    if (m != null) __obj.updateDynamic("m")(m)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Snapshot]
  }
}

