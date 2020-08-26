package typings.rollupPluginSizeSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSizeSnapshotOptions extends js.Object {
  var matchSnapshot: js.UndefOr[Boolean] = js.native
  var printInfo: js.UndefOr[Boolean] = js.native
  var snapshotPath: js.UndefOr[String] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object PluginSizeSnapshotOptions {
  @scala.inline
  def apply(): PluginSizeSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSizeSnapshotOptions]
  }
  @scala.inline
  implicit class PluginSizeSnapshotOptionsOps[Self <: PluginSizeSnapshotOptions] (val x: Self) extends AnyVal {
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
    def setMatchSnapshot(value: Boolean): Self = this.set("matchSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchSnapshot: Self = this.set("matchSnapshot", js.undefined)
    @scala.inline
    def setPrintInfo(value: Boolean): Self = this.set("printInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintInfo: Self = this.set("printInfo", js.undefined)
    @scala.inline
    def setSnapshotPath(value: String): Self = this.set("snapshotPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotPath: Self = this.set("snapshotPath", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

