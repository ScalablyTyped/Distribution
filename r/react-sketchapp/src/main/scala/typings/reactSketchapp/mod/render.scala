package typings.reactSketchapp.mod

import typings.react.mod.global.JSX.Element
import typings.reactSketchapp.typesMod.SketchLayer
import typings.reactSketchapp.typesMod.WrappedSketchLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp", "render")
@js.native
object render extends js.Object {
  
  def apply(element: Element): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
}
