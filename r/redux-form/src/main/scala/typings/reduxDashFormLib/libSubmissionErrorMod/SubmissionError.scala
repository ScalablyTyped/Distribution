package typings
package reduxDashFormLib.libSubmissionErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/SubmissionError", "SubmissionError")
@js.native
class SubmissionError[FormData, ErrorType] ()
  extends stdLib.Error {
  def this(errors: reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

