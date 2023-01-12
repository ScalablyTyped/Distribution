package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormControlFeedbackMod {
  
  @JSImport("react-bootstrap/lib/FormControlFeedback", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[FormControlFeedbackProps, js.Object, Any]
  
  type FormControlFeedback = Component[FormControlFeedbackProps, js.Object, Any]
  
  trait FormControlFeedbackProps
    extends StObject
       with HTMLProps[FormControlFeedback] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object FormControlFeedbackProps {
    
    inline def apply(): FormControlFeedbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlFeedbackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormControlFeedbackProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
