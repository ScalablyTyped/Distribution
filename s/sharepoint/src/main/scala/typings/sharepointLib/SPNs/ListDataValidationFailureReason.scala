package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListDataValidationFailureReason extends js.Object

@JSGlobal("SP.ListDataValidationFailureReason")
@js.native
object ListDataValidationFailureReason extends js.Object {
  @js.native
  sealed trait dataFailure
    extends sharepointLib.SPNs.ListDataValidationFailureReason
  
  @js.native
  sealed trait formulaError
    extends sharepointLib.SPNs.ListDataValidationFailureReason
  
  /* 0 */ val dataFailure: dataFailure with scala.Double = js.native
  /* 1 */ val formulaError: formulaError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ListDataValidationFailureReason with scala.Double] = js.native
}

