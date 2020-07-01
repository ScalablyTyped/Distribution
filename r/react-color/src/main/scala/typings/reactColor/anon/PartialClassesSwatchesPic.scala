package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/swatches/Swatches.SwatchesPickerStylesProps>> */
trait PartialClassesSwatchesPic extends js.Object {
  var default: js.UndefOr[PartialSwatchesPickerStyl] = js.undefined
}

object PartialClassesSwatchesPic {
  @scala.inline
  def apply(default: PartialSwatchesPickerStyl = null): PartialClassesSwatchesPic = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesSwatchesPic]
  }
}

