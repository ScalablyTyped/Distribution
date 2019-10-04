package typings.reactDashSketchapp.reactDashSketchappMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashSketchapp.Anon_Key
import typings.reactDashSketchapp.typesMod.SketchContext
import typings.reactDashSketchapp.typesMod.SketchLayer
import typings.reactDashSketchapp.typesMod.WrappedSketchLayer
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
  def render(element: Element): SketchLayer | js.Array[SketchLayer] = js.native
  def render(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def render(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def renderToJSON(element: Element): js.Object = js.native
}

