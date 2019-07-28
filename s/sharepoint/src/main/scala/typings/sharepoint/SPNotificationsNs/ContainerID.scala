package typings.sharepoint.SPNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerID extends js.Object

@JSGlobal("SPNotifications.ContainerID")
@js.native
object ContainerID extends js.Object {
  @js.native
  sealed trait Basic extends ContainerID
  
  @js.native
  sealed trait Status extends ContainerID
  
  /* 0 */ val Basic: typings.sharepoint.SPNotificationsNs.ContainerID.Basic with Double = js.native
  /* 1 */ val Status: typings.sharepoint.SPNotificationsNs.ContainerID.Status with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerID with Double] = js.native
}

