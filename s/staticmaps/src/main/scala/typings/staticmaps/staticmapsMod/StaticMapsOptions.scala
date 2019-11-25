package typings.staticmaps.staticmapsMod

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
    maxZoom: Int | Double = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    reverseY: js.UndefOr[Boolean] = js.undefined,
    tileRequestHeader: js.Object = null,
    tileRequestTimeout: Int | Double = null,
    tileSize: Int | Double = null,
    tileUrl: String = null
  ): StaticMapsOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseY)) __obj.updateDynamic("reverseY")(reverseY.asInstanceOf[js.Any])
    if (tileRequestHeader != null) __obj.updateDynamic("tileRequestHeader")(tileRequestHeader.asInstanceOf[js.Any])
    if (tileRequestTimeout != null) __obj.updateDynamic("tileRequestTimeout")(tileRequestTimeout.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapsOptions]
  }
}

