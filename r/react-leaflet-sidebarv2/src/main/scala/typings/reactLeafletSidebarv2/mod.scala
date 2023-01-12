package typings.reactLeafletSidebarv2

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  open class Sidebar protected () extends Component[SidebarProps, Any, Any] {
    def this(props: SidebarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarProps, context: Any) = this()
  }
  
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  open class Tab protected () extends Component[TabProps, Any, Any] {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom
  */
  trait Anchor extends StObject
  object Anchor {
    
    inline def bottom: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom = "bottom".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom]
    
    inline def top: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top = "top".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top]
  }
  
  type Icon = String | ReactElement
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right
  */
  trait Position extends StObject
  object Position {
    
    inline def left: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left = "left".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left]
    
    inline def right: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right = "right".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right]
  }
  
  trait SidebarProps extends StObject {
    
    var children: TabType
    
    var closeIcon: js.UndefOr[Icon] = js.undefined
    
    var collapsed: Boolean
    
    var id: String
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var position: Position
    
    var selected: String
  }
  object SidebarProps {
    
    inline def apply(children: TabType, collapsed: Boolean, id: String, position: Position, selected: String): SidebarProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: TabType): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: /* id */ String => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var anchor: js.UndefOr[Anchor] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var closeIcon: js.UndefOr[Icon] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var header: String
    
    var icon: Icon
    
    var id: String
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
  }
  object TabProps {
    
    inline def apply(header: String, icon: Icon, id: String): TabProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type TabType = ReactElement | js.Array[ReactElement]
}
