package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QMeasureCell extends js.Object {
  var qNum: js.UndefOr[Double] = js.native
  var qText: String = js.native
  def getPercent(): Double = js.native
  def getPercentOfMax(): Double = js.native
}

object QMeasureCell {
  @scala.inline
  def apply(getPercent: () => Double, getPercentOfMax: () => Double, qText: String): QMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
  @scala.inline
  implicit class QMeasureCellOps[Self <: QMeasureCell] (val x: Self) extends AnyVal {
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
    def setGetPercent(value: () => Double): Self = this.set("getPercent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPercentOfMax(value: () => Double): Self = this.set("getPercentOfMax", js.Any.fromFunction0(value))
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQNum: Self = this.set("qNum", js.undefined)
  }
  
}

