package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.ColIndex
import typings.reactBootstrapTable.reactBootstrapTableNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellEdit[TRow /* <: js.Object */] extends js.Object {
  /**
    * Accept a custom callback function, after cell saving, this function will be called.
    * This callback function takes three arguments: row, cellName and cellValue
    *   `row`: the row data that was saved.
    *   `cellName`: the column dataField cell name that has been modified.
    *   `cellValue`: the new cell value.
    *   `props`: an object containing the current cell's rowIndex and colIndex values.
    */
  var afterSaveCell: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* keyof TRow */ /* cellName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* props */ ColIndex, 
      Unit
    ]
  ] = js.native
  /**
    * Accept a custom callback function, before cell saving, this function will be called.
    * This callback function takes four arguments: row, cellName, cellValue and done.
    *   `row`: the row data to be saved.
    *   `cellName`: the column dataField cell name that has been modified.
    *   `cellValue`: the new cell value.
    *   `done`: a callback function to use if this is an async operation, to indicate if the save data is valid.
    *   `props`: an object containing the current cell's rowIndex and colIndex values.
    * If your validation is async, for example: you want to pop a confirm dialog for user to confim in this case,
    * react-bootstrap-table pass a callback function to you. You are supposed to call this callback function with a
    * bool value to perfom if it is valid or not in addition, you should return 1 from the main function to tell
    * react-bootstrap-table that this is a async operation.
    */
  var beforeSaveCell: js.UndefOr[
    js.Function5[
      /* row */ TRow, 
      /* keyof TRow */ /* cellName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* done */ js.Function1[/* isValid */ Boolean, Unit], 
      /* props */ ColIndex, 
      Boolean | `1`
    ]
  ] = js.native
  /**
    * Enabling blurToEscape will result in a cell edit being cancelled when the user clicks outside the table during
    * editing.
    * Default is false.
    */
  var blurToEscape: js.UndefOr[Boolean] = js.native
  /**
    * Enabling blurToSave will trigger a saving event on the cell when the input field becomes deselected. Default is false.
    * In the default condition, you need to press ENTER to save the cell.
    */
  var blurToSave: js.UndefOr[Boolean] = js.native
  /**
    * Spectify which condition will trigger cell editing.(click or dbclick). Required.
    */
  var mode: CellEditClickMode = js.native
  /**
    * nonEditableRows tell react-bootstrap-table which rows should not be edited on all of the columns. Briefly, its a row level limitation
    * Please assign a callback function, and this function is supposed to be return an array of row keys.
    */
  var nonEditableRows: js.UndefOr[js.Function0[js.Array[Double | String]]] = js.native
}

object CellEdit {
  @scala.inline
  def apply[/* <: js.Object */ TRow](mode: CellEditClickMode): CellEdit[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEdit[TRow]]
  }
  @scala.inline
  implicit class CellEditOps[Self <: CellEdit[_], /* <: js.Object */ TRow] (val x: Self with CellEdit[TRow]) extends AnyVal {
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
    def setMode(value: CellEditClickMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterSaveCell(
      value: (/* row */ TRow, /* keyof TRow */ /* cellName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, /* props */ ColIndex) => Unit
    ): Self = this.set("afterSaveCell", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSaveCell: Self = this.set("afterSaveCell", js.undefined)
    @scala.inline
    def setBeforeSaveCell(
      value: (/* row */ TRow, /* keyof TRow */ /* cellName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, /* done */ js.Function1[/* isValid */ Boolean, Unit], /* props */ ColIndex) => Boolean | `1`
    ): Self = this.set("beforeSaveCell", js.Any.fromFunction5(value))
    @scala.inline
    def deleteBeforeSaveCell: Self = this.set("beforeSaveCell", js.undefined)
    @scala.inline
    def setBlurToEscape(value: Boolean): Self = this.set("blurToEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurToEscape: Self = this.set("blurToEscape", js.undefined)
    @scala.inline
    def setBlurToSave(value: Boolean): Self = this.set("blurToSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurToSave: Self = this.set("blurToSave", js.undefined)
    @scala.inline
    def setNonEditableRows(value: () => js.Array[Double | String]): Self = this.set("nonEditableRows", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNonEditableRows: Self = this.set("nonEditableRows", js.undefined)
  }
  
}

