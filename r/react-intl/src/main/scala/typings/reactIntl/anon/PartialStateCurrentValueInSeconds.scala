package typings.reactIntl.anon

import typings.formatjsIntlRelativetimeformat.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-intl.react-intl/lib/components/relative.State> */
trait PartialStateCurrentValueInSeconds extends js.Object {
  var currentValueInSeconds: js.UndefOr[Double] = js.undefined
  var prevUnit: js.UndefOr[Unit] = js.undefined
  var prevValue: js.UndefOr[Double] = js.undefined
}

object PartialStateCurrentValueInSeconds {
  @scala.inline
  def apply(
    currentValueInSeconds: js.UndefOr[Double] = js.undefined,
    prevUnit: Unit = null,
    prevValue: js.UndefOr[Double] = js.undefined
  ): PartialStateCurrentValueInSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentValueInSeconds)) __obj.updateDynamic("currentValueInSeconds")(currentValueInSeconds.get.asInstanceOf[js.Any])
    if (prevUnit != null) __obj.updateDynamic("prevUnit")(prevUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(prevValue)) __obj.updateDynamic("prevValue")(prevValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateCurrentValueInSeconds]
  }
}

