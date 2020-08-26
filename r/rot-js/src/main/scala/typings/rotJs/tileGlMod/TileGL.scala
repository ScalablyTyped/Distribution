package typings.rotJs.tileGlMod

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.backendMod.Backend
import typings.rotJs.typesMod.DisplayData
import typings.rotJs.typesMod.DisplayOptions
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileGL extends Backend {
  var _gl: WebGLRenderingContext = js.native
  var _program: WebGLProgram = js.native
  var _uniforms: StringDictionary[WebGLUniformLocation | Null] = js.native
  def _initWebGL(): WebGLRenderingContext = js.native
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  def _updateSize(): Unit = js.native
  def _updateTexture(tileSet: HTMLImageElement): Unit = js.native
  def computeFontSize(): Double = js.native
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
  @scala.inline
  implicit class TileGLOps[Self <: TileGL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_gl(value: WebGLRenderingContext): Self = this.set("_gl", value.asInstanceOf[js.Any])
    @scala.inline
    def set_initWebGL(value: () => WebGLRenderingContext): Self = this.set("_initWebGL", js.Any.fromFunction0(value))
    @scala.inline
    def set_normalizedEventToPosition(value: (Double, Double) => js.Tuple2[Double, Double]): Self = this.set("_normalizedEventToPosition", js.Any.fromFunction2(value))
    @scala.inline
    def set_program(value: WebGLProgram): Self = this.set("_program", value.asInstanceOf[js.Any])
    @scala.inline
    def set_uniforms(value: StringDictionary[WebGLUniformLocation | Null]): Self = this.set("_uniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def set_updateSize(value: () => Unit): Self = this.set("_updateSize", js.Any.fromFunction0(value))
    @scala.inline
    def set_updateTexture(value: HTMLImageElement => Unit): Self = this.set("_updateTexture", js.Any.fromFunction1(value))
    @scala.inline
    def setComputeFontSize(value: () => Double): Self = this.set("computeFontSize", js.Any.fromFunction0(value))
  }
  
}

