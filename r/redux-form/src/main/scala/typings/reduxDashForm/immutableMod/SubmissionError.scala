package typings.reduxDashForm.immutableMod

import typings.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", "SubmissionError")
@js.native
class SubmissionError[FormData, ErrorType] ()
  extends typings.reduxDashForm.reduxDashFormMod.SubmissionError[FormData, ErrorType] {
  def this(errors: FormErrors[FormData, ErrorType]) = this()
}

