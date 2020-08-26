package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/material/Material.MaterialPickerStylesProps>> */
@js.native
trait PartialClassesMaterialPic extends js.Object {
  var default: js.UndefOr[PartialMaterialPickerStyl] = js.native
}

object PartialClassesMaterialPic {
  @scala.inline
  def apply(): PartialClassesMaterialPic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesMaterialPic]
  }
  @scala.inline
  implicit class PartialClassesMaterialPicOps[Self <: PartialClassesMaterialPic] (val x: Self) extends AnyVal {
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
    def setDefault(value: PartialMaterialPickerStyl): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

