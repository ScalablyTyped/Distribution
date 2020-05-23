package typings.reactResponsive.mod

import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryFeatures extends MediaQueryMatchers {
  var maxAspectRatio: js.UndefOr[String] = js.undefined
  var maxColor: js.UndefOr[Double] = js.undefined
  var maxColorIndex: js.UndefOr[Double] = js.undefined
  var maxDeviceAspectRatio: js.UndefOr[String] = js.undefined
  var maxDeviceHeight: js.UndefOr[Double | String] = js.undefined
  var maxDeviceWidth: js.UndefOr[Double | String] = js.undefined
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxMonochrome: js.UndefOr[Double] = js.undefined
  var maxResolution: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minAspectRatio: js.UndefOr[String] = js.undefined
  var minColor: js.UndefOr[Double] = js.undefined
  var minColorIndex: js.UndefOr[Double] = js.undefined
  var minDeviceAspectRatio: js.UndefOr[String] = js.undefined
  var minDeviceHeight: js.UndefOr[Double | String] = js.undefined
  var minDeviceWidth: js.UndefOr[Double | String] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minMonochrome: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
}

object MediaQueryFeatures {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    color: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Boolean] = js.undefined,
    deviceAspectRatio: String = null,
    deviceHeight: Double | String = null,
    deviceWidth: Double | String = null,
    height: Double | String = null,
    maxAspectRatio: String = null,
    maxColor: js.UndefOr[Double] = js.undefined,
    maxColorIndex: js.UndefOr[Double] = js.undefined,
    maxDeviceAspectRatio: String = null,
    maxDeviceHeight: Double | String = null,
    maxDeviceWidth: Double | String = null,
    maxHeight: Double | String = null,
    maxMonochrome: js.UndefOr[Double] = js.undefined,
    maxResolution: Double | String = null,
    maxWidth: Double | String = null,
    minAspectRatio: String = null,
    minColor: js.UndefOr[Double] = js.undefined,
    minColorIndex: js.UndefOr[Double] = js.undefined,
    minDeviceAspectRatio: String = null,
    minDeviceHeight: Double | String = null,
    minDeviceWidth: Double | String = null,
    minHeight: Double | String = null,
    minMonochrome: js.UndefOr[Double] = js.undefined,
    minResolution: Double | String = null,
    minWidth: Double | String = null,
    monochrome: js.UndefOr[Boolean] = js.undefined,
    orientation: portrait | landscape = null,
    resolution: Double | String = null,
    scan: progressive | interlace = null,
    `type`: MediaQueryType = null,
    width: Double | String = null
  ): MediaQueryFeatures = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (deviceAspectRatio != null) __obj.updateDynamic("deviceAspectRatio")(deviceAspectRatio.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxAspectRatio != null) __obj.updateDynamic("maxAspectRatio")(maxAspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(maxColor)) __obj.updateDynamic("maxColor")(maxColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxColorIndex)) __obj.updateDynamic("maxColorIndex")(maxColorIndex.get.asInstanceOf[js.Any])
    if (maxDeviceAspectRatio != null) __obj.updateDynamic("maxDeviceAspectRatio")(maxDeviceAspectRatio.asInstanceOf[js.Any])
    if (maxDeviceHeight != null) __obj.updateDynamic("maxDeviceHeight")(maxDeviceHeight.asInstanceOf[js.Any])
    if (maxDeviceWidth != null) __obj.updateDynamic("maxDeviceWidth")(maxDeviceWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMonochrome)) __obj.updateDynamic("maxMonochrome")(maxMonochrome.get.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minAspectRatio != null) __obj.updateDynamic("minAspectRatio")(minAspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(minColor)) __obj.updateDynamic("minColor")(minColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minColorIndex)) __obj.updateDynamic("minColorIndex")(minColorIndex.get.asInstanceOf[js.Any])
    if (minDeviceAspectRatio != null) __obj.updateDynamic("minDeviceAspectRatio")(minDeviceAspectRatio.asInstanceOf[js.Any])
    if (minDeviceHeight != null) __obj.updateDynamic("minDeviceHeight")(minDeviceHeight.asInstanceOf[js.Any])
    if (minDeviceWidth != null) __obj.updateDynamic("minDeviceWidth")(minDeviceWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(minMonochrome)) __obj.updateDynamic("minMonochrome")(minMonochrome.get.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryFeatures]
  }
}

