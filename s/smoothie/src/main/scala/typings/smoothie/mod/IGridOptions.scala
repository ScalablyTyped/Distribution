package typings.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /** Whether the grid lines trace the border of the chart or not. */
  var borderVisible: js.UndefOr[Boolean] = js.native
  /** The background colour of the chart. */
  var fillStyle: js.UndefOr[String] = js.native
  /** The pixel width of grid lines. */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Distance between vertical grid lines. */
  var millisPerLine: js.UndefOr[Double] = js.native
  /** Controls whether grid lines are 1px sharp, or softened. */
  var sharpLines: js.UndefOr[Boolean] = js.native
  /** Colour of grid lines. */
  var strokeStyle: js.UndefOr[String] = js.native
  /** Number of vertical sections marked out by horizontal grid lines. */
  var verticalSections: js.UndefOr[Double] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
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
    def setBorderVisible(value: Boolean): Self = this.set("borderVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderVisible: Self = this.set("borderVisible", js.undefined)
    @scala.inline
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setMillisPerLine(value: Double): Self = this.set("millisPerLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisPerLine: Self = this.set("millisPerLine", js.undefined)
    @scala.inline
    def setSharpLines(value: Boolean): Self = this.set("sharpLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharpLines: Self = this.set("sharpLines", js.undefined)
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setVerticalSections(value: Double): Self = this.set("verticalSections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSections: Self = this.set("verticalSections", js.undefined)
  }
  
}

