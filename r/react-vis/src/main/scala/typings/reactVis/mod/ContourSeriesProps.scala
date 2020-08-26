package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContourSeriesProps extends AbstractSeriesProps[ContourSeriesPoint] {
  var bandwidth: js.UndefOr[Double] = js.native
   // default: 40
  var marginLeft: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
}

object ContourSeriesProps {
  @scala.inline
  def apply(): ContourSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContourSeriesProps]
  }
  @scala.inline
  implicit class ContourSeriesPropsOps[Self <: ContourSeriesProps] (val x: Self) extends AnyVal {
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
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
  }
  
}

