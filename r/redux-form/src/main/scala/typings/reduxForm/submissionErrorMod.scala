package typings.reduxForm

import typings.reduxForm.mod.FormErrors
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/SubmissionError", JSImport.Namespace)
@js.native
object submissionErrorMod extends js.Object {
  @js.native
  class SubmissionError[FormData, ErrorType] protected () extends Error {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
    var errors: FormErrors[FormData, ErrorType] = js.native
  }
  
  @js.native
  class default[FormData, ErrorType] protected () extends SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
}

