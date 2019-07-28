package typings.reactDashSketchapp.reactDashSketchappMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashSketchapp.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def injectSymbols(context: SketchContext): Unit = js.native
  def makeSymbol[P](node: js.Function1[/* props */ P, Element]): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def makeSymbol[P](node: js.Function1[/* props */ P, Element], name: String): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def makeSymbol[P](node: ComponentClass[P, ComponentState]): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def makeSymbol[P](node: ComponentClass[P, ComponentState], name: String): ComponentClass[P with Anon_Key, ComponentState] = js.native
  def render(element: Element): js.Any = js.native
  def render(element: Element, container: js.Any): js.Any = js.native
  def renderToJSON(element: Element): js.Any = js.native
}

