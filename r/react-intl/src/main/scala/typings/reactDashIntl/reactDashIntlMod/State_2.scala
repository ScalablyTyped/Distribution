package typings.reactDashIntl.reactDashIntlMod

import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State_2 extends js.Object {
  var currentValueInSeconds: Double
  var prevUnit: js.UndefOr[Unit] = js.undefined
  var prevValue: js.UndefOr[Double] = js.undefined
}

object State_2 {
  @scala.inline
  def apply(currentValueInSeconds: Double, prevUnit: Unit = null, prevValue: Int | Double = null): State_2 = {
    val __obj = js.Dynamic.literal(currentValueInSeconds = currentValueInSeconds)
    if (prevUnit != null) __obj.updateDynamic("prevUnit")(prevUnit)
    if (prevValue != null) __obj.updateDynamic("prevValue")(prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State_2]
  }
}

