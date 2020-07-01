package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps> */
trait PartialCompactPickerStyle extends js.Object {
  var Compact: js.UndefOr[CSSProperties] = js.undefined
  var clear: js.UndefOr[CSSProperties] = js.undefined
  var compact: js.UndefOr[CSSProperties] = js.undefined
}

object PartialCompactPickerStyle {
  @scala.inline
  def apply(Compact: CSSProperties = null, clear: CSSProperties = null, compact: CSSProperties = null): PartialCompactPickerStyle = {
    val __obj = js.Dynamic.literal()
    if (Compact != null) __obj.updateDynamic("Compact")(Compact.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCompactPickerStyle]
  }
}

