package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPageHeaderMod {
  
  @JSImport("react-bootstrap/lib/PageHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PageHeaderProps, js.Object, Any]
  
  type PageHeader = Component[PageHeaderProps, js.Object, Any]
  
  trait PageHeaderProps
    extends StObject
       with HTMLProps[PageHeader] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
