package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogAppErrorResult extends js.Object

@JSGlobal("SP.Utilities.LogAppErrorResult")
@js.native
object LogAppErrorResult extends js.Object {
  @js.native
  sealed trait accessDenied extends LogAppErrorResult
  
  @js.native
  sealed trait errorsThrottled extends LogAppErrorResult
  
  @js.native
  sealed trait success extends LogAppErrorResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogAppErrorResult with Double] = js.native
  /* 2 */ @js.native
  object accessDenied extends TopLevel[accessDenied with Double]
  
  /* 1 */ @js.native
  object errorsThrottled extends TopLevel[errorsThrottled with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
}

