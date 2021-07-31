package typings.reactSketchapp

import typings.react.mod.global.JSX.Element
import typings.reactSketchapp.typesMod.SketchLayer
import typings.reactSketchapp.typesMod.WrappedSketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("react-sketchapp/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def render(element: Element): SketchLayer | js.Array[SketchLayer] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any]).asInstanceOf[SketchLayer | js.Array[SketchLayer]]
  @scala.inline
  def render(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[SketchLayer | js.Array[SketchLayer]]
  @scala.inline
  def render(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[SketchLayer | js.Array[SketchLayer]]
  
  @scala.inline
  def renderLayers(layers: js.Array[js.Any], container: SketchLayer): SketchLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLayers")(layers.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[SketchLayer]
  
  @scala.inline
  def renderToJSON(element: Element): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToJSON")(element.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
