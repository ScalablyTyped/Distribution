package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFeedbackMod {
  
  @JSImport("react-bootstrap/lib/FormControlFeedback", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FormControlFeedbackProps, js.Object, js.Any]
  
  @js.native
  trait FormControlFeedback
    extends Component[FormControlFeedbackProps, js.Object, js.Any]
  
  @js.native
  trait FormControlFeedbackProps extends HTMLProps[FormControlFeedback] {
    
    var bsClass: js.UndefOr[String] = js.native
  }
  object FormControlFeedbackProps {
    
    @scala.inline
    def apply(): FormControlFeedbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlFeedbackProps]
    }
    
    @scala.inline
    implicit class FormControlFeedbackPropsMutableBuilder[Self <: FormControlFeedbackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
