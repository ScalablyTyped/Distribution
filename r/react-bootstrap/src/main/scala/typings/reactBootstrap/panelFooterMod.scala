package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelFooterMod {
  
  @JSImport("react-bootstrap/lib/PanelFooter", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelFooterProps, js.Object, js.Any]
  
  @js.native
  trait PanelFooter
    extends Component[PanelFooterProps, js.Object, js.Any]
  
  trait PanelFooterProps
    extends StObject
       with HTMLProps[PanelFooter] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object PanelFooterProps {
    
    @scala.inline
    def apply(): PanelFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelFooterProps]
    }
    
    @scala.inline
    implicit class PanelFooterPropsMutableBuilder[Self <: PanelFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
