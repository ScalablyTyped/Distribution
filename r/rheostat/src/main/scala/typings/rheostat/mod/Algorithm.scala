package typings.rheostat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  def getPosition(value: Double, min: Double, max: Double): Double = js.native
  def getValue(pos: Double, min: Double, max: Double): Double = js.native
}

object Algorithm {
  @scala.inline
  def apply(getPosition: (Double, Double, Double) => Double, getValue: (Double, Double, Double) => Double): Algorithm = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction3(getPosition), getValue = js.Any.fromFunction3(getValue))
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
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
    def setGetPosition(value: (Double, Double, Double) => Double): Self = this.set("getPosition", js.Any.fromFunction3(value))
    @scala.inline
    def setGetValue(value: (Double, Double, Double) => Double): Self = this.set("getValue", js.Any.fromFunction3(value))
  }
  
}

