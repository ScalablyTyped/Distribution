package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers, footers and bodies, in an HTML table.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement)
  */
@js.native
trait HTMLTableSectionElement
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
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/align)
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/ch)
    */
  /* standard dom */
  var ch: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/chOff)
    */
  /* standard dom */
  var chOff: java.lang.String = js.native
  
  /**
    * Removes the specified row (tr) from the element and from the rows collection.
    * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/deleteRow)
    */
  /* standard dom */
  def deleteRow(index: Double): Unit = js.native
  
  /**
    * Creates a new row (tr) in the table, and adds the row to the rows collection.
    * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/insertRow)
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
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/rows)
    */
  /* standard dom */
  val rows: HTMLCollectionOf[HTMLTableRowElement] = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/vAlign)
    */
  /* standard dom */
  var vAlign: java.lang.String = js.native
}
