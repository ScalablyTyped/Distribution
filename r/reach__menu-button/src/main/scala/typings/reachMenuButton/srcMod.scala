package typings.reachMenuButton

import typings.reachMenuButton.anon.MenuContextValueisOpenboo
import typings.reachPopover.srcMod.Position
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@reach/menu-button/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Menu
    *
    * The wrapper component for the other components. No DOM element is rendered.
    *
    * @see Docs https://reach.tech/menu-button#menu
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "Menu")
  @js.native
  val Menu: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<any, MenuProps> */ Any = js.native
  
  /**
    * MenuButton
    *
    * Wraps a DOM `button` that toggles the opening and closing of the dropdown
    * menu. Must be rendered inside of a `<Menu>`.
    *
    * @see Docs https://reach.tech/menu-button#menubutton
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "MenuButton")
  @js.native
  val MenuButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'button', MenuButtonProps> */ Any = js.native
  
  /**
    * MenuItem
    *
    * Handles menu selection. Must be a direct child of a `<MenuList>`.
    *
    * @see Docs https://reach.tech/menu-button#menuitem
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "MenuItem")
  @js.native
  val MenuItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuItemProps> */ Any = js.native
  
  /**
    * MenuItems
    *
    * A low-level wrapper for menu items. Compose it with `MenuPopover` for more
    * control over the nested components and their rendered DOM nodes, or if you
    * need to nest arbitrary components between the outer wrapper and your list.
    *
    * @see Docs https://reach.tech/menu-button#menuitems
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "MenuItems")
  @js.native
  val MenuItems: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuItemsProps> */ Any = js.native
  
  /**
    * MenuLink
    *
    * Handles linking to a different page in the menu. By default it renders `<a>`,
    * but also accepts any other kind of Link as long as the `Link` uses the
    * `React.forwardRef` API.
    *
    * Must be a direct child of a `<MenuList>`.
    *
    * @see Docs https://reach.tech/menu-button#menulink
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "MenuLink")
  @js.native
  val MenuLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'a', MenuLinkProps> */ Any = js.native
  
  /**
    * MenuList
    *
    * Wraps a DOM element that renders the menu items. Must be rendered inside of
    * a `<Menu>`.
    *
    * @see Docs https://reach.tech/menu-button#menulist
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "MenuList")
  @js.native
  val MenuList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuListProps> */ Any = js.native
  
  /**
    * MenuPopover
    *
    * A low-level wrapper for the popover that appears when a menu button is open.
    * You can compose it with `MenuItems` for more control over the nested
    * components and their rendered DOM nodes, or if you need to nest arbitrary
    * components between the outer wrapper and your list.
    *
    * @see Docs https://reach.tech/menu-button#menupopover
    */
  @JSImport("@reach/menu-button/dist/declarations/src", "MenuPopover")
  @js.native
  val MenuPopover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuPopoverProps> */ Any = js.native
  
  /**
    * A hook that exposes data for a given `Menu` component to its descendants.
    *
    * @see Docs https://reach.tech/menu-button#usemenubuttoncontext
    */
  inline def useMenuButtonContext(): MenuContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuButtonContext")().asInstanceOf[MenuContextValue]
  
  /**
    * @see Docs https://reach.tech/menu-button#menubutton-props
    */
  trait MenuButtonProps extends StObject {
    
    /**
      * Accepts any renderable content.
      *
      * @see Docs https://reach.tech/menu-button#menubutton-children
      */
    var children: ReactNode
  }
  object MenuButtonProps {
    
    inline def apply(): MenuButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuButtonProps]
    }
    
    extension [Self <: MenuButtonProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait MenuContextValue extends StObject {
    
    var isExpanded: Boolean
  }
  object MenuContextValue {
    
    inline def apply(isExpanded: Boolean): MenuContextValue = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextValue]
    }
    
    extension [Self <: MenuContextValue](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuItemImplProps extends StObject {
    
    /**
      * You can put any type of content inside of a `<MenuItem>`.
      *
      * @see Docs https://reach.tech/menu-button#menuitem-children
      */
    var children: ReactNode
    
    /**
      * Whether or not the item is disabled from selection and navigation.
      *
      * @see Docs https://reach.tech/menu-button#menuitem-disabled
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isLink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that fires when a `MenuItem` is selected.
      *
      * @see Docs https://reach.tech/menu-button#menuitem-onselect
      */
    def onSelect(): Unit
    
    var valueText: js.UndefOr[String] = js.undefined
  }
  object MenuItemImplProps {
    
    inline def apply(onSelect: () => Unit): MenuItemImplProps = {
      val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
      __obj.asInstanceOf[MenuItemImplProps]
    }
    
    extension [Self <: MenuItemImplProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/menu-button#menuitem-props
    */
  /* Inlined std.Omit<@reach/menu-button.@reach/menu-button/dist/declarations/src.MenuItemImplProps, 'isLink'> */
  trait MenuItemProps extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onSelect: js.Function0[Unit]
    
    var valueText: js.UndefOr[String] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(onSelect: () => Unit): MenuItemProps = {
      val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
      __obj.asInstanceOf[MenuItemProps]
    }
    
    extension [Self <: MenuItemProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/menu-button#menuitems-props
    */
  trait MenuItemsProps extends StObject {
    
    /**
      * Can contain only `MenuItem` or a `MenuLink`.
      *
      * @see Docs https://reach.tech/menu-button#menuitems-children
      */
    var children: ReactNode
  }
  object MenuItemsProps {
    
    inline def apply(): MenuItemsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemsProps]
    }
    
    extension [Self <: MenuItemsProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/menu-button#menulink-props
    */
  /* Inlined std.Omit<@reach/menu-button.@reach/menu-button/dist/declarations/src.MenuItemImplProps, 'isLink' | 'onSelect'> & {  onSelect :(): void | undefined} */
  trait MenuLinkProps extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var valueText: js.UndefOr[String] = js.undefined
  }
  object MenuLinkProps {
    
    inline def apply(): MenuLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuLinkProps]
    }
    
    extension [Self <: MenuLinkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/menu-button#menulist-props
    */
  trait MenuListProps extends StObject {
    
    /**
      * Can contain only `MenuItem` or a `MenuLink`.
      *
      * @see Docs https://reach.tech/menu-button#menulist-children
      */
    var children: ReactNode
    
    /**
      * Whether or not the popover should be rendered inside a portal. Defaults to
      * `true`.
      *
      * @see Docs https://reach.tech/menu-button#menulist-portal
      */
    var portal: js.UndefOr[Boolean] = js.undefined
  }
  object MenuListProps {
    
    inline def apply(): MenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListProps]
    }
    
    extension [Self <: MenuListProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/menu-button#menupopover-props
    */
  trait MenuPopoverProps extends StObject {
    
    /**
      * Must contain a `MenuItems`
      *
      * @see Docs https://reach.tech/menu-button#menupopover-children
      */
    var children: ReactNode
    
    /**
      * Whether or not the popover should be rendered inside a portal. Defaults to
      * `true`.
      *
      * @see Docs https://reach.tech/menu-button#menupopover-portal
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function used to determine the position of the popover in relation to the
      * menu button. By default, the menu button will attempt to position the
      * popover below the button aligned with its left edge. If this positioning
      * results in collisions with any side of the window, the popover will be
      * anchored to a different side to avoid those collisions if possible.
      *
      * @see Docs https://reach.tech/menu-button#menupopover-position
      */
    var position: js.UndefOr[Position] = js.undefined
  }
  object MenuPopoverProps {
    
    inline def apply(): MenuPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuPopoverProps]
    }
    
    extension [Self <: MenuPopoverProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/menu-button#menu-props
    */
  trait MenuProps extends StObject {
    
    /**
      * Requires two children: a `<MenuButton>` and a `<MenuList>`.
      *
      * @see Docs https://reach.tech/menu-button#menu-children
      */
    var children: ReactNode | (js.Function1[/* props */ MenuContextValueisOpenboo, ReactNode])
    
    var id: js.UndefOr[String] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ MenuContextValueisOpenboo, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ MenuContextValueisOpenboo => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
