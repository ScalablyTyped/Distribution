package typings.reactDashContentDashLoader.reactDashContentDashLoaderMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMax meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMax slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMid meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMid slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMin meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMin slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMax meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMax slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMid meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMid slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMin meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMin slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMax meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMax slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMid meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMid slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMin meet`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMin slice`
import typings.reactDashContentDashLoader.reactDashContentDashLoaderStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentLoaderProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var gradientRatio: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[
    none | (`xMinYMin meet`) | (`xMidYMin meet`) | (`xMaxYMin meet`) | (`xMinYMid meet`) | (`xMidYMid meet`) | (`xMaxYMid meet`) | (`xMinYMax meet`) | (`xMidYMax meet`) | (`xMaxYMax meet`) | (`xMinYMin slice`) | (`xMidYMin slice`) | (`xMaxYMin slice`) | (`xMinYMid slice`) | (`xMidYMid slice`) | (`xMaxYMid slice`) | (`xMinYMax slice`) | (`xMidYMax slice`) | (`xMaxYMax slice`)
  ] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var primaryOpacity: js.UndefOr[Double] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var secondaryOpacity: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var uniquekey: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IContentLoaderProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    baseUrl: String = null,
    children: ReactNode = null,
    className: String = null,
    gradientRatio: Int | Double = null,
    height: Int | Double = null,
    interval: Int | Double = null,
    preserveAspectRatio: none | (`xMinYMin meet`) | (`xMidYMin meet`) | (`xMaxYMin meet`) | (`xMinYMid meet`) | (`xMidYMid meet`) | (`xMaxYMid meet`) | (`xMinYMax meet`) | (`xMidYMax meet`) | (`xMaxYMax meet`) | (`xMinYMin slice`) | (`xMidYMin slice`) | (`xMaxYMin slice`) | (`xMinYMid slice`) | (`xMidYMid slice`) | (`xMaxYMid slice`) | (`xMinYMax slice`) | (`xMidYMax slice`) | (`xMaxYMax slice`) = null,
    primaryColor: String = null,
    primaryOpacity: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null,
    secondaryOpacity: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
    uniquekey: String = null,
    width: Int | Double = null
  ): IContentLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (gradientRatio != null) __obj.updateDynamic("gradientRatio")(gradientRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (primaryOpacity != null) __obj.updateDynamic("primaryOpacity")(primaryOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryOpacity != null) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLoaderProps]
  }
}

