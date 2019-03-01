package typings
package reactDashResponsiveLib.reactDashResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryAllQueryable
  extends MediaQueryFeatures
     with MediaQueryTypes

object MediaQueryAllQueryable {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    aspectRatio: java.lang.String = null,
    aural: js.UndefOr[scala.Boolean] = js.undefined,
    braille: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    colorIndex: js.UndefOr[scala.Boolean] = js.undefined,
    deviceAspectRatio: java.lang.String = null,
    deviceHeight: scala.Double | java.lang.String = null,
    deviceWidth: scala.Double | java.lang.String = null,
    embossed: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    handheld: js.UndefOr[scala.Boolean] = js.undefined,
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
    print: js.UndefOr[scala.Boolean] = js.undefined,
    projection: js.UndefOr[scala.Boolean] = js.undefined,
    resolution: scala.Double | java.lang.String = null,
    scan: reactDashResponsiveLib.reactDashResponsiveLibStrings.progressive | reactDashResponsiveLib.reactDashResponsiveLibStrings.interlace = null,
    screen: js.UndefOr[scala.Boolean] = js.undefined,
    tty: js.UndefOr[scala.Boolean] = js.undefined,
    tv: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: MediaQueryType = null,
    width: scala.Double | java.lang.String = null
  ): MediaQueryAllQueryable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (!js.isUndefined(aural)) __obj.updateDynamic("aural")(aural)
    if (!js.isUndefined(braille)) __obj.updateDynamic("braille")(braille)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex)
    if (deviceAspectRatio != null) __obj.updateDynamic("deviceAspectRatio")(deviceAspectRatio)
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(embossed)) __obj.updateDynamic("embossed")(embossed)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(handheld)) __obj.updateDynamic("handheld")(handheld)
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
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (!js.isUndefined(projection)) __obj.updateDynamic("projection")(projection)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen)
    if (!js.isUndefined(tty)) __obj.updateDynamic("tty")(tty)
    if (!js.isUndefined(tv)) __obj.updateDynamic("tv")(tv)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryAllQueryable]
  }
}

