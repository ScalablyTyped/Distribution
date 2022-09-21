package typings.reactMdMenu

import typings.react.mod.Dispatch
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.reactMdMenu.anon.ReadonlyMenuBarContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuBarProviderMod {
  
  @JSImport("@react-md/menu/types/MenuBarProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuBarProvider(hasChildrenRootDefaultActiveIdHoverTimeout: MenuBarProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBarProvider")(hasChildrenRootDefaultActiveIdHoverTimeout.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useMenuBarContext(): ReadonlyMenuBarContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuBarContext")().asInstanceOf[ReadonlyMenuBarContext]
  
  trait HoverableMenuBar extends StObject {
    
    /**
      * When this is provided and a number greater than 0, this will allow the
      * menus to become visible on hover without clicking a `MenuItemButton`
      * beforehand. Instead, hovering over a `MenuItemButton` for this time in
      * milliseconds will display the `Menu`.
      */
    var hoverTimeout: js.UndefOr[Double] = js.undefined
  }
  object HoverableMenuBar {
    
    inline def apply(): HoverableMenuBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverableMenuBar]
    }
    
    extension [Self <: HoverableMenuBar](x: Self) {
      
      inline def setHoverTimeout(value: Double): Self = StObject.set(x, "hoverTimeout", value.asInstanceOf[js.Any])
      
      inline def setHoverTimeoutUndefined: Self = StObject.set(x, "hoverTimeout", js.undefined)
    }
  }
  
  trait MenuBarContext
    extends StObject
       with HoverableMenuBar {
    
    /**
      * This is the current DOM id for the `MenuButton` or `MenuItemButton` this is
      * currently visible within the `MenuBar`. If the `MenuBar` behavior has not
      * been enabled or no `Menu` are visible, this will be an empty string;
      */
    var activeId: String
    
    /**
      * Boolean if at least one menu has finished the enter animation. This is used
      * to disable repeating the enter animation once the user is in hover mode
      * since it is distracting to have to wait `0.2ms` each time a new menu gains
      * visibility.
      */
    var animatedOnce: Boolean
    
    /**
      * Boolean if the `MenuBar` functionality is enabled.
      */
    var menubar: Boolean
    
    /**
      * This isn't tied directly to a `MenuBar`, but this is used to determine if
      * there is a parent `Menu` so the `DropdownMenu` can be rendered as a
      * `MenuItemButton` instead of a `MenuButton`.
      */
    var menuitem: Boolean
    
    /**
      * Boolean if the `MenuBar` is the top-most `MenuBar`. This is just used so
      * that the top-most `DropdownMenu` can render as a `MenuItemButton` instead
      * of a `MenuButton` while maintaining the dropdown icon and keyboard behavior
      * of a `MenuButton`.
      */
    var root: Boolean
    
    /**
      * This is used to manually set the {@link activeId} based on menu visibility.
      */
    var setActiveId: Dispatch[SetStateAction[String]]
    
    /**
      * This should be called with the menu's `onEntered` option so that the
      * {@link animatedOnce} flag can be set to `true`. Once the {@link activeId}
      * becomes an empty string (no visible menus), this should be called again
      * with `false` so that the menu animations are visible.
      */
    var setAnimatedOnce: Dispatch[SetStateAction[Boolean]]
  }
  object MenuBarContext {
    
    inline def apply(
      activeId: String,
      animatedOnce: Boolean,
      menubar: Boolean,
      menuitem: Boolean,
      root: Boolean,
      setActiveId: SetStateAction[String] => Unit,
      setAnimatedOnce: SetStateAction[Boolean] => Unit
    ): MenuBarContext = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], animatedOnce = animatedOnce.asInstanceOf[js.Any], menubar = menubar.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId), setAnimatedOnce = js.Any.fromFunction1(setAnimatedOnce))
      __obj.asInstanceOf[MenuBarContext]
    }
    
    extension [Self <: MenuBarContext](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setAnimatedOnce(value: Boolean): Self = StObject.set(x, "animatedOnce", value.asInstanceOf[js.Any])
      
      inline def setMenubar(value: Boolean): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      inline def setMenuitem(value: Boolean): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSetActiveId(value: SetStateAction[String] => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
      
      inline def setSetAnimatedOnce(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setAnimatedOnce", js.Any.fromFunction1(value))
    }
  }
  
  trait MenuBarProviderProps
    extends StObject
       with HoverableMenuBar {
    
    var children: ReactNode
    
    /**
      * This is used so that when the user is moving through the `MenuBar` while a
      * menu is opened, pressing the `ArrowLeft` or `ArrowRight` key will:
      * - close the current menu
      * - focus the next menu's toggle element
      * - open the next menu's toggle element
      * - move focus to the first menu item
      *
      * This should be set to the `Menu`'s id in that the example above. Otherwise
      * it should be omitted.
      *
      * @defaultValue `""`
      */
    var defaultActiveId: js.UndefOr[String] = js.undefined
    
    /**
      * This should be set to `false` if this is a child of another `Menu`.
      *
      * @defaultValue `true`
      * @see {@link MenuBarContext.root}
      */
    var root: js.UndefOr[Boolean] = js.undefined
  }
  object MenuBarProviderProps {
    
    inline def apply(): MenuBarProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuBarProviderProps]
    }
    
    extension [Self <: MenuBarProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultActiveId(value: String): Self = StObject.set(x, "defaultActiveId", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIdUndefined: Self = StObject.set(x, "defaultActiveId", js.undefined)
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
