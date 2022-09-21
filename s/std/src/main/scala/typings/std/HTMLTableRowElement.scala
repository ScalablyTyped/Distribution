package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table. */
@js.native
trait HTMLTableRowElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    * @deprecated
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /** Retrieves a collection of all cells in the table row. */
  /* standard dom */
  val cells: HTMLCollectionOf[HTMLTableCellElement] = js.native
  
  /** @deprecated */
  /* standard dom */
  var ch: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var chOff: java.lang.String = js.native
  
  /**
    * Removes the specified cell from the table row, as well as from the cells collection.
    * @param index Number that specifies the zero-based position of the cell to remove from the table row. If no value is provided, the last cell in the cells collection is deleted.
    */
  /* standard dom */
  def deleteCell(index: Double): Unit = js.native
  
  /**
    * Creates a new cell in the table row, and adds the cell to the cells collection.
    * @param index Number that specifies where to insert the cell in the tr. The default value is -1, which appends the new cell to the end of the cells collection.
    */
  /* standard dom */
  def insertCell(): HTMLTableCellElement = js.native
  def insertCell(index: Double): HTMLTableCellElement = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /** Retrieves the position of the object in the rows collection for the table. */
  /* standard dom */
  val rowIndex: Double = js.native
  
  /** Retrieves the position of the object in the collection. */
  /* standard dom */
  val sectionRowIndex: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var vAlign: java.lang.String = js.native
}
