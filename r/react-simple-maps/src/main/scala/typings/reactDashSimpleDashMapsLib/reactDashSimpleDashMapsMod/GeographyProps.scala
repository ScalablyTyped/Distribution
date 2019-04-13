package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographyProps extends js.Object {
  var cacheId: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  var geography: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[d3DashGeoLib.d3DashGeoMod.GeoProjection] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashSimpleDashMapsLib.Anon_Default] = js.undefined
  var tabable: js.UndefOr[scala.Boolean] = js.undefined
}

object GeographyProps {
  @scala.inline
  def apply(
    cacheId: scala.Double | java.lang.String = null,
    geography: js.Object = null,
    onBlur: (/* geography */ js.Object, /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement]) => scala.Unit = null,
    onClick: (/* geography */ js.Object, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onFocus: (/* geography */ js.Object, /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement]) => scala.Unit = null,
    onMouseDown: (/* geography */ js.Object, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseEnter: (/* geography */ js.Object, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseLeave: (/* geography */ js.Object, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseMove: (/* geography */ js.Object, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseUp: (/* geography */ js.Object, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    precision: scala.Int | scala.Double = null,
    projection: d3DashGeoLib.d3DashGeoMod.GeoProjection = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashSimpleDashMapsLib.Anon_Default = null,
    tabable: js.UndefOr[scala.Boolean] = js.undefined
  ): GeographyProps = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (geography != null) __obj.updateDynamic("geography")(geography)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable)
    __obj.asInstanceOf[GeographyProps]
  }
}

