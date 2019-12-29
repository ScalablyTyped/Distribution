package typings.reduxDashForm

import typings.reduxDashForm.reduxDashFormMod.FormErrors
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/SubmissionError", JSImport.Namespace)
@js.native
object libSubmissionErrorMod extends js.Object {
  @js.native
  class SubmissionError[FormData, ErrorType] protected () extends Error {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
    var errors: FormErrors[FormData, ErrorType] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class default[FormData, ErrorType] protected () extends SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
}

