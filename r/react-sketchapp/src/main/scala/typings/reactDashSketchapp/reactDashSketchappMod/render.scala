package typings.reactDashSketchapp.reactDashSketchappMod

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashSketchapp.typesMod.SketchLayer
import typings.reactDashSketchapp.typesMod.WrappedSketchLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "render")
@js.native
object render extends js.Object {
  def apply(element: Element): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
}

