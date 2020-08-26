package typings.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelGlowSettings> */
@js.native
trait PartialRaphaelGlowSetting extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var offsetx: js.UndefOr[Double] = js.native
  var offsety: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialRaphaelGlowSetting {
  @scala.inline
  def apply(): PartialRaphaelGlowSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaphaelGlowSetting]
  }
  @scala.inline
  implicit class PartialRaphaelGlowSettingOps[Self <: PartialRaphaelGlowSetting] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setOffsetx(value: Double): Self = this.set("offsetx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetx: Self = this.set("offsetx", js.undefined)
    @scala.inline
    def setOffsety(value: Double): Self = this.set("offsety", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsety: Self = this.set("offsety", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

