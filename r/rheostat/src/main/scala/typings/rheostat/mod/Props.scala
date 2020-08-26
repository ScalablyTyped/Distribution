package typings.rheostat.mod

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends Events {
  var algorithm: js.UndefOr[Algorithm] = js.native
  var autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[ReactType[_]] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var handle: js.UndefOr[ReactType[_]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[Orientation] = js.native
  var pitComponent: js.UndefOr[ReactType[_]] = js.native
  var pitPoints: js.UndefOr[js.Array[Double]] = js.native
  var progressBar: js.UndefOr[ReactType[_]] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var snapPoints: js.UndefOr[js.Array[Double]] = js.native
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setAutoAdjustVerticalPosition(value: Boolean): Self = this.set("autoAdjustVerticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAdjustVerticalPosition: Self = this.set("autoAdjustVerticalPosition", js.undefined)
    @scala.inline
    def setBackground(value: ReactType[_]): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHandle(value: ReactType[_]): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPitComponent(value: ReactType[_]): Self = this.set("pitComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitComponent: Self = this.set("pitComponent", js.undefined)
    @scala.inline
    def setPitPointsVarargs(value: Double*): Self = this.set("pitPoints", js.Array(value :_*))
    @scala.inline
    def setPitPoints(value: js.Array[Double]): Self = this.set("pitPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitPoints: Self = this.set("pitPoints", js.undefined)
    @scala.inline
    def setProgressBar(value: ReactType[_]): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapPointsVarargs(value: Double*): Self = this.set("snapPoints", js.Array(value :_*))
    @scala.inline
    def setSnapPoints(value: js.Array[Double]): Self = this.set("snapPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapPoints: Self = this.set("snapPoints", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

