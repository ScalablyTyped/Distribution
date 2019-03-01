package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var marker: js.UndefOr[MarkerType] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGGElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGGElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var preserveMarkerAspect: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashSimpleDashMapsLib.Anon_Default] = js.undefined
  var tabable: js.UndefOr[scala.Boolean] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    marker: MarkerType = null,
    onBlur: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGGElement], 
      scala.Unit
    ] = null,
    onClick: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onFocus: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGGElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function2[
      /* marker */ MarkerType, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    preserveMarkerAspect: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashSimpleDashMapsLib.Anon_Default = null,
    tabable: js.UndefOr[scala.Boolean] = js.undefined
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (!js.isUndefined(preserveMarkerAspect)) __obj.updateDynamic("preserveMarkerAspect")(preserveMarkerAspect)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable)
    __obj.asInstanceOf[MarkerProps]
  }
}

