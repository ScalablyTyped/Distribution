package typings
package reactDashMdLib.libMenusMenuButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashMdLib.libInksInjectInkMod.InjectedInkProps because Would inherit conflicting mutable fields List(className, disabled, onBlur, onClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onFocus, onKeyDown, onKeyUp, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, style))*/
trait MenuButtonProps
  extends reactDashMdLib.libMenusDropdownMenuMod.SharedDropdownMenuProps
     with reactDashMdLib.libButtonsButtonMod.SharedButtonProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps {
  /**
    * @deprecated
    * */
  var buttonChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    * */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    * */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var onMenuBlur: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
  var onMenuClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuFocus: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
  var onMenuKeyDown: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuKeyUp: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuMouseDown: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuMouseEnter: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuMouseLeave: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuMouseMove: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuMouseUp: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * @deprecated
    * */
  var onMenuToggle: js.UndefOr[js.Function] = js.undefined
  var onMenuTouchCancel: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
  var onMenuTouchEnd: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
  var onMenuTouchMove: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
  var onMenuTouchStart: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
}

