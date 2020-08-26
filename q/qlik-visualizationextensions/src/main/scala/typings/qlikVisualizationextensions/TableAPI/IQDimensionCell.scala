package typings.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQDimensionCell extends IQMeasureCell {
  /**
    * Cell value index.
    */
  var qElemNumber: Double = js.native
  /**
    * Cell state.
    */
  var qState: String = js.native
  /**
    * Selects the value in this cell.
    */
  def select(): Unit = js.native
}

object IQDimensionCell {
  @scala.inline
  def apply(
    getPercent: () => Double,
    getPercentOfMax: () => Double,
    qElemNumber: Double,
    qState: String,
    qText: String,
    select: () => Unit
  ): IQDimensionCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[IQDimensionCell]
  }
  @scala.inline
  implicit class IQDimensionCellOps[Self <: IQDimensionCell] (val x: Self) extends AnyVal {
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
    def setQElemNumber(value: Double): Self = this.set("qElemNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setQState(value: String): Self = this.set("qState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("select", js.Any.fromFunction0(value))
  }
  
}

