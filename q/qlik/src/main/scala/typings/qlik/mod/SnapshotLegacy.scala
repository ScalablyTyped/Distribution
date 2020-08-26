package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotLegacy extends js.Object {
  var canTakeSnapshot: Boolean = js.native
}

object SnapshotLegacy {
  @scala.inline
  def apply(canTakeSnapshot: Boolean): SnapshotLegacy = {
    val __obj = js.Dynamic.literal(canTakeSnapshot = canTakeSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotLegacy]
  }
  @scala.inline
  implicit class SnapshotLegacyOps[Self <: SnapshotLegacy] (val x: Self) extends AnyVal {
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
    def setCanTakeSnapshot(value: Boolean): Self = this.set("canTakeSnapshot", value.asInstanceOf[js.Any])
  }
  
}

