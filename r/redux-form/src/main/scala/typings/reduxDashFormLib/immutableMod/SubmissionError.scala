package typings
package reduxDashFormLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", "SubmissionError")
@js.native
class SubmissionError[FormData, ErrorType] ()
  extends reduxDashFormLib.reduxDashFormMod.SubmissionError[FormData, ErrorType] {
  def this(errors: reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]) = this()
}

