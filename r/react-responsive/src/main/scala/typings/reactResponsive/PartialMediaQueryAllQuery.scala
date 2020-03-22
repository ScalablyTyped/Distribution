package typings.reactResponsive

import typings.reactResponsive.mod.MediaQueryType
import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-responsive.react-responsive.MediaQueryAllQueryable> */
trait PartialMediaQueryAllQuery extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var aspectRatio: js.UndefOr[String] = js.undefined
  var aural: js.UndefOr[Boolean] = js.undefined
  var braille: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Boolean] = js.undefined
  var colorIndex: js.UndefOr[Boolean] = js.undefined
  var deviceAspectRatio: js.UndefOr[String] = js.undefined
  var deviceHeight: js.UndefOr[Double | String] = js.undefined
  var deviceWidth: js.UndefOr[Double | String] = js.undefined
  var embossed: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[Boolean] = js.undefined
  var handheld: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
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
  var monochrome: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Double | String] = js.undefined
  var scan: js.UndefOr[progressive | interlace] = js.undefined
  var screen: js.UndefOr[Boolean] = js.undefined
  var tty: js.UndefOr[Boolean] = js.undefined
  var tv: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[MediaQueryType] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object PartialMediaQueryAllQuery {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    aspectRatio: String = null,
    aural: js.UndefOr[Boolean] = js.undefined,
    braille: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Boolean] = js.undefined,
    deviceAspectRatio: String = null,
    deviceHeight: Double | String = null,
    deviceWidth: Double | String = null,
    embossed: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    handheld: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    maxAspectRatio: String = null,
    maxColor: Int | Double = null,
    maxColorIndex: Int | Double = null,
    maxDeviceAspectRatio: String = null,
    maxDeviceHeight: Double | String = null,
    maxDeviceWidth: Double | String = null,
    maxHeight: Double | String = null,
    maxMonochrome: Int | Double = null,
    maxResolution: Double | String = null,
    maxWidth: Double | String = null,
    minAspectRatio: String = null,
    minColor: Int | Double = null,
    minColorIndex: Int | Double = null,
    minDeviceAspectRatio: String = null,
    minDeviceHeight: Double | String = null,
    minDeviceWidth: Double | String = null,
    minHeight: Double | String = null,
    minMonochrome: Int | Double = null,
    minResolution: Double | String = null,
    minWidth: Double | String = null,
    monochrome: js.UndefOr[Boolean] = js.undefined,
    orientation: portrait | landscape = null,
    print: js.UndefOr[Boolean] = js.undefined,
    projection: js.UndefOr[Boolean] = js.undefined,
    resolution: Double | String = null,
    scan: progressive | interlace = null,
    screen: js.UndefOr[Boolean] = js.undefined,
    tty: js.UndefOr[Boolean] = js.undefined,
    tv: js.UndefOr[Boolean] = js.undefined,
    `type`: MediaQueryType = null,
    width: Double | String = null
  ): PartialMediaQueryAllQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(aural)) __obj.updateDynamic("aural")(aural.asInstanceOf[js.Any])
    if (!js.isUndefined(braille)) __obj.updateDynamic("braille")(braille.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (deviceAspectRatio != null) __obj.updateDynamic("deviceAspectRatio")(deviceAspectRatio.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(embossed)) __obj.updateDynamic("embossed")(embossed.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(handheld)) __obj.updateDynamic("handheld")(handheld.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxAspectRatio != null) __obj.updateDynamic("maxAspectRatio")(maxAspectRatio.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxColorIndex != null) __obj.updateDynamic("maxColorIndex")(maxColorIndex.asInstanceOf[js.Any])
    if (maxDeviceAspectRatio != null) __obj.updateDynamic("maxDeviceAspectRatio")(maxDeviceAspectRatio.asInstanceOf[js.Any])
    if (maxDeviceHeight != null) __obj.updateDynamic("maxDeviceHeight")(maxDeviceHeight.asInstanceOf[js.Any])
    if (maxDeviceWidth != null) __obj.updateDynamic("maxDeviceWidth")(maxDeviceWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxMonochrome != null) __obj.updateDynamic("maxMonochrome")(maxMonochrome.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minAspectRatio != null) __obj.updateDynamic("minAspectRatio")(minAspectRatio.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minColorIndex != null) __obj.updateDynamic("minColorIndex")(minColorIndex.asInstanceOf[js.Any])
    if (minDeviceAspectRatio != null) __obj.updateDynamic("minDeviceAspectRatio")(minDeviceAspectRatio.asInstanceOf[js.Any])
    if (minDeviceHeight != null) __obj.updateDynamic("minDeviceHeight")(minDeviceHeight.asInstanceOf[js.Any])
    if (minDeviceWidth != null) __obj.updateDynamic("minDeviceWidth")(minDeviceWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minMonochrome != null) __obj.updateDynamic("minMonochrome")(minMonochrome.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (!js.isUndefined(projection)) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(tty)) __obj.updateDynamic("tty")(tty.asInstanceOf[js.Any])
    if (!js.isUndefined(tv)) __obj.updateDynamic("tv")(tv.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMediaQueryAllQuery]
  }
}

