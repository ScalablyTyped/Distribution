package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalHeaderMod {
  
  @JSImport("react-bootstrap/lib/ModalHeader", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ModalHeaderProps, js.Object, js.Any]
  
  @js.native
  trait ModalHeader
    extends Component[ModalHeaderProps, js.Object, js.Any]
  
  @js.native
  trait ModalHeaderProps extends HTMLProps[ModalHeader] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var closeButton: js.UndefOr[Boolean] = js.native
    
    var closeLabel: js.UndefOr[String] = js.native
    
    var onHide: js.UndefOr[js.Function] = js.native
  }
  object ModalHeaderProps {
    
    @scala.inline
    def apply(): ModalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHeaderProps]
    }
    
    @scala.inline
    implicit class ModalHeaderPropsMutableBuilder[Self <: ModalHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      @scala.inline
      def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    }
  }
}
