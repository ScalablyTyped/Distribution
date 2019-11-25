package typings.rotDashJs.libDisplayTileDashGlMod

import org.scalablytyped.runtime.StringDictionary
import typings.rotDashJs.libDisplayBackendMod.Backend
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

trait TileGL extends Backend {
  var _gl: WebGLRenderingContext
  var _program: WebGLProgram
  var _uniforms: StringDictionary[WebGLUniformLocation | Null]
  def _initWebGL(): WebGLRenderingContext
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
  def _updateSize(): Unit
  def _updateTexture(tileSet: HTMLImageElement): Unit
  def computeFontSize(): Double
}

object TileGL {
  @scala.inline
  def apply(
    _gl: WebGLRenderingContext,
    _initWebGL: () => WebGLRenderingContext,
    _normalizedEventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    _options: DisplayOptions,
    _program: WebGLProgram,
    _uniforms: StringDictionary[WebGLUniformLocation | Null],
    _updateSize: () => Unit,
    _updateTexture: HTMLImageElement => Unit,
    clear: () => Unit,
    computeFontSize: () => Double,
    computeSize: (Double, Double) => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): TileGL = {
    val __obj = js.Dynamic.literal(_gl = _gl.asInstanceOf[js.Any], _initWebGL = js.Any.fromFunction0(_initWebGL), _normalizedEventToPosition = js.Any.fromFunction2(_normalizedEventToPosition), _options = _options.asInstanceOf[js.Any], _program = _program.asInstanceOf[js.Any], _uniforms = _uniforms.asInstanceOf[js.Any], _updateSize = js.Any.fromFunction0(_updateSize), _updateTexture = js.Any.fromFunction1(_updateTexture), clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction0(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[TileGL]
  }
}

