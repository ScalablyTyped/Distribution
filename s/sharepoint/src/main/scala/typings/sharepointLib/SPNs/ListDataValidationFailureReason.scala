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
  
  val dataFailure: dataFailure with java.lang.String = js.native
  val formulaError: formulaError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ListDataValidationFailureReason with java.lang.String] = js.native
}

