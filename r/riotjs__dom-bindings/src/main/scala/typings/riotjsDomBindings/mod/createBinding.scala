package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@riotjs/dom-bindings", "createBinding")
@js.native
object createBinding extends js.Object {
  
  def apply(root: HTMLElement, binding: BindingData): Binding[_, _] = js.native
  def apply(root: HTMLElement, binding: BindingData, templateTagOffset: Double): Binding[_, _] = js.native
}
