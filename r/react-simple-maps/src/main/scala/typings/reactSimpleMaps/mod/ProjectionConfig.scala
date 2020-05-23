package typings.reactSimpleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionConfig extends js.Object {
  var center: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var parallels: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var rotate: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object ProjectionConfig {
  @scala.inline
  def apply(
    center: js.Tuple2[Double, Double] = null,
    parallels: js.Tuple2[Double, Double] = null,
    rotate: js.Tuple3[Double, Double, Double] = null,
    scale: js.UndefOr[Double] = js.undefined
  ): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (parallels != null) __obj.updateDynamic("parallels")(parallels.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionConfig]
  }
}

