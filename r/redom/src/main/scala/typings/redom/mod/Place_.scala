package typings.redom.mod

import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redom", "Place")
@js.native
class Place_ protected () extends RedomComponent {
  def this(View: RedomComponentConstructor) = this()
  def this(View: RedomComponentConstructor, initData: js.Any) = this()
  
  @JSName("el")
  var el_Place_ : HTMLElement | SVGElement = js.native
  
  @JSName("update")
  def update_MPlace_(visible: Boolean): Unit = js.native
  @JSName("update")
  def update_MPlace_(visible: Boolean, data: js.Any): Unit = js.native
}
