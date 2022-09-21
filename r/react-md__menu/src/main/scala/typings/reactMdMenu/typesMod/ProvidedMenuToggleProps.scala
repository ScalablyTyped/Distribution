package typings.reactMdMenu.typesMod

import typings.react.mod.Booleanish
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactMdMenu.reactMdMenuStrings.dialog
import typings.reactMdMenu.reactMdMenuStrings.grid
import typings.reactMdMenu.reactMdMenuStrings.listbox
import typings.reactMdMenu.reactMdMenuStrings.menu
import typings.reactMdMenu.reactMdMenuStrings.tree
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvidedMenuToggleProps[E /* <: HTMLElement */] extends StObject {
  
  /**
    * This will be set to `true` only while the menu is `visible`.
    */
  var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * This will always be set to `"menu"`.
    */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  /**
    * This will be set to `${baseId}-toggle` and is used for providing an
    * accessible label to the menu if the {@link BaseMenuHookOptions.menuLabel}
    * was not provided.
    *
    * @see {@link BaseMenuHookOptions.baseId}
    */
  var id: String
  
  /**
    * A click handler that will toggle the visibility of the menu.
    *
    * @see {@link HoverModeHookReturnValue.onClick}
    */
  var onClick: MouseEventHandler[E]
  
  /**
    * The event handler will allow the menu to become visible by with `ArrowUp`
    * or `ArrowDown` for horizontal menus and `ArrowLeft` or `ArrowRight` for
    * vertical menus. This will also allow the focus to move between menus within
    * a `MenuBar` with the `ArrowLeft` and `ArrowRight` keys.
    */
  var onKeyDown: KeyboardEventHandler[E]
  
  /**
    * The event handler will allow a `Menu` within a `MenuBar` to gain
    * visibility.
    */
  var onMouseEnter: MouseEventHandler[E]
  
  /**
    * This handler just cancels the `hoverTimeout` from the `MenuBar`.
    */
  var onMouseLeave: MouseEventHandler[E]
}
object ProvidedMenuToggleProps {
  
  inline def apply[E /* <: HTMLElement */](
    id: String,
    onClick: MouseEvent[E, NativeMouseEvent] => Unit,
    onKeyDown: KeyboardEvent[E] => Unit,
    onMouseEnter: MouseEvent[E, NativeMouseEvent] => Unit,
    onMouseLeave: MouseEvent[E, NativeMouseEvent] => Unit
  ): ProvidedMenuToggleProps[E] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[ProvidedMenuToggleProps[E]]
  }
  
  extension [Self <: ProvidedMenuToggleProps[?], E /* <: HTMLElement */](x: Self & ProvidedMenuToggleProps[E]) {
    
    inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnter(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeave(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
  }
}
