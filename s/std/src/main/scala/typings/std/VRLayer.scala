package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRLayer extends js.Object {
  var leftBounds: js.UndefOr[js.Array[Double] | Float32Array | Null] = js.undefined
  var rightBounds: js.UndefOr[js.Array[Double] | Float32Array | Null] = js.undefined
  var source: js.UndefOr[HTMLCanvasElement | Null] = js.undefined
}

object VRLayer {
  @scala.inline
  def apply(
    leftBounds: js.UndefOr[Null | js.Array[Double] | Float32Array] = js.undefined,
    rightBounds: js.UndefOr[Null | js.Array[Double] | Float32Array] = js.undefined,
    source: js.UndefOr[Null | HTMLCanvasElement] = js.undefined
  ): VRLayer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftBounds)) __obj.updateDynamic("leftBounds")(leftBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(rightBounds)) __obj.updateDynamic("rightBounds")(rightBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRLayer]
  }
}

