package typings.seen.seenMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def C(): Color = js.native
  def C(r: Double): Color = js.native
  def C(r: Double, g: Double): Color = js.native
  def C(r: Double, g: Double, b: Double): Color = js.native
  def C(r: Double, g: Double, b: Double, a: Double): Color = js.native
  def CanvasContext(elementOrId: String): CanvasRenderContext = js.native
  def CanvasContext(elementOrId: String, scene: Scene): CanvasRenderContext = js.native
  def CanvasContext(elementOrId: HTMLElement): CanvasRenderContext = js.native
  def CanvasContext(elementOrId: HTMLElement, scene: Scene): CanvasRenderContext = js.native
  def Context(elementOrId: String): RenderContext = js.native
  def Context(elementOrId: String, scene: Scene): RenderContext = js.native
  def Context(elementOrId: HTMLElement): RenderContext = js.native
  def Context(elementOrId: HTMLElement, scene: Scene): RenderContext = js.native
  def M(): Matrix = js.native
  def M(m: js.Array[Double]): Matrix = js.native
  def P(): Point = js.native
  def P(x: Double): Point = js.native
  def P(x: Double, y: Double): Point = js.native
  def P(x: Double, y: Double, z: Double): Point = js.native
  def P(x: Double, y: Double, z: Double, w: Double): Point = js.native
  def SvgContext(elementOrId: String): SvgRenderContext = js.native
  def SvgContext(elementOrId: String, scene: Scene): SvgRenderContext = js.native
  def SvgContext(elementOrId: HTMLElement): SvgRenderContext = js.native
  def SvgContext(elementOrId: HTMLElement, scene: Scene): SvgRenderContext = js.native
}

