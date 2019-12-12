package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.ListDataValidationFailureReason.dataFailure
import typings.sharepoint.SP.ListDataValidationFailureReason.formulaError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListDataValidationFailureReason extends js.Object

@JSGlobal("SP.ListDataValidationFailureReason")
@js.native
object ListDataValidationFailureReason extends js.Object {
  @js.native
  sealed trait dataFailure extends ListDataValidationFailureReason
  
  @js.native
  sealed trait formulaError extends ListDataValidationFailureReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListDataValidationFailureReason with Double] = js.native
  /* 0 */ @js.native
  object dataFailure extends TopLevel[dataFailure with Double]
  
  /* 1 */ @js.native
  object formulaError extends TopLevel[formulaError with Double]
  
}

