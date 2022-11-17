package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuHeaderMod.MenuHeaderProps
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuMenuMod.MenuMenuProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMenuMenuMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", JSImport.Default)
  @js.native
  open class default protected () extends Component[MenuProps, ComponentState, Any] {
    def this(props: MenuProps) = this()
    def this(props: MenuProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", JSImport.Default)
    @js.native
    val ^ : MenuComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", "default.Header")
    @js.native
    open class Header protected () extends Component[MenuHeaderProps, ComponentState, Any] {
      def this(props: MenuHeaderProps) = this()
      def this(props: MenuHeaderProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/Menu", "default.Item")
    @js.native
    open class Item protected () extends Component[MenuItemProps, ComponentState, Any] {
      def this(props: MenuItemProps) = this()
      def this(props: MenuItemProps, context: Any) = this()
    }
    
    type _To = MenuComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MenuComponent = ^
  }
  
  @js.native
  trait MenuComponent
    extends StObject
       with ComponentClass[MenuProps, ComponentState] {
    
    var Header: ComponentClass[MenuHeaderProps, ComponentState] = js.native
    
    var Item: ComponentClass[MenuItemProps, ComponentState] = js.native
    
    var Menu: FC[MenuMenuProps] = js.native
  }
  
  trait MenuProps
    extends StObject
       with StrictMenuProps
       with /* key */ StringDictionary[Any]
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
  }
  
  trait StrictMenuProps extends StObject {
    
    /** Index of the currently active item. */
    var activeIndex: js.UndefOr[Double | String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A menu may be attached to other content segments. */
    var attached: js.UndefOr[Boolean | "bottom" | "top"] = js.undefined
    
    /** A menu item or menu can have no borders. */
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Additional colors can be specified. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** A menu can take up only the space necessary to fit its content. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Initial activeIndex value. */
    var defaultActiveIndex: js.UndefOr[Double | String] = js.undefined
    
    /** A menu can be fixed to a side of its context. */
    var fixed: js.UndefOr["left" | "right" | "bottom" | "top"] = js.undefined
    
    /** A menu can be floated. */
    var floated: js.UndefOr[Boolean | "right"] = js.undefined
    
    /** A vertical menu may take the size of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** A menu may have labeled icons. */
    var icon: js.UndefOr[Boolean | "labeled"] = js.undefined
    
    /** A menu may have its colors inverted to show greater contrast. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand array of props for Menu. */
    var items: js.UndefOr[SemanticShorthandCollection[MenuItemProps]] = js.undefined
    
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
      ] = js.undefined
    
    /** A pagination menu is specially formatted to present links to pages of content. */
    var pagination: js.UndefOr[Boolean] = js.undefined
    
    /** A menu can point to show its relationship to nearby content. */
    var pointing: js.UndefOr[Boolean] = js.undefined
    
    /** A menu can adjust its appearance to de-emphasize its contents. */
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    /** A menu can vary in size. */
    var size: js.UndefOr["mini" | "tiny" | "small" | "large" | "huge" | "massive"] = js.undefined
    
    /** A menu can stack at mobile resolutions. */
    var stackable: js.UndefOr[Boolean] = js.undefined
    
    /** A menu can be formatted to show tabs of information. */
    var tabular: js.UndefOr[Boolean | "right"] = js.undefined
    
    /** A menu can be formatted for text content. */
    var text: js.UndefOr[Boolean] = js.undefined
    
    /** A vertical menu displays elements vertically. */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /** A menu can have its items divided evenly. */
    var widths: js.UndefOr[SemanticWIDTHS] = js.undefined
  }
  object StrictMenuProps {
    
    inline def apply(): StrictMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMenuProps]
    }
    
    extension [Self <: StrictMenuProps](x: Self) {
      
      inline def setActiveIndex(value: Double | String): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | "bottom" | "top"): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDefaultActiveIndex(value: Double | String): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      inline def setFixed(value: "left" | "right" | "bottom" | "top"): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFloated(value: Boolean | "right"): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setIcon(value: Boolean | "labeled"): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[MenuItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[MenuItemProps]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnItemClick(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ MenuItemProps) => Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPointing(value: Boolean): Self = StObject.set(x, "pointing", value.asInstanceOf[js.Any])
      
      inline def setPointingUndefined: Self = StObject.set(x, "pointing", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setSize(value: "mini" | "tiny" | "small" | "large" | "huge" | "massive"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      inline def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      inline def setTabular(value: Boolean | "right"): Self = StObject.set(x, "tabular", value.asInstanceOf[js.Any])
      
      inline def setTabularUndefined: Self = StObject.set(x, "tabular", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWidths(value: SemanticWIDTHS): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
}
