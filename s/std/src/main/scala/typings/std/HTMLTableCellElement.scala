package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header or data cells, in an HTML document. */
@js.native
trait HTMLTableCellElement extends HTMLElement {
  /**
    * Sets or retrieves abbreviated text for the object.
    */
  var abbr: java.lang.String = js.native
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a comma-delimited list of conceptual categories associated with the object.
    */
  /** @deprecated */
  var axis: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Retrieves the position of the object in the cells collection of a row.
    */
  val cellIndex: Double = js.native
  /** @deprecated */
  var ch: java.lang.String = js.native
  /** @deprecated */
  var chOff: java.lang.String = js.native
  /**
    * Sets or retrieves the number columns in the table that the object should span.
    */
  var colSpan: Double = js.native
  /**
    * Sets or retrieves a list of header cells that provide information for the object.
    */
  var headers: java.lang.String = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  /** @deprecated */
  var height: java.lang.String = js.native
  /**
    * Sets or retrieves whether the browser automatically performs wordwrap.
    */
  /** @deprecated */
  var noWrap: scala.Boolean = js.native
  /**
    * Sets or retrieves how many rows in a table the cell should span.
    */
  var rowSpan: Double = js.native
  /**
    * Sets or retrieves the group of cells in a table to which the object's information applies.
    */
  var scope: java.lang.String = js.native
  /** @deprecated */
  var vAlign: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  /** @deprecated */
  var width: java.lang.String = js.native
}

