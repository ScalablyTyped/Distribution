package typings.reactSketchapp.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.global.JSX.Element
import typings.reactSketchapp.anon.Overrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp", "makeSymbol")
@js.native
object makeSymbol extends js.Object {
  
  def apply[P](node: js.Function1[/* props */ P, Element]): ComponentClass[P with Overrides, ComponentState] = js.native
  def apply[P](node: js.Function1[/* props */ P, Element], name: String): ComponentClass[P with Overrides, ComponentState] = js.native
  def apply[P](node: ComponentClass[P, ComponentState]): ComponentClass[P with Overrides, ComponentState] = js.native
  def apply[P](node: ComponentClass[P, ComponentState], name: String): ComponentClass[P with Overrides, ComponentState] = js.native
}
