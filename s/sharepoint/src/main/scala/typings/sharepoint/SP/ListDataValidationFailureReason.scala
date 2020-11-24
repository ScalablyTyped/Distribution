package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListDataValidationFailureReason extends js.Object
@JSGlobal("SP.ListDataValidationFailureReason")
@js.native
object ListDataValidationFailureReason extends js.Object {
  
  @js.native
  sealed trait dataFailure extends ListDataValidationFailureReason
  
  @js.native
  sealed trait formulaError extends ListDataValidationFailureReason
}
