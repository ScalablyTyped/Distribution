package typings.staticmaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticMapsOptions extends js.Object {
  var height: Double
  var maxZoom: js.UndefOr[Double] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var reverseY: js.UndefOr[Boolean] = js.undefined
  var tileRequestHeader: js.UndefOr[js.Object] = js.undefined
  var tileRequestTimeout: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileUrl: js.UndefOr[String] = js.undefined
  var width: Double
}

object StaticMapsOptions {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    maxZoom: js.UndefOr[Double] = js.undefined,
    paddingX: js.UndefOr[Double] = js.undefined,
    paddingY: js.UndefOr[Double] = js.undefined,
    reverseY: js.UndefOr[Boolean] = js.undefined,
    tileRequestHeader: js.Object = null,
    tileRequestTimeout: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tileUrl: String = null
  ): StaticMapsOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseY)) __obj.updateDynamic("reverseY")(reverseY.get.asInstanceOf[js.Any])
    if (tileRequestHeader != null) __obj.updateDynamic("tileRequestHeader")(tileRequestHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(tileRequestTimeout)) __obj.updateDynamic("tileRequestTimeout")(tileRequestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapsOptions]
  }
}

