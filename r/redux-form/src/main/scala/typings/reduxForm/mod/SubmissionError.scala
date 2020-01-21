package typings.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "SubmissionError")
@js.native
class SubmissionError[FormData, ErrorType] protected ()
  extends typings.reduxForm.submissionErrorMod.SubmissionError[FormData, ErrorType] {
  def this(errors: FormErrors[FormData, ErrorType]) = this()
}

