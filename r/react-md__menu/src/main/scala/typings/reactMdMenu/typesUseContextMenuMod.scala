package typings.reactMdMenu

import typings.react.mod.CSSProperties
import typings.react.mod.Dispatch
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.react.mod.SetStateAction
import typings.reactMdMenu.anon.ReadonlyCalculateFixedPos
import typings.reactMdMenu.typesTypesMod.BaseMenuHookReturnValue
import typings.reactMdMenu.typesTypesMod.ProvidedMenuProps
import typings.reactMdTransition.typesTypesMod.FixedPositioningScrollData
import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import typings.reactMdTransition.typesTypesMod.TransitionScrollCallback
import typings.reactMdUtils.typesPositioningTypesMod.InitialCoords
import typings.reactMdUtils.typesPositioningTypesMod.PositionAnchor
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseContextMenuMod {
  
  @JSImport("@react-md/menu/types/useContextMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useContextMenu(): ContextMenuHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")().asInstanceOf[ContextMenuHookReturnValue]
  inline def useContextMenu(param0: ContextMenuHookOptions): ContextMenuHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")(param0.asInstanceOf[js.Any]).asInstanceOf[ContextMenuHookReturnValue]
  
  /* Inlined parent std.Omit<@react-md/menu.@react-md/menu/types/types.BaseMenuHookOptions, 'baseId' | 'visible' | 'setVisible'> */
  trait ContextMenuHookOptions extends StObject {
    
    var anchor: js.UndefOr[PositionAnchor] = js.undefined
    
    /**
      * Since there can generally only be one context menu visible at a time, this
      * will be defaulted to `"context-menu"` instead of requiring an id like the
      * {@link useMenu} hook. If the default `id` does not work for your use case,
      * it can still be overridden.
      *
      * @defaultValue `"context-menu"`
      * @see {@link BaseMenuHookOptions.baseId}
      */
    var baseId: js.UndefOr[String] = js.undefined
    
    var closeOnResize: js.UndefOr[Boolean] = js.undefined
    
    var closeOnScroll: js.UndefOr[Boolean] = js.undefined
    
    var disableFocusOnMount: js.UndefOr[Boolean] = js.undefined
    
    var disableFocusOnUnmount: js.UndefOr[Boolean] = js.undefined
    
    var fixedPositionOptions: js.UndefOr[ReadonlyCalculateFixedPos] = js.undefined
    
    var getFixedPositionOptions: js.UndefOr[js.Function0[ReadonlyCalculateFixedPos]] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The label _should_ be required for a context menu since there is no valid
      * "toggle" component here to inherit a label from. However, this will be
      * defaulted to `"Context Menu"` for convenience.
      *
      * @defaultValue `"Context Menu"`
      * @see {@link BaseMenuHookOptions.menuLabel}
      */
    var menuLabel: js.UndefOr[String] = js.undefined
    
    var menuitem: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional custom contextmenu event handler that will be merged with the
      * menu visibility behavior. If this function calls `event.stopPropagation()`,
      * the default context menu behavior will not occur.
      */
    var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
    
    var onFixedPositionResize: js.UndefOr[EventListener] = js.undefined
    
    var onFixedPositionScroll: js.UndefOr[TransitionScrollCallback[HTMLElement, HTMLDivElement]] = js.undefined
    
    /**
      * Unlike other menus, context menus will default to no longer allowing the
      * page to be scrolled while visible.
      *
      * @see {@link BaseMenuHookOptions.preventScroll}
      * @defaultValue `true`.
      */
    var preventScroll: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ContextMenuHookOptions {
    
    inline def apply(): ContextMenuHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuHookOptions] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setBaseIdUndefined: Self = StObject.set(x, "baseId", js.undefined)
      
      inline def setCloseOnResize(value: Boolean): Self = StObject.set(x, "closeOnResize", value.asInstanceOf[js.Any])
      
      inline def setCloseOnResizeUndefined: Self = StObject.set(x, "closeOnResize", js.undefined)
      
      inline def setCloseOnScroll(value: Boolean): Self = StObject.set(x, "closeOnScroll", value.asInstanceOf[js.Any])
      
      inline def setCloseOnScrollUndefined: Self = StObject.set(x, "closeOnScroll", js.undefined)
      
      inline def setDisableFocusOnMount(value: Boolean): Self = StObject.set(x, "disableFocusOnMount", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusOnMountUndefined: Self = StObject.set(x, "disableFocusOnMount", js.undefined)
      
      inline def setDisableFocusOnUnmount(value: Boolean): Self = StObject.set(x, "disableFocusOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusOnUnmountUndefined: Self = StObject.set(x, "disableFocusOnUnmount", js.undefined)
      
      inline def setFixedPositionOptions(value: ReadonlyCalculateFixedPos): Self = StObject.set(x, "fixedPositionOptions", value.asInstanceOf[js.Any])
      
      inline def setFixedPositionOptionsUndefined: Self = StObject.set(x, "fixedPositionOptions", js.undefined)
      
      inline def setGetFixedPositionOptions(value: () => ReadonlyCalculateFixedPos): Self = StObject.set(x, "getFixedPositionOptions", js.Any.fromFunction0(value))
      
      inline def setGetFixedPositionOptionsUndefined: Self = StObject.set(x, "getFixedPositionOptions", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setMenuLabel(value: String): Self = StObject.set(x, "menuLabel", value.asInstanceOf[js.Any])
      
      inline def setMenuLabelUndefined: Self = StObject.set(x, "menuLabel", js.undefined)
      
      inline def setMenuitem(value: Boolean): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
      
      inline def setMenuitemUndefined: Self = StObject.set(x, "menuitem", js.undefined)
      
      inline def setOnContextMenu(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnEnter(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnFixedPositionResize(value: /* evt */ Event => Unit): Self = StObject.set(x, "onFixedPositionResize", js.Any.fromFunction1(value))
      
      inline def setOnFixedPositionResizeUndefined: Self = StObject.set(x, "onFixedPositionResize", js.undefined)
      
      inline def setOnFixedPositionScroll(
        value: (/* event */ Event, /* data */ FixedPositioningScrollData[HTMLElement, HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onFixedPositionScroll", js.Any.fromFunction2(value))
      
      inline def setOnFixedPositionScrollUndefined: Self = StObject.set(x, "onFixedPositionScroll", js.undefined)
      
      inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ContextMenuHookReturnValue
    extends StObject
       with BaseMenuHookReturnValue {
    
    /**
      * An event handler that should passed to an element that causes a `Menu` to
      * appear instead of the default browser context menu.
      */
    def onContextMenu[E /* <: HTMLElement */](event: MouseEvent[E, NativeMouseEvent]): Unit
    
    /**
      * This function can be used to manually move the context menu to new
      * coordinates if the default behavior did not work. You probably won't ever
      * need to use this.
      */
    var setCoords: Dispatch[SetStateAction[InitialCoords]]
    
    /**
      * A function that can be used to manually set the visibility of the context
      * menu when the default behavior does not match your use case.
      */
    var setVisible: Dispatch[SetStateAction[Boolean]]
    
    /**
      * Boolean if the context menu is currently visible,
      */
    var visible: Boolean
  }
  object ContextMenuHookReturnValue {
    
    inline def apply(
      menuNodeRef: RefObject[HTMLDivElement],
      menuProps: ProvidedMenuProps,
      onContextMenu: MouseEvent[Any, NativeMouseEvent] => Unit,
      setCoords: SetStateAction[InitialCoords] => Unit,
      setVisible: SetStateAction[Boolean] => Unit,
      visible: Boolean
    ): ContextMenuHookReturnValue = {
      val __obj = js.Dynamic.literal(menuNodeRef = menuNodeRef.asInstanceOf[js.Any], menuProps = menuProps.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), setCoords = js.Any.fromFunction1(setCoords), setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any], menuRef = null)
      __obj.asInstanceOf[ContextMenuHookReturnValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuHookReturnValue] (val x: Self) extends AnyVal {
      
      inline def setOnContextMenu(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setSetCoords(value: SetStateAction[InitialCoords] => Unit): Self = StObject.set(x, "setCoords", js.Any.fromFunction1(value))
      
      inline def setSetVisible(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
