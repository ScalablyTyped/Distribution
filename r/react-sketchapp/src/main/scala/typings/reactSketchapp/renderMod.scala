package typings.reactSketchapp

import typings.react.mod.global.JSX.Element
import typings.reactSketchapp.typesMod.SketchLayer
import typings.reactSketchapp.typesMod.WrappedSketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("react-sketchapp/render", "render")
  @js.native
  def render(element: Element): SketchLayer | js.Array[SketchLayer] = js.native
  @JSImport("react-sketchapp/render", "render")
  @js.native
  def render(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  @JSImport("react-sketchapp/render", "render")
  @js.native
  def render(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  
  @JSImport("react-sketchapp/render", "renderLayers")
  @js.native
  def renderLayers(layers: js.Array[_], container: SketchLayer): SketchLayer = js.native
  
  @JSImport("react-sketchapp/render", "renderToJSON")
  @js.native
  def renderToJSON(element: Element): js.Object = js.native
}
