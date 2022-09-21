package typings.reactMdMenu.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.reactMdTransition.typesMod.FixedPositioningScrollData
import typings.reactMdTransition.typesMod.FixedPositioningTransitionCallbacks
import typings.reactMdTransition.typesMod.TransitionScrollCallback
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuHookOptions
  extends StObject
     with DropdownMenuConfigurationProps
     with MenuOrientationProps
     with FixedPositioningTransitionCallbacks {
  
  /**
    * This is the `id` for the toggle element for a `DropdownMenu` that is
    * required for a11y. This is used to also create the `Menu` component's `id`
    * as `${baseId}-menu`.
    */
  var baseId: String
  
  /**
    * Boolean if the menu is being rendered as a menuitem instead of a button.
    * Setting this to `true` implements the
    * {@link ProvidedMenuToggleProps.onKeyDown} functionality.
    *
    * @defaultValue `false`
    */
  var menuitem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional function to call if the page resizes while the menu is visible.
    */
  var onFixedPositionResize: js.UndefOr[EventListener] = js.undefined
  
  /** {@inheritDoc TransitionScrollCallback} */
  var onFixedPositionScroll: js.UndefOr[TransitionScrollCallback[HTMLElement, HTMLDivElement]] = js.undefined
  
  /**
    * This should be the second argument for the `useState` hook.
    *
    * ```ts
    * const [visible, setVisible] = useState(false);
    * ```
    *
    * This is used to update the visibility of the menu based on click and
    * keyboard events.
    */
  var setVisible: Dispatch[SetStateAction[Boolean]]
  
  /**
    * An optional style object to merge with the `Menu`'s fixed positioning
    * style.
    *
    * @see {@link useFixedPositioning}
    * @see {@link FixedPositionStyle}
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Boolean if the menu is currently visible.
    */
  var visible: Boolean
}
object BaseMenuHookOptions {
  
  inline def apply(baseId: String, setVisible: SetStateAction[Boolean] => Unit, visible: Boolean): BaseMenuHookOptions = {
    val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuHookOptions]
  }
  
  extension [Self <: BaseMenuHookOptions](x: Self) {
    
    inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
    
    inline def setMenuitem(value: Boolean): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
    
    inline def setMenuitemUndefined: Self = StObject.set(x, "menuitem", js.undefined)
    
    inline def setOnFixedPositionResize(value: /* evt */ Event => Unit): Self = StObject.set(x, "onFixedPositionResize", js.Any.fromFunction1(value))
    
    inline def setOnFixedPositionResizeUndefined: Self = StObject.set(x, "onFixedPositionResize", js.undefined)
    
    inline def setOnFixedPositionScroll(
      value: (/* event */ Event, /* data */ FixedPositioningScrollData[HTMLElement, HTMLDivElement]) => Unit
    ): Self = StObject.set(x, "onFixedPositionScroll", js.Any.fromFunction2(value))
    
    inline def setOnFixedPositionScrollUndefined: Self = StObject.set(x, "onFixedPositionScroll", js.undefined)
    
    inline def setSetVisible(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
