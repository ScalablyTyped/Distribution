package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps>> */
trait PartialClassesCompactPick extends js.Object {
  var default: js.UndefOr[PartialCompactPickerStyle] = js.undefined
}

object PartialClassesCompactPick {
  @scala.inline
  def apply(default: PartialCompactPickerStyle = null): PartialClassesCompactPick = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesCompactPick]
  }
}

