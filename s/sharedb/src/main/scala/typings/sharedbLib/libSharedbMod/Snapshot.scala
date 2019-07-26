package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var id: java.lang.String
  var m: SnapshotMeta | scala.Null
  var `type`: java.lang.String | scala.Null
  var v: scala.Double
}

object Snapshot {
  @scala.inline
  def apply(
    id: java.lang.String,
    v: scala.Double,
    data: js.Any = null,
    m: SnapshotMeta = null,
    `type`: java.lang.String = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal(id = id, v = v)
    if (data != null) __obj.updateDynamic("data")(data)
    if (m != null) __obj.updateDynamic("m")(m)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Snapshot]
  }
}

