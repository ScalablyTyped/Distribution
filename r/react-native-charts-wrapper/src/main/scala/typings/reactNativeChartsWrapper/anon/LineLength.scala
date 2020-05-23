package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineLength extends js.Object {
  var lineLength: js.UndefOr[Double] = js.undefined
  var phase: js.UndefOr[Double] = js.undefined
  var spaceLength: js.UndefOr[Double] = js.undefined
}

object LineLength {
  @scala.inline
  def apply(
    lineLength: js.UndefOr[Double] = js.undefined,
    phase: js.UndefOr[Double] = js.undefined,
    spaceLength: js.UndefOr[Double] = js.undefined
  ): LineLength = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lineLength)) __obj.updateDynamic("lineLength")(lineLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(phase)) __obj.updateDynamic("phase")(phase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceLength)) __obj.updateDynamic("spaceLength")(spaceLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLength]
  }
}

