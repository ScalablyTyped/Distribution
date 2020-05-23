package typings.reactEasyChart.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterplotData extends js.Object {
  var `type`: String | Double
  var x: Double | Date | String
  var y: Double | Date | String
  var z: js.UndefOr[Double] = js.undefined
}

object ScatterplotData {
  @scala.inline
  def apply(
    `type`: String | Double,
    x: Double | Date | String,
    y: Double | Date | String,
    z: js.UndefOr[Double] = js.undefined
  ): ScatterplotData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotData]
  }
}

