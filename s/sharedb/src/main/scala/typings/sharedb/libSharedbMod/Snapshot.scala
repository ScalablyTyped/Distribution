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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

