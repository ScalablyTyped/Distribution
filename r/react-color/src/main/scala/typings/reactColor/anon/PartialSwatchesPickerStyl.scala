package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/swatches/Swatches.SwatchesPickerStylesProps> */
trait PartialSwatchesPickerStyl extends js.Object {
  var body: js.UndefOr[CSSProperties] = js.undefined
  var clear: js.UndefOr[CSSProperties] = js.undefined
  var overflow: js.UndefOr[CSSProperties] = js.undefined
  var picker: js.UndefOr[CSSProperties] = js.undefined
}

object PartialSwatchesPickerStyl {
  @scala.inline
  def apply(
    body: CSSProperties = null,
    clear: CSSProperties = null,
    overflow: CSSProperties = null,
    picker: CSSProperties = null
  ): PartialSwatchesPickerStyl = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSwatchesPickerStyl]
  }
}

