package typings.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineLength extends js.Object {
  var lineLength: js.UndefOr[Double] = js.undefined
  var phase: js.UndefOr[Double] = js.undefined
  var spaceLength: js.UndefOr[Double] = js.undefined
}

object AnonLineLength {
  @scala.inline
  def apply(lineLength: Int | Double = null, phase: Int | Double = null, spaceLength: Int | Double = null): AnonLineLength = {
    val __obj = js.Dynamic.literal()
    if (lineLength != null) __obj.updateDynamic("lineLength")(lineLength.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    if (spaceLength != null) __obj.updateDynamic("spaceLength")(spaceLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineLength]
  }
}

