package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRStageParameters extends js.Object {
  var sittingToStandingTransform: js.UndefOr[Float32Array] = js.undefined
  var sizeX: js.UndefOr[Double] = js.undefined
  var sizeY: js.UndefOr[Double] = js.undefined
}

object VRStageParameters {
  @scala.inline
  def apply(
    sittingToStandingTransform: Float32Array = null,
    sizeX: js.UndefOr[Double] = js.undefined,
    sizeY: js.UndefOr[Double] = js.undefined
  ): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    if (sittingToStandingTransform != null) __obj.updateDynamic("sittingToStandingTransform")(sittingToStandingTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeX)) __obj.updateDynamic("sizeX")(sizeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeY)) __obj.updateDynamic("sizeY")(sizeY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRStageParameters]
  }
}

