package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid. */
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
object ValidityState extends Instantiable0[ValidityState]

