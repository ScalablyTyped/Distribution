package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("react-bootstrap/lib/Tabs", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[TabsProps, js.Object, js.Any]
  
  @js.native
  trait Tabs
    extends Component[TabsProps, js.Object, js.Any]
  
  @js.native
  trait TabsProps extends HTMLProps[Tabs] {
    
    var activeKey: js.UndefOr[js.Any] = js.native
    
    var animation: js.UndefOr[Boolean] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
    
    var defaultActiveKey: js.UndefOr[js.Any] = js.native
    
    var justified: js.UndefOr[Boolean] = js.native
    
    // TODO: Add more specific type
    var mountOnEnter: js.UndefOr[Boolean] = js.native
    
    @JSName("onSelect")
    var onSelect_TabsProps: js.UndefOr[SelectCallback] = js.native
    
    var paneWidth: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var position: js.UndefOr[String] = js.native
    
    var tabWidth: js.UndefOr[js.Any] = js.native
    
    var unmountOnExit: js.UndefOr[Boolean] = js.native
  }
  object TabsProps {
    
    @scala.inline
    def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: js.Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: js.Any): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPaneWidth(value: js.Any): Self = StObject.set(x, "paneWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaneWidthUndefined: Self = StObject.set(x, "paneWidth", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTabWidth(value: js.Any): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
