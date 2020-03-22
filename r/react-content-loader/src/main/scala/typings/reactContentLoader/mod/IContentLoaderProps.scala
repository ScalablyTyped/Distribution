package typings.reactContentLoader.mod

import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentLoaderProps extends SVGAttributes[SVGElement] {
  var animate: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backgroundOpacity: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var foregroundColor: js.UndefOr[String] = js.undefined
  var foregroundOpacity: js.UndefOr[Double] = js.undefined
  var gradientRatio: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  @JSName("speed")
  var speed_IContentLoaderProps: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var uniqueKey: js.UndefOr[String] = js.undefined
}

object IContentLoaderProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGElement] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    backgroundOpacity: Int | Double = null,
    baseUrl: String = null,
    foregroundColor: String = null,
    foregroundOpacity: Int | Double = null,
    gradientRatio: Int | Double = null,
    interval: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    title: String = null,
    uniqueKey: String = null
  ): IContentLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundOpacity != null) __obj.updateDynamic("backgroundOpacity")(backgroundOpacity.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (foregroundOpacity != null) __obj.updateDynamic("foregroundOpacity")(foregroundOpacity.asInstanceOf[js.Any])
    if (gradientRatio != null) __obj.updateDynamic("gradientRatio")(gradientRatio.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uniqueKey != null) __obj.updateDynamic("uniqueKey")(uniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLoaderProps]
  }
}

