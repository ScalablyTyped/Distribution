package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientRequestStatus extends js.Object

@JSGlobal("SP.ClientRequestStatus")
@js.native
object ClientRequestStatus extends js.Object {
  @js.native
  sealed trait active
    extends sharepointLib.SPNs.ClientRequestStatus
  
  @js.native
  sealed trait completedException
    extends sharepointLib.SPNs.ClientRequestStatus
  
  @js.native
  sealed trait completedSuccess
    extends sharepointLib.SPNs.ClientRequestStatus
  
  @js.native
  sealed trait inProgress
    extends sharepointLib.SPNs.ClientRequestStatus
  
  /* 0 */ val active: active with scala.Double = js.native
  /* 3 */ val completedException: completedException with scala.Double = js.native
  /* 2 */ val completedSuccess: completedSuccess with scala.Double = js.native
  /* 1 */ val inProgress: inProgress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ClientRequestStatus with scala.Double] = js.native
}

