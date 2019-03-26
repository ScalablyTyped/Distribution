package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidityState extends js.Object {
  val badInput: scala.Boolean
  val customError: scala.Boolean
  val patternMismatch: scala.Boolean
  val rangeOverflow: scala.Boolean
  val rangeUnderflow: scala.Boolean
  val stepMismatch: scala.Boolean
  val tooLong: scala.Boolean
  val tooShort: scala.Boolean
  val typeMismatch: scala.Boolean
  val valid: scala.Boolean
  val valueMissing: scala.Boolean
}

@JSGlobal("ValidityState")
@js.native
class ValidityStateCls () extends ValidityState {
  /* CompleteClass */
  override val badInput: scala.Boolean = js.native
  /* CompleteClass */
  override val customError: scala.Boolean = js.native
  /* CompleteClass */
  override val patternMismatch: scala.Boolean = js.native
  /* CompleteClass */
  override val rangeOverflow: scala.Boolean = js.native
  /* CompleteClass */
  override val rangeUnderflow: scala.Boolean = js.native
  /* CompleteClass */
  override val stepMismatch: scala.Boolean = js.native
  /* CompleteClass */
  override val tooLong: scala.Boolean = js.native
  /* CompleteClass */
  override val tooShort: scala.Boolean = js.native
  /* CompleteClass */
  override val typeMismatch: scala.Boolean = js.native
  /* CompleteClass */
  override val valid: scala.Boolean = js.native
  /* CompleteClass */
  override val valueMissing: scala.Boolean = js.native
}

@JSGlobal("ValidityState")
@js.native
object ValidityState
  extends org.scalablytyped.runtime.Instantiable0[ValidityState]

