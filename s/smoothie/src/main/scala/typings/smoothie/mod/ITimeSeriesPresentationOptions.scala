package typings.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeSeriesPresentationOptions extends js.Object {
  var fillStyle: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var strokeStyle: js.UndefOr[String] = js.native
}

object ITimeSeriesPresentationOptions {
  @scala.inline
  def apply(): ITimeSeriesPresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeSeriesPresentationOptions]
  }
  @scala.inline
  implicit class ITimeSeriesPresentationOptionsOps[Self <: ITimeSeriesPresentationOptions] (val x: Self) extends AnyVal {
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
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
  }
  
}

