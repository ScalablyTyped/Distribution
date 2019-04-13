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
      /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent], 
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
    buildPath: (/* start */ Point, /* end */ Point, /* line */ Line) => java.lang.String = null,
    line: Line = null,
    onBlur: (/* line */ Line, /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement]) => scala.Unit = null,
    onClick: (/* line */ Line, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onFocus: (/* line */ Line, /* evt */ reactLib.reactMod.FocusEvent[stdLib.SVGPathElement]) => scala.Unit = null,
    onMouseDown: (/* line */ Line, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseEnter: (/* line */ Line, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseLeave: (/* line */ Line, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseMove: (/* line */ Line, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onMouseUp: (/* line */ Line, /* evt */ reactLib.reactMod.MouseEvent[stdLib.SVGPathElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    preserveMarkerAspect: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashSimpleDashMapsLib.Anon_Default = null,
    tabable: js.UndefOr[scala.Boolean] = js.undefined
  ): LineProps = {
    val __obj = js.Dynamic.literal()
    if (buildPath != null) __obj.updateDynamic("buildPath")(js.Any.fromFunction3(buildPath))
    if (line != null) __obj.updateDynamic("line")(line)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (!js.isUndefined(preserveMarkerAspect)) __obj.updateDynamic("preserveMarkerAspect")(preserveMarkerAspect)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable)
    __obj.asInstanceOf[LineProps]
  }
}

