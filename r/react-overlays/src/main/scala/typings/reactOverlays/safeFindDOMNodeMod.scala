package typings.reactOverlays

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/cjs/safeFindDOMNode", JSImport.Namespace)
@js.native
object safeFindDOMNodeMod extends js.Object {
  
  def default(): Element | Text | Null = js.native
  def default(componentOrElement: ComponentClass[js.Object, ComponentState]): Element | Text | Null = js.native
  def default(componentOrElement: Element): Element | Text | Null = js.native
}
