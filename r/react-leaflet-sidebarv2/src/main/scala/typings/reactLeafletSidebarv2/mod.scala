package typings.reactLeafletSidebarv2

import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  class Sidebar protected ()
    extends Component[SidebarProps, js.Any, js.Any] {
    def this(props: SidebarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarProps, context: js.Any) = this()
  }
  
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  class Tab protected ()
    extends Component[TabProps, js.Any, js.Any] {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: js.Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom
  */
  trait Anchor extends StObject
  object Anchor {
    
    @scala.inline
    def bottom: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom = "bottom".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom]
    
    @scala.inline
    def top: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top = "top".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top]
  }
  
  type Icon = String | ReactElement
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left
    - typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right
  */
  trait Position extends StObject
  object Position {
    
    @scala.inline
    def left: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left = "left".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left]
    
    @scala.inline
    def right: typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right = "right".asInstanceOf[typings.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right]
  }
  
  @js.native
  trait SidebarProps extends StObject {
    
    var children: TabType = js.native
    
    var closeIcon: js.UndefOr[Icon] = js.native
    
    var collapsed: Boolean = js.native
    
    var id: String = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
    
    var position: Position = js.native
    
    var selected: String = js.native
  }
  object SidebarProps {
    
    @scala.inline
    def apply(children: TabType, collapsed: Boolean, id: String, position: Position, selected: String): SidebarProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit class SidebarPropsMutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: TabType): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* id */ String => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var anchor: js.UndefOr[Anchor] = js.native
    
    var closeIcon: js.UndefOr[Icon] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var header: String = js.native
    
    var icon: Icon = js.native
    
    var id: String = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var position: js.UndefOr[Position] = js.native
  }
  object TabProps {
    
    @scala.inline
    def apply(header: String, icon: Icon, id: String): TabProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type TabType = ReactElement | js.Array[ReactElement]
}
