package typings.reactResponsive

import typings.reactResponsive.mod.MediaQueryType
import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-responsive.react-responsive.MediaQueryMatchers> */
trait PartialMediaQueryMatchers extends js.Object {
  var aspectRatio: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[Boolean] = js.undefined
  var colorIndex: js.UndefOr[Boolean] = js.undefined
  var deviceAspectRatio: js.UndefOr[String] = js.undefined
  var deviceHeight: js.UndefOr[Double | String] = js.undefined
  var deviceWidth: js.UndefOr[Double | String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var monochrome: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var resolution: js.UndefOr[Double | String] = js.undefined
  var scan: js.UndefOr[progressive | interlace] = js.undefined
  var `type`: js.UndefOr[MediaQueryType] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object PartialMediaQueryMatchers {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    color: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Boolean] = js.undefined,
    deviceAspectRatio: String = null,
    deviceHeight: Double | String = null,
    deviceWidth: Double | String = null,
    height: Double | String = null,
    monochrome: js.UndefOr[Boolean] = js.undefined,
    orientation: portrait | landscape = null,
    resolution: Double | String = null,
    scan: progressive | interlace = null,
    `type`: MediaQueryType = null,
    width: Double | String = null
  ): PartialMediaQueryMatchers = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (deviceAspectRatio != null) __obj.updateDynamic("deviceAspectRatio")(deviceAspectRatio.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMediaQueryMatchers]
  }
}

