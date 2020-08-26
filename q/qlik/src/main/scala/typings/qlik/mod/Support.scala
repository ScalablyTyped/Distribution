package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Support extends js.Object {
  var export: SupportItem = js.native
  var exportData: SupportItem = js.native
  var snapshot: SupportItem | SnapshotLegacy = js.native
}

object Support {
  @scala.inline
  def apply(export: SupportItem, exportData: SupportItem, snapshot: SupportItem | SnapshotLegacy): Support = {
    val __obj = js.Dynamic.literal(export = export.asInstanceOf[js.Any], exportData = exportData.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  @scala.inline
  implicit class SupportOps[Self <: Support] (val x: Self) extends AnyVal {
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
    def setExportFunction1(value: /* layout */ Layout => Boolean): Self = this.set("export", js.Any.fromFunction1(value))
    @scala.inline
    def setExport(value: SupportItem): Self = this.set("export", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportDataFunction1(value: /* layout */ Layout => Boolean): Self = this.set("exportData", js.Any.fromFunction1(value))
    @scala.inline
    def setExportData(value: SupportItem): Self = this.set("exportData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotFunction1(value: /* layout */ Layout => Boolean): Self = this.set("snapshot", js.Any.fromFunction1(value))
    @scala.inline
    def setSnapshot(value: SupportItem | SnapshotLegacy): Self = this.set("snapshot", value.asInstanceOf[js.Any])
  }
  
}

