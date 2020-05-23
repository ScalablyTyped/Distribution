package typings.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeltaScaleX extends js.Object {
  var deltaScaleX: js.UndefOr[Double] = js.undefined
  var deltaScaleY: js.UndefOr[Double] = js.undefined
}

object DeltaScaleX {
  @scala.inline
  def apply(deltaScaleX: js.UndefOr[Double] = js.undefined, deltaScaleY: js.UndefOr[Double] = js.undefined): DeltaScaleX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deltaScaleX)) __obj.updateDynamic("deltaScaleX")(deltaScaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaScaleY)) __obj.updateDynamic("deltaScaleY")(deltaScaleY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaScaleX]
  }
}

