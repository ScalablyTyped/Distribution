package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A DOM element's attribute as an object. In most DOM methods, you will probably directly retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g., Element.getAttributeNode()) or means of iterating give Attr types. */
@js.native
trait Attr extends Node {
  val localName: java.lang.String = js.native
  val name: java.lang.String = js.native
  @JSName("ownerDocument")
  val ownerDocument_Attr: Document = js.native
  val ownerElement: Element | Null = js.native
  val prefix: java.lang.String | Null = js.native
  val specified: scala.Boolean = js.native
  var value: java.lang.String = js.native
}

