package typings.sharepoint.SPNs.UtilitiesNs

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
  
  /* 2 */ val accessDenied: typings.sharepoint.SPNs.UtilitiesNs.LogAppErrorResult.accessDenied with Double = js.native
  /* 1 */ val errorsThrottled: typings.sharepoint.SPNs.UtilitiesNs.LogAppErrorResult.errorsThrottled with Double = js.native
  /* 0 */ val success: typings.sharepoint.SPNs.UtilitiesNs.LogAppErrorResult.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogAppErrorResult with Double] = js.native
}

