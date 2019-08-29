package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers, footers and bodies, in an HTML table. */
@js.native
trait HTMLTableSectionElement extends HTMLElement {
  /**
    * Sets or retrieves a value that indicates the table alignment.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var ch: java.lang.String = js.native
  /** @deprecated */
  var chOff: java.lang.String = js.native
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    */
  val rows: HTMLCollectionOf[HTMLTableRowElement] = js.native
  /** @deprecated */
  var vAlign: java.lang.String = js.native
  /**
    * Removes the specified row (tr) from the element and from the rows collection.
    * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
    */
  def deleteRow(index: Double): Unit = js.native
  /**
    * Creates a new row (tr) in the table, and adds the row to the rows collection.
    * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
    */
  def insertRow(): HTMLTableRowElement = js.native
  def insertRow(index: Double): HTMLTableRowElement = js.native
}

@JSGlobal("HTMLTableSectionElement")
@js.native
class HTMLTableSectionElementCls () extends HTMLTableSectionElement {
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

@JSGlobal("HTMLTableSectionElement")
@js.native
object HTMLTableSectionElement extends Instantiable0[HTMLTableSectionElement]

