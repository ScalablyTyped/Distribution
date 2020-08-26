package typings.rotJs.termMod

import typings.rotJs.backendMod.Backend
import typings.rotJs.typesMod.DisplayData
import typings.rotJs.typesMod.DisplayOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Term extends Backend {
  var _cursor: js.Tuple2[Double, Double] = js.native
  var _lastColor: String = js.native
  var _offset: js.Tuple2[Double, Double] = js.native
  def computeFontSize(): Double = js.native
  def computeSize(): js.Tuple2[Double, Double] = js.native
}

object Term {
  @scala.inline
  def apply(
    _cursor: js.Tuple2[Double, Double],
    _lastColor: String,
    _offset: js.Tuple2[Double, Double],
    _options: DisplayOptions,
    clear: () => Unit,
    computeFontSize: () => Double,
    computeSize: () => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): Term = {
    val __obj = js.Dynamic.literal(_cursor = _cursor.asInstanceOf[js.Any], _lastColor = _lastColor.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction0(computeFontSize), computeSize = js.Any.fromFunction0(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  implicit class TermOps[Self <: Term] (val x: Self) extends AnyVal {
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
    def set_cursor(value: js.Tuple2[Double, Double]): Self = this.set("_cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def set_lastColor(value: String): Self = this.set("_lastColor", value.asInstanceOf[js.Any])
    @scala.inline
    def set_offset(value: js.Tuple2[Double, Double]): Self = this.set("_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputeFontSize(value: () => Double): Self = this.set("computeFontSize", js.Any.fromFunction0(value))
    @scala.inline
    def setComputeSize(value: () => js.Tuple2[Double, Double]): Self = this.set("computeSize", js.Any.fromFunction0(value))
  }
  
}

