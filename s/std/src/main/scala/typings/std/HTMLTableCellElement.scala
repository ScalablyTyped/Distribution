package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header or data cells, in an HTML document.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement)
  */
@js.native
trait HTMLTableCellElement
  extends StObject
     with HTMLElement {
  
  /**
    * Sets or retrieves abbreviated text for the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/abbr)
    */
  /* standard dom */
  var abbr: java.lang.String = js.native
  
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
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/align)
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /**
    * Sets or retrieves a comma-delimited list of conceptual categories associated with the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/axis)
    */
  /* standard dom */
  var axis: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/bgColor)
    */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /**
    * Retrieves the position of the object in the cells collection of a row.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/cellIndex)
    */
  /* standard dom */
  val cellIndex: Double = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/ch)
    */
  /* standard dom */
  var ch: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/chOff)
    */
  /* standard dom */
  var chOff: java.lang.String = js.native
  
  /**
    * Sets or retrieves the number columns in the table that the object should span.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/colSpan)
    */
  /* standard dom */
  var colSpan: Double = js.native
  
  /**
    * Sets or retrieves a list of header cells that provide information for the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/headers)
    */
  /* standard dom */
  var headers: java.lang.String = js.native
  
  /**
    * Sets or retrieves the height of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/height)
    */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /**
    * Sets or retrieves whether the browser automatically performs wordwrap.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/noWrap)
    */
  /* standard dom */
  var noWrap: scala.Boolean = js.native
  
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
    * Sets or retrieves how many rows in a table the cell should span.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/rowSpan)
    */
  /* standard dom */
  var rowSpan: Double = js.native
  
  /**
    * Sets or retrieves the group of cells in a table to which the object's information applies.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/scope)
    */
  /* standard dom */
  var scope: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/vAlign)
    */
  /* standard dom */
  var vAlign: java.lang.String = js.native
  
  /**
    * Sets or retrieves the width of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/width)
    */
  /* standard dom */
  var width: java.lang.String = js.native
}
