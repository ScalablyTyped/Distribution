package typings.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILabelOptions extends js.Object {
  /** Enables/disables labels showing the min/max values. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Colour for text of labels. */
  var fillStyle: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var intermediateLabelSameAxis: js.UndefOr[Boolean] = js.native
  var precision: js.UndefOr[Double] = js.native
  /** Shows intermediate labels between min and max values along y axis. */
  var showIntermediateLabels: js.UndefOr[Boolean] = js.native
}

object ILabelOptions {
  @scala.inline
  def apply(): ILabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabelOptions]
  }
  @scala.inline
  implicit class ILabelOptionsOps[Self <: ILabelOptions] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setIntermediateLabelSameAxis(value: Boolean): Self = this.set("intermediateLabelSameAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntermediateLabelSameAxis: Self = this.set("intermediateLabelSameAxis", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setShowIntermediateLabels(value: Boolean): Self = this.set("showIntermediateLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIntermediateLabels: Self = this.set("showIntermediateLabels", js.undefined)
  }
  
}

