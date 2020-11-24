package typings.skatejs.typesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skatejs/types", "CustomElement")
@js.native
class CustomElement () extends HTMLElement {
  
  var adoptedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  def attributeChangedCallback(name: String): Unit = js.native
  def attributeChangedCallback(name: String, oldValue: String): Unit = js.native
  def attributeChangedCallback(name: String, oldValue: String, newValue: String): Unit = js.native
  def attributeChangedCallback(name: String, oldValue: Null, newValue: String): Unit = js.native
  
  def connectedCallback(): Unit = js.native
  
  def disconnectedCallback(): Unit = js.native
}
/* static members */
@JSImport("skatejs/types", "CustomElement")
@js.native
object CustomElement extends js.Object {
  
  val observedAttributes: js.Array[String] = js.native
}
