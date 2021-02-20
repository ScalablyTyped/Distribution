package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalFooterMod {
  
  @JSImport("react-bootstrap/lib/ModalFooter", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ModalFooterProps, js.Object, js.Any]
  
  @js.native
  trait ModalFooter
    extends Component[ModalFooterProps, js.Object, js.Any]
  
  @js.native
  trait ModalFooterProps extends HTMLProps[ModalFooter] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object ModalFooterProps {
    
    @scala.inline
    def apply(): ModalFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalFooterProps]
    }
    
    @scala.inline
    implicit class ModalFooterPropsMutableBuilder[Self <: ModalFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
