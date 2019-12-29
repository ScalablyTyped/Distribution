package typings.reactDashContentDashLoader.reactDashContentDashLoaderMod

import typings.react.reactMod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentLoaderProps extends SVGAttributes[SVGElement] {
  var animate: js.UndefOr[Boolean] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var gradientRatio: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var primaryOpacity: js.UndefOr[Double] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var secondaryOpacity: js.UndefOr[Double] = js.undefined
  @JSName("speed")
  var speed_IContentLoaderProps: js.UndefOr[Double] = js.undefined
  var uniquekey: js.UndefOr[String] = js.undefined
}

object IContentLoaderProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGElement] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    baseUrl: String = null,
    gradientRatio: Int | Double = null,
    interval: Int | Double = null,
    primaryColor: String = null,
    primaryOpacity: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null,
    secondaryOpacity: Int | Double = null,
    speed: Int | Double = null,
    uniquekey: String = null
  ): IContentLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (gradientRatio != null) __obj.updateDynamic("gradientRatio")(gradientRatio.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (primaryOpacity != null) __obj.updateDynamic("primaryOpacity")(primaryOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryOpacity != null) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLoaderProps]
  }
}

