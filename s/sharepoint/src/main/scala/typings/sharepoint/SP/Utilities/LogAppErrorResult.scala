package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogAppErrorResult extends StObject
@JSGlobal("SP.Utilities.LogAppErrorResult")
@js.native
object LogAppErrorResult extends StObject {
  
  @js.native
  sealed trait accessDenied
    extends StObject
       with LogAppErrorResult
  
  @js.native
  sealed trait errorsThrottled
    extends StObject
       with LogAppErrorResult
  
  @js.native
  sealed trait success
    extends StObject
       with LogAppErrorResult
}
