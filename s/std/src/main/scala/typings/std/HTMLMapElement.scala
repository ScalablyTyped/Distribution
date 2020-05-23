package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements. */
@js.native
trait HTMLMapElement extends HTMLElement {
  /**
    * Retrieves a collection of the area objects defined for the given map object.
    */
  val areas: HTMLCollection = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
}

