package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSeriesProps extends AbstractSeriesProps[LabelSeriesPoint] {
  var allowOffsetToBeReversed: js.UndefOr[Boolean] = js.native
   // default: 0
  var labelAnchorX: js.UndefOr[String] = js.native
  var labelAnchorY: js.UndefOr[String] = js.native
  var marginLeft: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
}

object LabelSeriesProps {
  @scala.inline
  def apply(): LabelSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSeriesProps]
  }
  @scala.inline
  implicit class LabelSeriesPropsOps[Self <: LabelSeriesProps] (val x: Self) extends AnyVal {
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
    def setAllowOffsetToBeReversed(value: Boolean): Self = this.set("allowOffsetToBeReversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOffsetToBeReversed: Self = this.set("allowOffsetToBeReversed", js.undefined)
    @scala.inline
    def setLabelAnchorX(value: String): Self = this.set("labelAnchorX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAnchorX: Self = this.set("labelAnchorX", js.undefined)
    @scala.inline
    def setLabelAnchorY(value: String): Self = this.set("labelAnchorY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAnchorY: Self = this.set("labelAnchorY", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
  }
  
}

