package typings.reactBootstrapTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseInsertModal extends js.Object {
  /**
    * Callback to close the insert row modal window.
    */
  def closeInsertModal(): Unit = js.native
  /**
    * Callback to delete selected row(s) from the table.
    */
  def dropRow(): Unit = js.native
  /**
    * Callback to export the table to a CSV file.
    */
  def exportCSV(): Unit = js.native
  /**
    * Callback to activate the insert row modal window.
    */
  def openInsertModal(): Unit = js.native
  /**
    * Callback to apply a search.
    */
  def search(): Unit = js.native
  /**
    * Callback to toggle between showing all rows and showing only selected rows.
    */
  def showOnlyToogle(): Unit = js.native
}

object CloseInsertModal {
  @scala.inline
  def apply(
    closeInsertModal: () => Unit,
    dropRow: () => Unit,
    exportCSV: () => Unit,
    openInsertModal: () => Unit,
    search: () => Unit,
    showOnlyToogle: () => Unit
  ): CloseInsertModal = {
    val __obj = js.Dynamic.literal(closeInsertModal = js.Any.fromFunction0(closeInsertModal), dropRow = js.Any.fromFunction0(dropRow), exportCSV = js.Any.fromFunction0(exportCSV), openInsertModal = js.Any.fromFunction0(openInsertModal), search = js.Any.fromFunction0(search), showOnlyToogle = js.Any.fromFunction0(showOnlyToogle))
    __obj.asInstanceOf[CloseInsertModal]
  }
  @scala.inline
  implicit class CloseInsertModalOps[Self <: CloseInsertModal] (val x: Self) extends AnyVal {
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
    def setCloseInsertModal(value: () => Unit): Self = this.set("closeInsertModal", js.Any.fromFunction0(value))
    @scala.inline
    def setDropRow(value: () => Unit): Self = this.set("dropRow", js.Any.fromFunction0(value))
    @scala.inline
    def setExportCSV(value: () => Unit): Self = this.set("exportCSV", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenInsertModal(value: () => Unit): Self = this.set("openInsertModal", js.Any.fromFunction0(value))
    @scala.inline
    def setSearch(value: () => Unit): Self = this.set("search", js.Any.fromFunction0(value))
    @scala.inline
    def setShowOnlyToogle(value: () => Unit): Self = this.set("showOnlyToogle", js.Any.fromFunction0(value))
  }
  
}

