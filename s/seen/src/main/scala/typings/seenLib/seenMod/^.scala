package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Affine: seenLib.Anon_INITIALSTATEMATRIX = js.native
  val BvhParser: seenLib.Anon_Expected = js.native
  val Colors: seenLib.Anon_A = js.native
  val Lights: seenLib.Anon_Ambient = js.native
  val Matrices: seenLib.Anon_FlipX = js.native
  val Models: seenLib.Anon_Default = js.native
  val Painters: seenLib.Anon_Path = js.native
  val Points: seenLib.Anon_XY = js.native
  val Projections: seenLib.Anon_Bottom = js.native
  val ShaderUtils: seenLib.Anon_ApplyAmbient = js.native
  val Shaders: seenLib.Anon_AmbientDiffuse = js.native
  val Shapes: seenLib.Anon_Arrow = js.native
  val Util: seenLib.Anon_AArraysEqual = js.native
  val Viewports: seenLib.Anon_Center = js.native
  val WindowEvents: seenLib.Anon_Listener = js.native
  def C(): Color = js.native
  def C(r: scala.Double): Color = js.native
  def C(r: scala.Double, g: scala.Double): Color = js.native
  def C(r: scala.Double, g: scala.Double, b: scala.Double): Color = js.native
  def C(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): Color = js.native
  def CanvasContext(elementOrId: java.lang.String): CanvasRenderContext = js.native
  def CanvasContext(elementOrId: java.lang.String, scene: Scene): CanvasRenderContext = js.native
  def CanvasContext(elementOrId: stdLib.HTMLElement): CanvasRenderContext = js.native
  def CanvasContext(elementOrId: stdLib.HTMLElement, scene: Scene): CanvasRenderContext = js.native
  def Context(elementOrId: java.lang.String): RenderContext = js.native
  def Context(elementOrId: java.lang.String, scene: Scene): RenderContext = js.native
  def Context(elementOrId: stdLib.HTMLElement): RenderContext = js.native
  def Context(elementOrId: stdLib.HTMLElement, scene: Scene): RenderContext = js.native
  def M(): Matrix = js.native
  def M(m: js.Array[scala.Double]): Matrix = js.native
  def P(): Point = js.native
  def P(x: scala.Double): Point = js.native
  def P(x: scala.Double, y: scala.Double): Point = js.native
  def P(x: scala.Double, y: scala.Double, z: scala.Double): Point = js.native
  def P(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Point = js.native
  def SvgContext(elementOrId: java.lang.String): SvgRenderContext = js.native
  def SvgContext(elementOrId: java.lang.String, scene: Scene): SvgRenderContext = js.native
  def SvgContext(elementOrId: stdLib.HTMLElement): SvgRenderContext = js.native
  def SvgContext(elementOrId: stdLib.HTMLElement, scene: Scene): SvgRenderContext = js.native
}

