package typings.rotDashJs.libDisplayBackendMod

import typings.rotDashJs.libDisplayTypesMod.DisplayData
import typings.rotDashJs.libDisplayTypesMod.DisplayOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend extends js.Object {
  var _options: DisplayOptions
  def clear(): Unit
  def computeFontSize(availWidth: Double, availHeight: Double): Double
  def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double]
  def draw(data: DisplayData, clearBefore: Boolean): Unit
  def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
  def getContainer(): HTMLElement | Null
  def schedule(cb: js.Function0[Unit]): Unit
  def setOptions(options: DisplayOptions): Unit
}

object Backend {
  @scala.inline
  def apply(
    _options: DisplayOptions,
    clear: () => Unit,
    computeFontSize: (Double, Double) => Double,
    computeSize: (Double, Double) => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): Backend = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction2(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[Backend]
  }
}

