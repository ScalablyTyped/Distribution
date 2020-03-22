package typings.rcTrigger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdjustX extends js.Object {
  var adjustX: js.UndefOr[Boolean | Double] = js.undefined
  var adjustY: js.UndefOr[Boolean | Double] = js.undefined
}

object AnonAdjustX {
  @scala.inline
  def apply(adjustX: Boolean | Double = null, adjustY: Boolean | Double = null): AnonAdjustX = {
    val __obj = js.Dynamic.literal()
    if (adjustX != null) __obj.updateDynamic("adjustX")(adjustX.asInstanceOf[js.Any])
    if (adjustY != null) __obj.updateDynamic("adjustY")(adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdjustX]
  }
}

