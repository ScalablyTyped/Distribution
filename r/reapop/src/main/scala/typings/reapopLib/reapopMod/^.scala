package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reapop", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_NOTIFICATION: Notification = js.native
  val POSITIONS: POSITIONS_TYPES = js.native
  val STATUS: STATUS_TYPES = js.native
  val actions: Actions = js.native
  val types: Types = js.native
  def addNotification(notification: Notification): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], Notification] = js.native
  def reducer(): js.Function2[
    /* state */ js.Array[Notification], 
    /* notification */ reapopLib.Anon_PayloadType, 
    js.Array[Notification]
  ] = js.native
  def reducer(defaultNotification: Notification): js.Function2[
    /* state */ js.Array[Notification], 
    /* notification */ reapopLib.Anon_PayloadType, 
    js.Array[Notification]
  ] = js.native
  def removeNotification(notification: Notification): reapopLib.Anon_Payload = js.native
  def removeNotifications(): reapopLib.Anon_Type = js.native
  def updateNotification(notification: Notification): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], Notification] = js.native
}

