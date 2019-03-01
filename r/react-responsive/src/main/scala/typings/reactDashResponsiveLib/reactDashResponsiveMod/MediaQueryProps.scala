package typings
package reactDashResponsiveLib.reactDashResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryProps extends MediaQueryAllQueryable {
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* matches */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[
    java.lang.String | reactLib.reactMod.ReactNs.SFC[_] | (reactLib.reactMod.ReactNs.ClassType[_, _, _]) | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState])
  ] = js.undefined
  var onBeforeChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit]] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var values: js.UndefOr[stdLib.Partial[MediaQueryMatchers]] = js.undefined
}

object MediaQueryProps {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    aspectRatio: java.lang.String = null,
    aural: js.UndefOr[scala.Boolean] = js.undefined,
    braille: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* matches */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode]) = null,
    className: java.lang.String = null,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    colorIndex: js.UndefOr[scala.Boolean] = js.undefined,
    component: java.lang.String | reactLib.reactMod.ReactNs.SFC[_] | (reactLib.reactMod.ReactNs.ClassType[_, _, _]) | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) = null,
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
    onBeforeChange: js.Function1[/* matches */ scala.Boolean, scala.Unit] = null,
    onChange: js.Function1[/* matches */ scala.Boolean, scala.Unit] = null,
    orientation: reactDashResponsiveLib.reactDashResponsiveLibStrings.portrait | reactDashResponsiveLib.reactDashResponsiveLibStrings.landscape = null,
    print: js.UndefOr[scala.Boolean] = js.undefined,
    projection: js.UndefOr[scala.Boolean] = js.undefined,
    query: java.lang.String = null,
    resolution: scala.Double | java.lang.String = null,
    scan: reactDashResponsiveLib.reactDashResponsiveLibStrings.progressive | reactDashResponsiveLib.reactDashResponsiveLibStrings.interlace = null,
    screen: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tty: js.UndefOr[scala.Boolean] = js.undefined,
    tv: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: MediaQueryType = null,
    values: stdLib.Partial[MediaQueryMatchers] = null,
    width: scala.Double | java.lang.String = null
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
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(onBeforeChange)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
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

