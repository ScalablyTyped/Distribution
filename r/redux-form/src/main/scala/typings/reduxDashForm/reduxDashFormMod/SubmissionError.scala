package typings.reduxDashForm.reduxDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "SubmissionError")
@js.native
class SubmissionError[FormData, ErrorType] ()
  extends typings.reduxDashForm.libSubmissionErrorMod.SubmissionError[FormData, ErrorType] {
  def this(errors: FormErrors[FormData, ErrorType]) = this()
}

