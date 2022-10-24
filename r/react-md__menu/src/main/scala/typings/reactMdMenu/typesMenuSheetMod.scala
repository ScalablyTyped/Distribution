package typings.reactMdMenu

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactMdMenu.typesTypesMod.MenuListProps
import typings.reactMdMenu.typesTypesMod.MenuOrientationProps
import typings.reactMdSheet.typesSheetMod.BaseSheetProps
import typings.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusArg
import typings.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHandler
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuSheetMod {
  
  @JSImport("@react-md/menu/types/MenuSheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuSheet(param0: LabelRequiredForA11y[MenuSheetProps]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuSheet")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusCallbacks because var conflicts: onFocus, onKeyDown. Inlined onJumpToFirst, onSearch, onIncrement, onDecrement, onJumpToLast
  - typings.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookOptions because var conflicts: onFocus, onKeyDown. Inlined onFocusChange, getDefaultFocusIndex */ trait MenuSheetProps
    extends StObject
       with BaseSheetProps
       with MenuOrientationProps
       with MenuListProps {
    
    /**
      * The `Menu`s children.
      */
    @JSName("children")
    var children_MenuSheetProps: ReactNode
    
    /** {@inheritDoc MenuConfiguration.sheetFooter} */
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * A function that can be used to get the default focus index when the
      * container element first gains focus. If this returns `-1`, no child element
      * will be focused and the container will maintain focus instead.
      *
      * @param elements - The current list of elements that can be focused within
      * the container element
      * @param container - The container element that gained focus
      */
    var getDefaultFocusIndex: js.UndefOr[js.Function2[/* elements */ js.Array[HTMLElement], HTMLDivElement, Double]] = js.undefined
    
    /** {@inheritDoc MenuConfiguration.sheetHeader} */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props that should be passed to the `Menu` component.
      */
    var menuProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * This should be the `menuRef` returned by the `useMenu` hook so that the
      * menu can be focused on mount.
      */
    var menuRef: Ref[HTMLDivElement]
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.decrementKeys} are pressed.
      */
    var onDecrement: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * An optional function to call when the custom focused element should change.
      * The default value is just to call `element.focus()`.
      *
      * @param element - The element that should gain custom focus
      * @param nextFocusIndex - The next focus index which can be used for
      * additional movement behavior.
      */
    var onFocusChange: js.UndefOr[js.Function2[/* element */ HTMLElement, /* nextFocusIndex */ Double, Unit]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.incrementKeys} are pressed.
      */
    var onIncrement: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.jumpToFirstKeys} are pressed.
      */
    var onJumpToFirst: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.jumpToLastKeys} are pressed.
      */
    var onJumpToLast: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * This is called whenever a single letter has been pressed and
      * {@link KeyboardMovementBehavior.searchable} is `true`.
      */
    var onSearch: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
  }
  object MenuSheetProps {
    
    inline def apply(id: String, onRequestClose: () => Unit, visible: Boolean): MenuSheetProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any], menuRef = null)
      __obj.asInstanceOf[MenuSheetProps]
    }
    
    extension [Self <: MenuSheetProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGetDefaultFocusIndex(value: (/* elements */ js.Array[HTMLElement], HTMLDivElement) => Double): Self = StObject.set(x, "getDefaultFocusIndex", js.Any.fromFunction2(value))
      
      inline def setGetDefaultFocusIndexUndefined: Self = StObject.set(x, "getDefaultFocusIndex", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMenuProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      inline def setMenuRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
      
      inline def setMenuRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "menuRef", js.Any.fromFunction1(value))
      
      inline def setMenuRefNull: Self = StObject.set(x, "menuRef", null)
      
      inline def setOnDecrement(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Unit): Self = StObject.set(x, "onDecrement", js.Any.fromFunction1(value))
      
      inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
      
      inline def setOnFocusChange(value: (/* element */ HTMLElement, /* nextFocusIndex */ Double) => Unit): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction2(value))
      
      inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
      
      inline def setOnIncrement(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Unit): Self = StObject.set(x, "onIncrement", js.Any.fromFunction1(value))
      
      inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
      
      inline def setOnJumpToFirst(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Unit): Self = StObject.set(x, "onJumpToFirst", js.Any.fromFunction1(value))
      
      inline def setOnJumpToFirstUndefined: Self = StObject.set(x, "onJumpToFirst", js.undefined)
      
      inline def setOnJumpToLast(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Unit): Self = StObject.set(x, "onJumpToLast", js.Any.fromFunction1(value))
      
      inline def setOnJumpToLastUndefined: Self = StObject.set(x, "onJumpToLast", js.undefined)
      
      inline def setOnSearch(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
}
