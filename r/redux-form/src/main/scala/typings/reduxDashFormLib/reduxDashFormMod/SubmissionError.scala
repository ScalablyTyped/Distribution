package typings
package reduxDashFormLib.reduxDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "SubmissionError")
@js.native
class SubmissionError[FormData, ErrorType] ()
  extends reduxDashFormLib.libSubmissionErrorMod.SubmissionError[FormData, ErrorType] {
  def this(errors: FormErrors[FormData, ErrorType]) = this()
}

