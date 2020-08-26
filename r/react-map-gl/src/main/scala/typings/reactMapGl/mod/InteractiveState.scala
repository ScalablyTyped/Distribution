package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveState extends js.Object {
  var startBearing: js.UndefOr[Double] = js.native
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var startPitch: js.UndefOr[Double] = js.native
  var startZoom: js.UndefOr[Double] = js.native
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object InteractiveState {
  @scala.inline
  def apply(): InteractiveState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveState]
  }
  @scala.inline
  implicit class InteractiveStateOps[Self <: InteractiveState] (val x: Self) extends AnyVal {
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
    def setStartBearing(value: Double): Self = this.set("startBearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartBearing: Self = this.set("startBearing", js.undefined)
    @scala.inline
    def setStartPanLngLat(value: js.Tuple2[Double, Double]): Self = this.set("startPanLngLat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPanLngLat: Self = this.set("startPanLngLat", js.undefined)
    @scala.inline
    def setStartPitch(value: Double): Self = this.set("startPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPitch: Self = this.set("startPitch", js.undefined)
    @scala.inline
    def setStartZoom(value: Double): Self = this.set("startZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartZoom: Self = this.set("startZoom", js.undefined)
    @scala.inline
    def setStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = this.set("startZoomLngLat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartZoomLngLat: Self = this.set("startZoomLngLat", js.undefined)
  }
  
}

