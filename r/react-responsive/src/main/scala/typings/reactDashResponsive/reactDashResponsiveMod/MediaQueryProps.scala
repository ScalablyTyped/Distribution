package typings.reactDashResponsive.reactDashResponsiveMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClassType
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SFC
import typings.reactDashResponsive.reactDashResponsiveStrings.interlace
import typings.reactDashResponsive.reactDashResponsiveStrings.landscape
import typings.reactDashResponsive.reactDashResponsiveStrings.portrait
import typings.reactDashResponsive.reactDashResponsiveStrings.progressive
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryProps
  extends MediaQueryFeatures
     with MediaQueryTypes {
  var children: js.UndefOr[ReactNode | (js.Function1[/* matches */ Boolean, ReactNode])] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String | SFC[_] | (ClassType[_, _, _]) | (ComponentClass[_, ComponentState])] = js.undefined
  var device: js.UndefOr[MediaQueryMatchers] = js.undefined
  var onBeforeChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var values: js.UndefOr[Partial[MediaQueryMatchers]] = js.undefined
}

object MediaQueryProps {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    aspectRatio: String = null,
    aural: js.UndefOr[Boolean] = js.undefined,
    braille: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode | (js.Function1[/* matches */ Boolean, ReactNode]) = null,
    className: String = null,
    color: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Boolean] = js.undefined,
    component: String | SFC[_] | (ClassType[_, _, _]) | (ComponentClass[_, ComponentState]) = null,
    device: MediaQueryMatchers = null,
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
    onBeforeChange: /* matches */ Boolean => Unit = null,
    onChange: /* matches */ Boolean => Unit = null,
    orientation: portrait | landscape = null,
    print: js.UndefOr[Boolean] = js.undefined,
    projection: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    resolution: Double | String = null,
    scan: progressive | interlace = null,
    screen: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tty: js.UndefOr[Boolean] = js.undefined,
    tv: js.UndefOr[Boolean] = js.undefined,
    `type`: MediaQueryType = null,
    values: Partial[MediaQueryMatchers] = null,
    width: Double | String = null
  ): MediaQueryProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (!js.isUndefined(aural)) __obj.updateDynamic("aural")(aural)
    if (!js.isUndefined(braille)) __obj.updateDynamic("braille")(braille)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device)
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
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (!js.isUndefined(projection)) __obj.updateDynamic("projection")(projection)
    if (query != null) __obj.updateDynamic("query")(query)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tty)) __obj.updateDynamic("tty")(tty)
    if (!js.isUndefined(tv)) __obj.updateDynamic("tv")(tv)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryProps]
  }
}

