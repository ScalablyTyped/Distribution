package typings
package reactDashContentDashLoaderLib.reactDashContentDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentLoaderProps extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[
    reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.none | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMin meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMin meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMin meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMid meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMid meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMid meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMax meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMax meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMax meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMin slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMin slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMin slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMid slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMid slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMid slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMax slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMax slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMax slice`)
  ] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
  var primaryOpacity: js.UndefOr[scala.Double] = js.undefined
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryOpacity: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var uniquekey: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ContentLoaderProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    ariaLabel: java.lang.String = null,
    className: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    preserveAspectRatio: reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.none | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMin meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMin meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMin meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMid meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMid meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMid meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMax meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMax meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMax meet`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMin slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMin slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMin slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMid slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMid slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMid slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMinYMax slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMidYMax slice`) | (reactDashContentDashLoaderLib.reactDashContentDashLoaderLibStrings.`xMaxYMax slice`) = null,
    primaryColor: java.lang.String = null,
    primaryOpacity: scala.Int | scala.Double = null,
    secondaryColor: java.lang.String = null,
    secondaryOpacity: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    uniquekey: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ContentLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (primaryOpacity != null) __obj.updateDynamic("primaryOpacity")(primaryOpacity.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    if (secondaryOpacity != null) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLoaderProps]
  }
}

