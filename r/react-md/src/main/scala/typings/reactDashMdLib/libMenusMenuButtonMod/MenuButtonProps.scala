package typings
package reactDashMdLib.libMenusMenuButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libInksInjectInkMod.InjectedInkProps because var conflicts: className, disabled, onBlur, onClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onFocus, onKeyDown, onKeyUp, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, style. Inlined inkStyle, inkClassName, inkContainerStyle, inkContainerClassName, inkDisabled, inkTransitionOverlay, inkTransitionEnterTimeout, inkTransitionLeaveTimeout, waitForInkTransition, disabledInteractions */ trait MenuButtonProps
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
  var disabledInteractions: js.UndefOr[js.Array[reactDashMdLib.libInksInjectInkMod.InteractionTypes]] = js.undefined
  var inkClassName: js.UndefOr[java.lang.String] = js.undefined
  var inkContainerClassName: js.UndefOr[java.lang.String] = js.undefined
  var inkContainerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inkDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var inkStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inkTransitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var inkTransitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var inkTransitionOverlay: js.UndefOr[scala.Double] = js.undefined
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
  var waitForInkTransition: js.UndefOr[scala.Boolean] = js.undefined
}

