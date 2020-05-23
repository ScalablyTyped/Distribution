package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface. */
@js.native
trait HTMLMetaElement extends HTMLElement {
  /**
    * Gets or sets meta-information to associate with httpEquiv or name.
    */
  var content: java.lang.String = js.native
  /**
    * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
    */
  var httpEquiv: java.lang.String = js.native
  /**
    * Sets or retrieves the value specified in the content attribute of the meta object.
    */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
    */
  /** @deprecated */
  var scheme: java.lang.String = js.native
}

