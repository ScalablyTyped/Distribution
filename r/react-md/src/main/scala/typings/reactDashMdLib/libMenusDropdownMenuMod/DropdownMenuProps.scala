package typings
package reactDashMdLib.libMenusDropdownMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps extends SharedDropdownMenuProps {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

object DropdownMenuProps {
  @scala.inline
  def apply(
    anchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    belowAnchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    cascading: js.UndefOr[scala.Boolean] = js.undefined,
    cascadingAnchor: reactDashMdLib.Anon_XY = null,
    cascadingZDepth: scala.Int | scala.Double = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    className: java.lang.String = null,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportWidth: js.UndefOr[scala.Boolean] = js.undefined,
    fixedTo: js.Object | reactDashMdLib.Anon_X = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    id: reactDashMdLib.libMod.IdPropType = null,
    listClassName: java.lang.String = null,
    listHeightRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    listId: reactDashMdLib.libMod.IdPropType = null,
    listInline: js.UndefOr[scala.Boolean] = js.undefined,
    listProps: js.Object = null,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    listZDepth: scala.Int | scala.Double = null,
    menuItems: scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactNode | (js.Array[
      scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactNode
    ]) = null,
    minBottom: scala.Double | java.lang.String = null,
    minLeft: scala.Double | java.lang.String = null,
    minRight: scala.Double | java.lang.String = null,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDrag: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnter: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragExit: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragLeave: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragOver: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDrop: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onFocus: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onKeyUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOut: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOver: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onVisibilityChange: js.Function2[
      /* visible */ scala.Boolean, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    position: reactDashMdLib.libHelpersLayoverMod.LayoverPositions = null,
    repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    repositionOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    sameWidth: js.UndefOr[scala.Boolean] = js.undefined,
    simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xThreshold: scala.Int | scala.Double = null,
    yThreshold: scala.Int | scala.Double = null
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (belowAnchor != null) __obj.updateDynamic("belowAnchor")(belowAnchor)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (!js.isUndefined(cascading)) __obj.updateDynamic("cascading")(cascading)
    if (cascadingAnchor != null) __obj.updateDynamic("cascadingAnchor")(cascadingAnchor)
    if (cascadingZDepth != null) __obj.updateDynamic("cascadingZDepth")(cascadingZDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(fillViewportHeight)) __obj.updateDynamic("fillViewportHeight")(fillViewportHeight)
    if (!js.isUndefined(fillViewportWidth)) __obj.updateDynamic("fillViewportWidth")(fillViewportWidth)
    if (fixedTo != null) __obj.updateDynamic("fixedTo")(fixedTo.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (!js.isUndefined(listHeightRestricted)) __obj.updateDynamic("listHeightRestricted")(listHeightRestricted)
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(listInline)) __obj.updateDynamic("listInline")(listInline)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (listZDepth != null) __obj.updateDynamic("listZDepth")(listZDepth.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (minBottom != null) __obj.updateDynamic("minBottom")(minBottom.asInstanceOf[js.Any])
    if (minLeft != null) __obj.updateDynamic("minLeft")(minLeft.asInstanceOf[js.Any])
    if (minRight != null) __obj.updateDynamic("minRight")(minRight.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(onVisibilityChange)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(repositionOnResize)) __obj.updateDynamic("repositionOnResize")(repositionOnResize)
    if (!js.isUndefined(repositionOnScroll)) __obj.updateDynamic("repositionOnScroll")(repositionOnScroll)
    if (!js.isUndefined(sameWidth)) __obj.updateDynamic("sameWidth")(sameWidth)
    if (!js.isUndefined(simplifiedMenu)) __obj.updateDynamic("simplifiedMenu")(simplifiedMenu)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xThreshold != null) __obj.updateDynamic("xThreshold")(xThreshold.asInstanceOf[js.Any])
    if (yThreshold != null) __obj.updateDynamic("yThreshold")(yThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

