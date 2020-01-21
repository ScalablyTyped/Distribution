package typings.reactSketchapp

import typings.react.mod._Global_.JSX.Element
import typings.reactSketchapp.typesMod.SketchLayer
import typings.reactSketchapp.typesMod.WrappedSketchLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/render", JSImport.Namespace)
@js.native
object renderMod extends js.Object {
  def render(element: Element): SketchLayer | js.Array[SketchLayer] = js.native
  def render(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def render(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def renderLayers(layers: js.Array[_], container: SketchLayer): SketchLayer = js.native
  def renderToJSON(element: Element): js.Object = js.native
}

