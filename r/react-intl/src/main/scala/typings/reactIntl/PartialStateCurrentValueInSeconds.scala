package typings.reactIntl

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
  def apply(currentValueInSeconds: Int | Double = null, prevUnit: Unit = null, prevValue: Int | Double = null): PartialStateCurrentValueInSeconds = {
    val __obj = js.Dynamic.literal()
    if (currentValueInSeconds != null) __obj.updateDynamic("currentValueInSeconds")(currentValueInSeconds.asInstanceOf[js.Any])
    if (prevUnit != null) __obj.updateDynamic("prevUnit")(prevUnit.asInstanceOf[js.Any])
    if (prevValue != null) __obj.updateDynamic("prevValue")(prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateCurrentValueInSeconds]
  }
}

