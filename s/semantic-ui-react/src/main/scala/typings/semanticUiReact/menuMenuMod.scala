package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typings.semanticUiReact.menuItemMod.MenuItemProps
import typings.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.labeled
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMenuMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MenuProps, ComponentState, js.Any] {
    def this(props: MenuProps) = this()
    def this(props: MenuProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", JSImport.Default)
    @js.native
    val ^ : MenuComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", "default.Header")
    @js.native
    class Header protected ()
      extends Component[MenuHeaderProps, ComponentState, js.Any] {
      def this(props: MenuHeaderProps) = this()
      def this(props: MenuHeaderProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", "default.Item")
    @js.native
    class Item protected ()
      extends Component[MenuItemProps, ComponentState, js.Any] {
      def this(props: MenuItemProps) = this()
      def this(props: MenuItemProps, context: js.Any) = this()
    }
    
    type _To = MenuComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MenuComponent = ^
  }
  
  @js.native
  trait MenuComponent extends ComponentClass[MenuProps, ComponentState] {
    
    var Header: ComponentClass[MenuHeaderProps, ComponentState] = js.native
    
    var Item: ComponentClass[MenuItemProps, ComponentState] = js.native
    
    var Menu: StatelessComponent[MenuMenuProps] = js.native
  }
  
  @js.native
  trait MenuProps
    extends StrictMenuProps
       with /* key */ StringDictionary[js.Any]
  object MenuProps {
    
    @scala.inline
    def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
  }
  
  @js.native
  trait StrictMenuProps extends StObject {
    
    /** Index of the currently active item. */
    var activeIndex: js.UndefOr[Double | String] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A menu may be attached to other content segments. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.native
    
    /** A menu item or menu can have no borders. */
    var borderless: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Additional colors can be specified. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** A menu can take up only the space necessary to fit its content. */
    var compact: js.UndefOr[Boolean] = js.native
    
    /** Initial activeIndex value. */
    var defaultActiveIndex: js.UndefOr[Double | String] = js.native
    
    /** A menu can be fixed to a side of its context. */
    var fixed: js.UndefOr[left | right | bottom | top] = js.native
    
    /** A menu can be floated. */
    var floated: js.UndefOr[Boolean | right] = js.native
    
    /** A vertical menu may take the size of its container. */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /** A menu may have labeled icons. */
    var icon: js.UndefOr[Boolean | labeled] = js.native
    
    /** A menu may have its colors inverted to show greater contrast. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Shorthand array of props for Menu. */
    var items: js.UndefOr[SemanticShorthandCollection[MenuItemProps]] = js.native
    
    /**
      * onClick handler for MenuItem. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onItemClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ MenuItemProps, 
          Unit
        ]
      ] = js.native
    
    /** A pagination menu is specially formatted to present links to pages of content. */
    var pagination: js.UndefOr[Boolean] = js.native
    
    /** A menu can point to show its relationship to nearby content. */
    var pointing: js.UndefOr[Boolean] = js.native
    
    /** A menu can adjust its appearance to de-emphasize its contents. */
    var secondary: js.UndefOr[Boolean] = js.native
    
    /** A menu can vary in size. */
    var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.native
    
    /** A menu can stack at mobile resolutions. */
    var stackable: js.UndefOr[Boolean] = js.native
    
    /** A menu can be formatted to show tabs of information. */
    var tabular: js.UndefOr[Boolean | right] = js.native
    
    /** A menu can be formatted for text content. */
    var text: js.UndefOr[Boolean] = js.native
    
    /** A vertical menu displays elements vertically. */
    var vertical: js.UndefOr[Boolean] = js.native
    
    /** A menu can have its items divided evenly. */
    var widths: js.UndefOr[SemanticWIDTHS] = js.native
  }
  object StrictMenuProps {
    
    @scala.inline
    def apply(): StrictMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMenuProps]
    }
    
    @scala.inline
    implicit class StrictMenuPropsMutableBuilder[Self <: StrictMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double | String): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDefaultActiveIndex(value: Double | String): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      @scala.inline
      def setFixed(value: left | right | bottom | top): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFloated(value: Boolean | right): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setIcon(value: Boolean | labeled): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[MenuItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[MenuItemProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnItemClick(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ MenuItemProps) => Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPointing(value: Boolean): Self = StObject.set(x, "pointing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointingUndefined: Self = StObject.set(x, "pointing", js.undefined)
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      @scala.inline
      def setTabular(value: Boolean | right): Self = StObject.set(x, "tabular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabularUndefined: Self = StObject.set(x, "tabular", js.undefined)
      
      @scala.inline
      def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWidths(value: SemanticWIDTHS): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
}
