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
  
  val active: active with java.lang.String = js.native
  val completedException: completedException with java.lang.String = js.native
  val completedSuccess: completedSuccess with java.lang.String = js.native
  val inProgress: inProgress with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ClientRequestStatus with java.lang.String] = js.native
}

