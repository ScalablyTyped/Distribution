package typings.reactMdMenu.dropdownMenuMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactMdMenu.defaultMenuItemRendererMod.MenuItemRenderer
import typings.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem
import typings.reactMdMenu.defaultMenuRendererMod.InjectedMenuProps
import typings.reactMdMenu.defaultMenuRendererMod.MenuPositionProps
import typings.reactMdMenu.defaultMenuRendererMod.MenuRenderer
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseDropdownMenuProps
  extends MenuPositionProps
     with RenderConditionalPortalProps {
  
  /**
    * Boolean if the menu should be visible immediately once this component
    * mounts.
    */
  var defaultVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The id to use for the menu button and used to create the id for the menu.
    * The menu's id will just be `${id}-menu`.
    */
  var id: String = js.native
  
  /**
    * A function to call for each `item` in the `items` list to render a
    * ReactElement.
    */
  var itemRenderer: js.UndefOr[MenuItemRenderer] = js.native
  
  /**
    * A list of menu items to render. Each item will be passed to the
    * `menuItemRenderer` function.
    */
  var items: js.Array[ValidMenuItem] = js.native
  
  /**
    * An optional className to pass to the `menuRenderer`/`Menu` component.
    */
  var menuClassName: js.UndefOr[String] = js.native
  
  /**
    * The label to use for the menu. Either this or the `menuLabelledBy` props
    * are required for a11y.
    */
  var menuLabel: js.UndefOr[String] = js.native
  
  /**
    * The id for an element to label the menu. Either this or the `menuLabel`
    * props are required for a11y. This will be defaulted to the `id` of the menu
    * button for convenience since it _should_ normally label the menu but should
    * be changed if it does not.
    */
  var menuLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * A custom menu renderer to use. This defaults to just rendering the `Menu`
    * component with the base required props and a generated id from the button
    * id.
    */
  var menuRenderer: js.UndefOr[MenuRenderer] = js.native
  
  /**
    * An optional style object to pass to the `menuRenderer`/`Menu` component.
    */
  var menuStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * An optional function to call when the visibility of the menu changes.
    */
  var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
}
object BaseDropdownMenuProps {
  
  @scala.inline
  def apply(id: String, items: js.Array[ValidMenuItem]): BaseDropdownMenuProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDropdownMenuProps]
  }
  
  @scala.inline
  implicit class BaseDropdownMenuPropsOps[Self <: BaseDropdownMenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ValidMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ValidMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = this.set("defaultVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVisible: Self = this.set("defaultVisible", js.undefined)
    
    @scala.inline
    def setItemRenderer(value: (/* item */ ValidMenuItem, /* key */ String) => ReactNode): Self = this.set("itemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemRenderer: Self = this.set("itemRenderer", js.undefined)
    
    @scala.inline
    def setMenuClassName(value: String): Self = this.set("menuClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuClassName: Self = this.set("menuClassName", js.undefined)
    
    @scala.inline
    def setMenuLabel(value: String): Self = this.set("menuLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuLabel: Self = this.set("menuLabel", js.undefined)
    
    @scala.inline
    def setMenuLabelledBy(value: String): Self = this.set("menuLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuLabelledBy: Self = this.set("menuLabelledBy", js.undefined)
    
    @scala.inline
    def setMenuRenderer(value: (/* props */ InjectedMenuProps, /* items */ js.Array[ValidMenuItem]) => ReactNode): Self = this.set("menuRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMenuRenderer: Self = this.set("menuRenderer", js.undefined)
    
    @scala.inline
    def setMenuStyle(value: CSSProperties): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
    
    @scala.inline
    def setOnVisibilityChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibilityChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVisibilityChange: Self = this.set("onVisibilityChange", js.undefined)
  }
}
