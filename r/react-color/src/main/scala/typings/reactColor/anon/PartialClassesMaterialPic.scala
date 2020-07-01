package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/material/Material.MaterialPickerStylesProps>> */
trait PartialClassesMaterialPic extends js.Object {
  var default: js.UndefOr[PartialMaterialPickerStyl] = js.undefined
}

object PartialClassesMaterialPic {
  @scala.inline
  def apply(default: PartialMaterialPickerStyl = null): PartialClassesMaterialPic = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesMaterialPic]
  }
}

