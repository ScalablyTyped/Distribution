package typings.reduxDashForm.libSubmissionErrorMod

import typings.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/SubmissionError", JSImport.Default)
@js.native
class default[FormData, ErrorType] () extends SubmissionError[FormData, ErrorType] {
  def this(errors: FormErrors[FormData, ErrorType]) = this()
}

