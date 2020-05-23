package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <embed> elements. */
@js.native
trait HTMLEmbedElement extends HTMLElement {
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves a URL to be loaded by the object.
    */
  var src: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
  def getSVGDocument(): Document | Null = js.native
}

