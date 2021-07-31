package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListDataValidationFailureReason extends StObject
@JSGlobal("SP.ListDataValidationFailureReason")
@js.native
object ListDataValidationFailureReason extends StObject {
  
  @js.native
  sealed trait dataFailure
    extends StObject
       with ListDataValidationFailureReason
  
  @js.native
  sealed trait formulaError
    extends StObject
       with ListDataValidationFailureReason
}
