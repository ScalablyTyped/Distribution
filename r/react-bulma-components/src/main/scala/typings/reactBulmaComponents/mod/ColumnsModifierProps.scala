package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Columns ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/columns/columns.js
trait ColumnsModifierProps extends js.Object {
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var gapless: js.UndefOr[Boolean] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
}

object ColumnsModifierProps {
  @scala.inline
  def apply(
    breakpoint: Breakpoint = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    gapless: js.UndefOr[Boolean] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined
  ): ColumnsModifierProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (!js.isUndefined(gapless)) __obj.updateDynamic("gapless")(gapless.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsModifierProps]
  }
}

