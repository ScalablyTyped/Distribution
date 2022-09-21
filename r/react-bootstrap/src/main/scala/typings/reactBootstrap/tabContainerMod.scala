package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContainerMod {
  
  @JSImport("react-bootstrap/lib/TabContainer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[TabContainerProps, js.Object, Any]
  
  type TabContainer = Component[TabContainerProps, js.Object, Any]
  
  trait TabContainerProps
    extends StObject
       with HTMLAttributes[TabContainer] {
    
    var activeKey: js.UndefOr[Any] = js.undefined
    
    var defaultActiveKey: js.UndefOr[Any] = js.undefined
    
    var generateChildId: js.UndefOr[js.Function2[/* eventKey */ Any, /* type */ Any, String]] = js.undefined
  }
  object TabContainerProps {
    
    inline def apply(): TabContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContainerProps]
    }
    
    extension [Self <: TabContainerProps](x: Self) {
      
      inline def setActiveKey(value: Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setDefaultActiveKey(value: Any): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      inline def setGenerateChildId(value: (/* eventKey */ Any, /* type */ Any) => String): Self = StObject.set(x, "generateChildId", js.Any.fromFunction2(value))
      
      inline def setGenerateChildIdUndefined: Self = StObject.set(x, "generateChildId", js.undefined)
    }
  }
}
