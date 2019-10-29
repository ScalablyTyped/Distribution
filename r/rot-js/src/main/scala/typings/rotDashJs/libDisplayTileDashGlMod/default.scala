package typings.rotDashJs.libDisplayTileDashGlMod

import org.scalablytyped.runtime.StringDictionary
import typings.rotDashJs.libDisplayTypesMod.DisplayData
import typings.rotDashJs.libDisplayTypesMod.DisplayOptions
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
@js.native
class default () extends TileGL {
  /* CompleteClass */
  override var _gl: WebGLRenderingContext = js.native
  /* CompleteClass */
  override var _options: DisplayOptions = js.native
  /* CompleteClass */
  override var _program: WebGLProgram = js.native
  /* CompleteClass */
  override var _uniforms: StringDictionary[WebGLUniformLocation | Null] = js.native
  /* CompleteClass */
  override def _initWebGL(): WebGLRenderingContext = js.native
  /* CompleteClass */
  override def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def _updateSize(): Unit = js.native
  /* CompleteClass */
  override def _updateTexture(tileSet: HTMLImageElement): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def computeFontSize(): Double = js.native
  /* CompleteClass */
  override def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
  /* CompleteClass */
  override def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def draw(data: DisplayData, clearBefore: Boolean): Unit = js.native
  /* CompleteClass */
  override def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def getContainer(): HTMLElement | Null = js.native
  /* CompleteClass */
  override def schedule(cb: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def setOptions(options: DisplayOptions): Unit = js.native
}

/* static members */
@JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
@js.native
object default extends js.Object {
  def isSupported(): Boolean = js.native
}

