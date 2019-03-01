package typings
package reactDashResponsiveLib.reactDashResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryFeatures extends MediaQueryMatchers {
  var maxAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var maxColor: js.UndefOr[scala.Double] = js.undefined
  var maxColorIndex: js.UndefOr[scala.Double] = js.undefined
  var maxDeviceAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var maxDeviceHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxDeviceWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxMonochrome: js.UndefOr[scala.Double] = js.undefined
  var maxResolution: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var minColor: js.UndefOr[scala.Double] = js.undefined
  var minColorIndex: js.UndefOr[scala.Double] = js.undefined
  var minDeviceAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var minDeviceHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minDeviceWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minMonochrome: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object MediaQueryFeatures {
  @scala.inline
  def apply(
    aspectRatio: java.lang.String = null,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    colorIndex: js.UndefOr[scala.Boolean] = js.undefined,
    deviceAspectRatio: java.lang.String = null,
    deviceHeight: scala.Double | java.lang.String = null,
    deviceWidth: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    maxAspectRatio: java.lang.String = null,
    maxColor: scala.Int | scala.Double = null,
    maxColorIndex: scala.Int | scala.Double = null,
    maxDeviceAspectRatio: java.lang.String = null,
    maxDeviceHeight: scala.Double | java.lang.String = null,
    maxDeviceWidth: scala.Double | java.lang.String = null,
    maxHeight: scala.Double | java.lang.String = null,
    maxMonochrome: scala.Int | scala.Double = null,
    maxResolution: scala.Double | java.lang.String = null,
    maxWidth: scala.Double | java.lang.String = null,
    minAspectRatio: java.lang.String = null,
    minColor: scala.Int | scala.Double = null,
    minColorIndex: scala.Int | scala.Double = null,
    minDeviceAspectRatio: java.lang.String = null,
    minDeviceHeight: scala.Double | java.lang.String = null,
    minDeviceWidth: scala.Double | java.lang.String = null,
    minHeight: scala.Double | java.lang.String = null,
    minMonochrome: scala.Int | scala.Double = null,
    minResolution: scala.Double | java.lang.String = null,
    minWidth: scala.Double | java.lang.String = null,
    monochrome: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: reactDashResponsiveLib.reactDashResponsiveLibStrings.portrait | reactDashResponsiveLib.reactDashResponsiveLibStrings.landscape = null,
    resolution: scala.Double | java.lang.String = null,
    scan: reactDashResponsiveLib.reactDashResponsiveLibStrings.progressive | reactDashResponsiveLib.reactDashResponsiveLibStrings.interlace = null,
    `type`: MediaQueryType = null,
    width: scala.Double | java.lang.String = null
  ): MediaQueryFeatures = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex)
    if (deviceAspectRatio != null) __obj.updateDynamic("deviceAspectRatio")(deviceAspectRatio)
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxAspectRatio != null) __obj.updateDynamic("maxAspectRatio")(maxAspectRatio)
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxColorIndex != null) __obj.updateDynamic("maxColorIndex")(maxColorIndex.asInstanceOf[js.Any])
    if (maxDeviceAspectRatio != null) __obj.updateDynamic("maxDeviceAspectRatio")(maxDeviceAspectRatio)
    if (maxDeviceHeight != null) __obj.updateDynamic("maxDeviceHeight")(maxDeviceHeight.asInstanceOf[js.Any])
    if (maxDeviceWidth != null) __obj.updateDynamic("maxDeviceWidth")(maxDeviceWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxMonochrome != null) __obj.updateDynamic("maxMonochrome")(maxMonochrome.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minAspectRatio != null) __obj.updateDynamic("minAspectRatio")(minAspectRatio)
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minColorIndex != null) __obj.updateDynamic("minColorIndex")(minColorIndex.asInstanceOf[js.Any])
    if (minDeviceAspectRatio != null) __obj.updateDynamic("minDeviceAspectRatio")(minDeviceAspectRatio)
    if (minDeviceHeight != null) __obj.updateDynamic("minDeviceHeight")(minDeviceHeight.asInstanceOf[js.Any])
    if (minDeviceWidth != null) __obj.updateDynamic("minDeviceWidth")(minDeviceWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minMonochrome != null) __obj.updateDynamic("minMonochrome")(minMonochrome.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryFeatures]
  }
}

