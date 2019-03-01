package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var buildPath: js.UndefOr[
    js.Function3[/* start */ Point, /* end */ Point, /* line */ Line, java.lang.String]
  ] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var preserveMarkerAspect: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashSimpleDashMapsLib.Anon_Default] = js.undefined
  var tabable: js.UndefOr[scala.Boolean] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    buildPath: js.Function3[/* start */ Point, /* end */ Point, /* line */ Line, java.lang.String] = null,
    line: Line = null,
    onBlur: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ] = null,
    onClick: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onFocus: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    preserveMarkerAspect: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashSimpleDashMapsLib.Anon_Default = null,
    tabable: js.UndefOr[scala.Boolean] = js.undefined
  ): LineProps = {
    val __obj = js.Dynamic.literal()
    if (buildPath != null) __obj.updateDynamic("buildPath")(buildPath)
    if (line != null) __obj.updateDynamic("line")(line)
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
    __obj.asInstanceOf[LineProps]
  }
}

