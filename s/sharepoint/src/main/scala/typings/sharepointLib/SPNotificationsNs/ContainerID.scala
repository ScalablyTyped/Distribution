package typings
package sharepointLib.SPNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerID extends js.Object

@JSGlobal("SPNotifications.ContainerID")
@js.native
object ContainerID extends js.Object {
  @js.native
  sealed trait Basic
    extends sharepointLib.SPNotificationsNs.ContainerID
  
  @js.native
  sealed trait Status
    extends sharepointLib.SPNotificationsNs.ContainerID
  
  /* 0 */ val Basic: Basic with scala.Double = js.native
  /* 1 */ val Status: Status with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNotificationsNs.ContainerID with scala.Double] = js.native
}

