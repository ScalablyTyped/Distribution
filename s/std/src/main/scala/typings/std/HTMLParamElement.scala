package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating <param> elements, representing a pair of a key and a value that acts as a parameter for an <object> element. */
@js.native
trait HTMLParamElement extends HTMLElement {
  /**
    * Sets or retrieves the name of an input parameter for an element.
    */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves the content type of the resource designated by the value attribute.
    */
  /** @deprecated */
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the value of an input parameter for an element.
    */
  var value: java.lang.String = js.native
  /**
    * Sets or retrieves the data type of the value attribute.
    */
  /** @deprecated */
  var valueType: java.lang.String = js.native
}

