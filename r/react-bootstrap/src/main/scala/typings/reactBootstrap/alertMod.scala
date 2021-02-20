package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("react-bootstrap/lib/Alert", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[AlertProps, js.Object, js.Any]
  
  @js.native
  trait Alert
    extends Component[AlertProps, js.Object, js.Any]
  
  @js.native
  trait AlertProps extends HTMLProps[Alert] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
    
    var closeLabel: js.UndefOr[String] = js.native
    
    /** @deprecated since v0.29.0 */ var dismissAfter: js.UndefOr[Double] = js.native
    
    // TODO: Add more specific type
    var onDismiss: js.UndefOr[js.Function] = js.native
  }
  object AlertProps {
    
    @scala.inline
    def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    @scala.inline
    implicit class AlertPropsMutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      @scala.inline
      def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: js.Function): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    }
  }
}
