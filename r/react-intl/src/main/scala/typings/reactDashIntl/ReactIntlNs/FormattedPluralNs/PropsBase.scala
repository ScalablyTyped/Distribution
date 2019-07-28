package typings.reactDashIntl.ReactIntlNs.FormattedPluralNs

import typings.reactDashIntl.reactDashIntlStrings.cardinal
import typings.reactDashIntl.reactDashIntlStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsBase extends Base {
  var few: js.UndefOr[js.Any] = js.undefined
  var many: js.UndefOr[js.Any] = js.undefined
  var one: js.UndefOr[js.Any] = js.undefined
  var other: js.Any
  var two: js.UndefOr[js.Any] = js.undefined
  var zero: js.UndefOr[js.Any] = js.undefined
}

object PropsBase {
  @scala.inline
  def apply(
    other: js.Any,
    few: js.Any = null,
    many: js.Any = null,
    one: js.Any = null,
    style: cardinal | ordinal = null,
    two: js.Any = null,
    zero: js.Any = null
  ): PropsBase = {
    val __obj = js.Dynamic.literal(other = other)
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (one != null) __obj.updateDynamic("one")(one)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[PropsBase]
  }
}

