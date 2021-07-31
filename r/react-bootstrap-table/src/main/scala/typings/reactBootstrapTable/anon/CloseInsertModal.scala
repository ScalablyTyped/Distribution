package typings.reactBootstrapTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseInsertModal extends StObject {
  
  /**
    * Callback to close the insert row modal window.
    */
  def closeInsertModal(): Unit
  
  /**
    * Callback to delete selected row(s) from the table.
    */
  def dropRow(): Unit
  
  /**
    * Callback to export the table to a CSV file.
    */
  def exportCSV(): Unit
  
  /**
    * Callback to activate the insert row modal window.
    */
  def openInsertModal(): Unit
  
  /**
    * Callback to apply a search.
    */
  def search(): Unit
  
  /**
    * Callback to toggle between showing all rows and showing only selected rows.
    */
  def showOnlyToogle(): Unit
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
  implicit class CloseInsertModalMutableBuilder[Self <: CloseInsertModal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseInsertModal(value: () => Unit): Self = StObject.set(x, "closeInsertModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropRow(value: () => Unit): Self = StObject.set(x, "dropRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportCSV(value: () => Unit): Self = StObject.set(x, "exportCSV", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenInsertModal(value: () => Unit): Self = StObject.set(x, "openInsertModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearch(value: () => Unit): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowOnlyToogle(value: () => Unit): Self = StObject.set(x, "showOnlyToogle", js.Any.fromFunction0(value))
  }
}
