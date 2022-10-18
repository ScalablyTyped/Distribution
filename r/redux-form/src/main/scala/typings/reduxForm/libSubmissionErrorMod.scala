package typings.reduxForm

import typings.reduxForm.mod.FormErrors
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubmissionErrorMod {
  
  @JSImport("redux-form/lib/SubmissionError", JSImport.Default)
  @js.native
  open class default[FormData, ErrorType] protected () extends SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  @JSImport("redux-form/lib/SubmissionError", "SubmissionError")
  @js.native
  open class SubmissionError[FormData, ErrorType] protected ()
    extends StObject
       with Error {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
    
    var errors: FormErrors[FormData, ErrorType] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
