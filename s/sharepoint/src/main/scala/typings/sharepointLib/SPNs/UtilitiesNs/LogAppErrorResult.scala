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
  
  val accessDenied: accessDenied with java.lang.String = js.native
  val errorsThrottled: errorsThrottled with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.LogAppErrorResult with java.lang.String] = js.native
}

