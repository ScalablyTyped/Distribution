package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogAppErrorResult extends js.Object

@JSGlobal("SP.Utilities.LogAppErrorResult")
@js.native
object LogAppErrorResult extends js.Object {
  @js.native
  sealed trait accessDenied
    extends sharepointLib.SPNs.UtilitiesNs.LogAppErrorResult
  
  @js.native
  sealed trait errorsThrottled
    extends sharepointLib.SPNs.UtilitiesNs.LogAppErrorResult
  
  @js.native
  sealed trait success
    extends sharepointLib.SPNs.UtilitiesNs.LogAppErrorResult
  
  /* 2 */ val accessDenied: accessDenied with scala.Double = js.native
  /* 1 */ val errorsThrottled: errorsThrottled with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.LogAppErrorResult with scala.Double] = js.native
}

