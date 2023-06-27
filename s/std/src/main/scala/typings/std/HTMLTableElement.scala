package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement)
  */
@js.native
trait HTMLTableElement
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
    * Sets or retrieves a value that indicates the table alignment.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/align)
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/bgColor)
    */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /**
    * Sets or retrieves the width of the border to draw around the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/border)
    */
  /* standard dom */
  var border: java.lang.String = js.native
  
  /**
    * Retrieves the caption object of a table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/caption)
    */
  /* standard dom */
  var caption: HTMLTableCaptionElement | Null = js.native
  
  /**
    * Sets or retrieves the amount of space between the border of the cell and the content of the cell.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/cellPadding)
    */
  /* standard dom */
  var cellPadding: java.lang.String = js.native
  
  /**
    * Sets or retrieves the amount of space between cells in a table.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/cellSpacing)
    */
  /* standard dom */
  var cellSpacing: java.lang.String = js.native
  
  /**
    * Creates an empty caption element in the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createCaption)
    */
  /* standard dom */
  def createCaption(): HTMLTableCaptionElement = js.native
  
  /**
    * Creates an empty tBody element in the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTBody)
    */
  /* standard dom */
  def createTBody(): HTMLTableSectionElement = js.native
  
  /**
    * Creates an empty tFoot element in the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTFoot)
    */
  /* standard dom */
  def createTFoot(): HTMLTableSectionElement = js.native
  
  /**
    * Returns the tHead element object if successful, or null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTHead)
    */
  /* standard dom */
  def createTHead(): HTMLTableSectionElement = js.native
  
  /**
    * Deletes the caption element and its contents from the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteCaption)
    */
  /* standard dom */
  def deleteCaption(): Unit = js.native
  
  /**
    * Removes the specified row (tr) from the element and from the rows collection.
    * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteRow)
    */
  /* standard dom */
  def deleteRow(index: Double): Unit = js.native
  
  /**
    * Deletes the tFoot element and its contents from the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTFoot)
    */
  /* standard dom */
  def deleteTFoot(): Unit = js.native
  
  /**
    * Deletes the tHead element and its contents from the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTHead)
    */
  /* standard dom */
  def deleteTHead(): Unit = js.native
  
  /**
    * Sets or retrieves the way the border frame around the table is displayed.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/frame)
    */
  /* standard dom */
  var frame: java.lang.String = js.native
  
  /**
    * Creates a new row (tr) in the table, and adds the row to the rows collection.
    * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/insertRow)
    */
  /* standard dom */
  def insertRow(): HTMLTableRowElement = js.native
  def insertRow(index: Double): HTMLTableRowElement = js.native
  
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
  
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rows)
    */
  /* standard dom */
  val rows: HTMLCollectionOf[HTMLTableRowElement] = js.native
  
  /**
    * Sets or retrieves which dividing lines (inner borders) are displayed.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rules)
    */
  /* standard dom */
  var rules: java.lang.String = js.native
  
  /**
    * Sets or retrieves a description and/or structure of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/summary)
    */
  /* standard dom */
  var summary: java.lang.String = js.native
  
  /**
    * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tBodies)
    */
  /* standard dom */
  val tBodies: HTMLCollectionOf[HTMLTableSectionElement] = js.native
  
  /**
    * Retrieves the tFoot object of the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tFoot)
    */
  /* standard dom */
  var tFoot: HTMLTableSectionElement | Null = js.native
  
  /**
    * Retrieves the tHead object of the table.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tHead)
    */
  /* standard dom */
  var tHead: HTMLTableSectionElement | Null = js.native
  
  /**
    * Sets or retrieves the width of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/width)
    */
  /* standard dom */
  var width: java.lang.String = js.native
}
