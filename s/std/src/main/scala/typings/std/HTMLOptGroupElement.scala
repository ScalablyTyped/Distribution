package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the regular HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <optgroup> elements. */
@js.native
trait HTMLOptGroupElement extends HTMLElement {
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | Null = js.native
  /**
    * Sets or retrieves a value that you can use to implement your own label functionality for the object.
    */
  var label: java.lang.String = js.native
}

