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
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
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
    onBlur: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ] = null,
    onClick: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onFocus: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function2[
      /* geography */ js.Object, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    precision: scala.Int | scala.Double = null,
    projection: d3DashGeoLib.d3DashGeoMod.GeoProjection = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashSimpleDashMapsLib.Anon_Default = null,
    tabable: js.UndefOr[scala.Boolean] = js.undefined
  ): GeographyProps = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (geography != null) __obj.updateDynamic("geography")(geography)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable)
    __obj.asInstanceOf[GeographyProps]
  }
}

