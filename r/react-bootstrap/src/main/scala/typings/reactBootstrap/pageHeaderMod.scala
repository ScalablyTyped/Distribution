package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderMod {
  
  @JSImport("react-bootstrap/lib/PageHeader", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PageHeaderProps, js.Object, js.Any]
  
  @js.native
  trait PageHeader
    extends Component[PageHeaderProps, js.Object, js.Any]
  
  trait PageHeaderProps
    extends StObject
       with HTMLProps[PageHeader] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object PageHeaderProps {
    
    @scala.inline
    def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    @scala.inline
    implicit class PageHeaderPropsMutableBuilder[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
