package typings.rcProgress.mod

import typings.rcProgress.rcProgressStrings.bottom
import typings.rcProgress.rcProgressStrings.butt
import typings.rcProgress.rcProgressStrings.left
import typings.rcProgress.rcProgressStrings.right
import typings.rcProgress.rcProgressStrings.round
import typings.rcProgress.rcProgressStrings.square
import typings.rcProgress.rcProgressStrings.top
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RCProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var gapDegree: js.UndefOr[Double] = js.native
  var gapPosition: js.UndefOr[top | right | bottom | left] = js.native
  var percent: js.UndefOr[Double | js.Array[Double]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var strokeColor: js.UndefOr[String | js.Array[String] | js.Object] = js.native
  var strokeLinecap: js.UndefOr[butt | square | round] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var trailColor: js.UndefOr[String] = js.native
  var trailWidth: js.UndefOr[Double] = js.native
}

object RCProgressProps {
  @scala.inline
  def apply(): RCProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RCProgressProps]
  }
  @scala.inline
  implicit class RCProgressPropsOps[Self <: RCProgressProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGapDegree(value: Double): Self = this.set("gapDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapDegree: Self = this.set("gapDegree", js.undefined)
    @scala.inline
    def setGapPosition(value: top | right | bottom | left): Self = this.set("gapPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapPosition: Self = this.set("gapPosition", js.undefined)
    @scala.inline
    def setPercentVarargs(value: Double*): Self = this.set("percent", js.Array(value :_*))
    @scala.inline
    def setPercent(value: Double | js.Array[Double]): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStrokeColorVarargs(value: String*): Self = this.set("strokeColor", js.Array(value :_*))
    @scala.inline
    def setStrokeColor(value: String | js.Array[String] | js.Object): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: butt | square | round): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTrailColor(value: String): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailColor: Self = this.set("trailColor", js.undefined)
    @scala.inline
    def setTrailWidth(value: Double): Self = this.set("trailWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailWidth: Self = this.set("trailWidth", js.undefined)
  }
  
}

