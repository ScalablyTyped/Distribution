package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("HTMLTableRowElement")
@js.native
class HTMLTableRowElementCls () extends HTMLTableRowElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLTableRowElement")
@js.native
object HTMLTableRowElement extends Instantiable0[HTMLTableRowElement]

