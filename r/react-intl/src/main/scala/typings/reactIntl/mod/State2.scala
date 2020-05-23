package typings.reactIntl.mod

import typings.formatjsIntlRelativetimeformat.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State2 extends js.Object {
  var currentValueInSeconds: Double
  var prevUnit: js.UndefOr[Unit] = js.undefined
  var prevValue: js.UndefOr[Double] = js.undefined
}

object State2 {
  @scala.inline
  def apply(currentValueInSeconds: Double, prevUnit: Unit = null, prevValue: js.UndefOr[Double] = js.undefined): State2 = {
    val __obj = js.Dynamic.literal(currentValueInSeconds = currentValueInSeconds.asInstanceOf[js.Any])
    if (prevUnit != null) __obj.updateDynamic("prevUnit")(prevUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(prevValue)) __obj.updateDynamic("prevValue")(prevValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[State2]
  }
}

