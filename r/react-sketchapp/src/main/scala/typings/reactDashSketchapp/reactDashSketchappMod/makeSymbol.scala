package typings.reactDashSketchapp.reactDashSketchappMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSX.Element
import typings.reactDashSketchapp.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "makeSymbol")
@js.native
object makeSymbol extends js.Object {
  def apply[P](node: js.Function1[/* props */ P, Element]): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def apply[P](node: js.Function1[/* props */ P, Element], name: String): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def apply[P](node: ComponentClass[P, ComponentState]): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def apply[P](node: ComponentClass[P, ComponentState], name: String): ComponentClass[P with Anon_Key, ComponentState] = js.native
}

