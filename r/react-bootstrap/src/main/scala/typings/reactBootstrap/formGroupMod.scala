package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import typings.reactBootstrap.reactBootstrapStrings.error
import typings.reactBootstrap.reactBootstrapStrings.success
import typings.reactBootstrap.reactBootstrapStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupMod {
  
  @JSImport("react-bootstrap/lib/FormGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FormGroupProps, js.Object, js.Any]
  
  @js.native
  trait FormGroup
    extends Component[FormGroupProps, js.Object, js.Any]
  
  trait FormGroupProps
    extends StObject
       with HTMLProps[FormGroup] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var controlId: js.UndefOr[String] = js.undefined
    
    var validationState: js.UndefOr[success | warning | error | Null] = js.undefined
  }
  object FormGroupProps {
    
    @scala.inline
    def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
    
    @scala.inline
    implicit class FormGroupPropsMutableBuilder[Self <: FormGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
      
      @scala.inline
      def setValidationState(value: success | warning | error): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateNull: Self = StObject.set(x, "validationState", null)
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
