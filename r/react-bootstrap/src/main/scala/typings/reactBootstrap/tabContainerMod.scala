package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContainerMod {
  
  @JSImport("react-bootstrap/lib/TabContainer", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[TabContainerProps, js.Object, js.Any]
  
  @js.native
  trait TabContainer
    extends Component[TabContainerProps, js.Object, js.Any]
  
  @js.native
  trait TabContainerProps extends HTMLAttributes[TabContainer] {
    
    var activeKey: js.UndefOr[js.Any] = js.native
    
    var defaultActiveKey: js.UndefOr[js.Any] = js.native
    
    var generateChildId: js.UndefOr[js.Function2[/* eventKey */ js.Any, /* type */ js.Any, String]] = js.native
  }
  object TabContainerProps {
    
    @scala.inline
    def apply(): TabContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContainerProps]
    }
    
    @scala.inline
    implicit class TabContainerPropsMutableBuilder[Self <: TabContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: js.Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: js.Any): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setGenerateChildId(value: (/* eventKey */ js.Any, /* type */ js.Any) => String): Self = StObject.set(x, "generateChildId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateChildIdUndefined: Self = StObject.set(x, "generateChildId", js.undefined)
    }
  }
}
