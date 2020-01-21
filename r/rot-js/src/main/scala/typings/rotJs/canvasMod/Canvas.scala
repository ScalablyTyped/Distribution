package typings.rotJs.canvasMod

import typings.rotJs.backendMod.Backend
import typings.rotJs.typesMod.DisplayData
import typings.rotJs.typesMod.DisplayOptions
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends Backend {
  var _ctx: CanvasRenderingContext2D
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
  def _updateSize(): Unit
}

object Canvas {
  @scala.inline
  def apply(
    _ctx: CanvasRenderingContext2D,
    _normalizedEventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    _options: DisplayOptions,
    _updateSize: () => Unit,
    clear: () => Unit,
    computeFontSize: (Double, Double) => Double,
    computeSize: (Double, Double) => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): Canvas = {
    val __obj = js.Dynamic.literal(_ctx = _ctx.asInstanceOf[js.Any], _normalizedEventToPosition = js.Any.fromFunction2(_normalizedEventToPosition), _options = _options.asInstanceOf[js.Any], _updateSize = js.Any.fromFunction0(_updateSize), clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction2(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[Canvas]
  }
}

