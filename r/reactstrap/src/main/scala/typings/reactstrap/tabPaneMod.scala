package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPaneMod {
  
  @JSImport("reactstrap/lib/TabPane", JSImport.Default)
  @js.native
  class default ()
    extends Component[TabPaneProps, js.Object, js.Any]
  
  type TabPane = Component[TabPaneProps, js.Object, js.Any]
  
  trait TabPaneProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tabId: js.UndefOr[Double | String] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object TabPaneProps {
    
    @scala.inline
    def apply(): TabPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPaneProps]
    }
    
    @scala.inline
    implicit class TabPanePropsMutableBuilder[Self <: TabPaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTabId(value: Double | String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
