package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptions extends js.Object {
  var snapshot_id: js.UndefOr[String] = js.native
}

object SnapshotOptions {
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
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
    def setSnapshot_id(value: String): Self = this.set("snapshot_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshot_id: Self = this.set("snapshot_id", js.undefined)
  }
  
}

