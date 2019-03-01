package typings
package reactDashResponsiveLib.reactDashResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryMatchers extends js.Object {
  var aspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var colorIndex: js.UndefOr[scala.Boolean] = js.undefined
  var deviceAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var deviceHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var deviceWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var monochrome: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[
    reactDashResponsiveLib.reactDashResponsiveLibStrings.portrait | reactDashResponsiveLib.reactDashResponsiveLibStrings.landscape
  ] = js.undefined
  var resolution: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var scan: js.UndefOr[
    reactDashResponsiveLib.reactDashResponsiveLibStrings.progressive | reactDashResponsiveLib.reactDashResponsiveLibStrings.interlace
  ] = js.undefined
  var `type`: js.UndefOr[MediaQueryType] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object MediaQueryMatchers {
  @scala.inline
  def apply(
    aspectRatio: java.lang.String = null,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    colorIndex: js.UndefOr[scala.Boolean] = js.undefined,
    deviceAspectRatio: java.lang.String = null,
    deviceHeight: scala.Double | java.lang.String = null,
    deviceWidth: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    monochrome: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: reactDashResponsiveLib.reactDashResponsiveLibStrings.portrait | reactDashResponsiveLib.reactDashResponsiveLibStrings.landscape = null,
    resolution: scala.Double | java.lang.String = null,
    scan: reactDashResponsiveLib.reactDashResponsiveLibStrings.progressive | reactDashResponsiveLib.reactDashResponsiveLibStrings.interlace = null,
    `type`: MediaQueryType = null,
    width: scala.Double | java.lang.String = null
  ): MediaQueryMatchers = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex)
    if (deviceAspectRatio != null) __obj.updateDynamic("deviceAspectRatio")(deviceAspectRatio)
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryMatchers]
  }
}

