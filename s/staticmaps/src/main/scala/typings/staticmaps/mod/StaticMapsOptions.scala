package typings.staticmaps.mod

import typings.staticmaps.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticMapsOptions extends js.Object {
  var height: Double
  /** @deprecated Use zoomRange.max instead: */
  var maxZoom: js.UndefOr[Double] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var reverseY: js.UndefOr[Boolean] = js.undefined
  /**
    * Subdomains of tile server
    * @default []
    */
  var subdomains: js.UndefOr[js.Array[String]] = js.undefined
  var tileRequestHeader: js.UndefOr[js.Object] = js.undefined
  /**
    * Limit concurrent connections to the tiles server
    * @default 2
    */
  var tileRequestLimit: js.UndefOr[Double] = js.undefined
  var tileRequestTimeout: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileUrl: js.UndefOr[String] = js.undefined
  var width: Double
  /**
    * Defines the range of zoom levels to try
    */
  var zoomRange: js.UndefOr[Max] = js.undefined
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
    subdomains: js.Array[String] = null,
    tileRequestHeader: js.Object = null,
    tileRequestLimit: js.UndefOr[Double] = js.undefined,
    tileRequestTimeout: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tileUrl: String = null,
    zoomRange: Max = null
  ): StaticMapsOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseY)) __obj.updateDynamic("reverseY")(reverseY.get.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileRequestHeader != null) __obj.updateDynamic("tileRequestHeader")(tileRequestHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(tileRequestLimit)) __obj.updateDynamic("tileRequestLimit")(tileRequestLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileRequestTimeout)) __obj.updateDynamic("tileRequestTimeout")(tileRequestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    if (zoomRange != null) __obj.updateDynamic("zoomRange")(zoomRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapsOptions]
  }
}

