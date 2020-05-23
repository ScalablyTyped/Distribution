package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table. */
@js.native
trait HTMLTableRowElement extends HTMLElement {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Retrieves a collection of all cells in the table row.
    */
  val cells: HTMLCollectionOf[HTMLTableDataCellElement | HTMLTableHeaderCellElement] = js.native
  /** @deprecated */
  var ch: java.lang.String = js.native
  /** @deprecated */
  var chOff: java.lang.String = js.native
  /**
    * Retrieves the position of the object in the rows collection for the table.
    */
  val rowIndex: Double = js.native
  /**
    * Retrieves the position of the object in the collection.
    */
  val sectionRowIndex: Double = js.native
  /** @deprecated */
  var vAlign: java.lang.String = js.native
  /**
    * Removes the specified cell from the table row, as well as from the cells collection.
    * @param index Number that specifies the zero-based position of the cell to remove from the table row. If no value is provided, the last cell in the cells collection is deleted.
    */
  def deleteCell(index: Double): Unit = js.native
  /**
    * Creates a new cell in the table row, and adds the cell to the cells collection.
    * @param index Number that specifies where to insert the cell in the tr. The default value is -1, which appends the new cell to the end of the cells collection.
    */
  def insertCell(): HTMLTableDataCellElement = js.native
  def insertCell(index: Double): HTMLTableDataCellElement = js.native
}

