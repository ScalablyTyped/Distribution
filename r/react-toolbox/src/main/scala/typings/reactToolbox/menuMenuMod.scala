package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.auto
import typings.reactToolbox.reactToolboxStrings.bottomLeft
import typings.reactToolbox.reactToolboxStrings.bottomRight
import typings.reactToolbox.reactToolboxStrings.static
import typings.reactToolbox.reactToolboxStrings.topLeft
import typings.reactToolbox.reactToolboxStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMenuMod {
  
  @JSImport("react-toolbox/components/menu/Menu", JSImport.Default)
  @js.native
  open class default protected () extends Menu {
    def this(props: MenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu/Menu", "Menu")
  @js.native
  open class Menu protected ()
    extends Component[MenuProps, js.Object, Any] {
    def this(props: MenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuProps, context: Any) = this()
  }
  
  trait MenuProps
    extends StObject
       with Props {
    
    /**
      * If true, the menu will be displayed as opened by default.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Callback that will be called when the menu is being hidden.
      */
    var onHide: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback that will be invoked when a menu item is selected.
      */
    var onSelect: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback that will be invoked when the menu is being shown.
      */
    var onShow: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true the menu wrapper will show an outline with a soft shadow.
      * @default true
      */
    var outline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determine the position of the menu. With static value the menu will be always shown, auto means that the it will decide the opening direction based on the current position. To force a position use topLeft, topRight, bottomLeft, bottomRight.
      * @default static
      */
    var position: js.UndefOr[auto | static | topLeft | topRight | bottomLeft | bottomRight] = js.undefined
    
    /**
      * If true, the menu items will show a ripple effect on click.
      * @default true
      */
    var ripple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the menu will keep a value to highlight the active child item.
      * @default true
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
      */
    var selected: js.UndefOr[Any] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[MenuTheme] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnSelect(value: js.Function): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnShow(value: js.Function): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setPosition(value: auto | static | topLeft | topRight | bottomLeft | bottomRight): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: MenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait MenuTheme extends StObject {
    
    /**
      * Added to the root element when menu is active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root when position is bottom left.
      */
    var bottomLeft: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root when position is bottom right.
      */
    var bottomRight: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element of the menu.
      */
    var menu: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the inner wrapper.
      */
    var menuInner: js.UndefOr[String] = js.undefined
    
    /**
      * Used to draw the outline.
      */
    var outline: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the menu in case if should have ripple.
      */
    var rippled: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root in case its static.
      */
    var static: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root when position is top left.
      */
    var topLeft: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root when position is top right.
      */
    var topRight: js.UndefOr[String] = js.undefined
  }
  object MenuTheme {
    
    inline def apply(): MenuTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuTheme]
    }
    
    extension [Self <: MenuTheme](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuInner(value: String): Self = StObject.set(x, "menuInner", value.asInstanceOf[js.Any])
      
      inline def setMenuInnerUndefined: Self = StObject.set(x, "menuInner", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setRippled(value: String): Self = StObject.set(x, "rippled", value.asInstanceOf[js.Any])
      
      inline def setRippledUndefined: Self = StObject.set(x, "rippled", js.undefined)
      
      inline def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
}
