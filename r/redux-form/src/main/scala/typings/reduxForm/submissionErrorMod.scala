package typings.reduxForm

import typings.reduxForm.mod.FormErrors
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object submissionErrorMod {
  
  @JSImport("redux-form/lib/SubmissionError", JSImport.Default)
  @js.native
  class default[FormData, ErrorType] protected () extends SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  @JSImport("redux-form/lib/SubmissionError", "SubmissionError")
  @js.native
  class SubmissionError[FormData, ErrorType] protected () extends Error {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
    
    var errors: FormErrors[FormData, ErrorType] = js.native
  }
}
