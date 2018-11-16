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
  
  val Basic: Basic with java.lang.String = js.native
  val Status: Status with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNotificationsNs.ContainerID with java.lang.String] = js.native
}

