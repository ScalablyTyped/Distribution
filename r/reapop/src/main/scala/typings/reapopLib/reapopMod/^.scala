package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reapop", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_NOTIFICATION: reapopLib.reapopMod.Notification = js.native
  val POSITIONS: reapopLib.reapopMod.POSITIONS_TYPES = js.native
  val STATUS: reapopLib.reapopMod.STATUS_TYPES = js.native
  val actions: reapopLib.reapopMod.Actions = js.native
  val types: reapopLib.reapopMod.Types = js.native
  def addNotification(notification: reapopLib.reapopMod.Notification): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], reapopLib.reapopMod.Notification] = js.native
  def reducer(): js.Function2[
    /* state */ js.Array[reapopLib.reapopMod.Notification], 
    /* notification */ reapopLib.Anon_PayloadType, 
    js.Array[reapopLib.reapopMod.Notification]
  ] = js.native
  def reducer(defaultNotification: reapopLib.reapopMod.Notification): js.Function2[
    /* state */ js.Array[reapopLib.reapopMod.Notification], 
    /* notification */ reapopLib.Anon_PayloadType, 
    js.Array[reapopLib.reapopMod.Notification]
  ] = js.native
  def removeNotification(notification: reapopLib.reapopMod.Notification): reapopLib.Anon_Payload = js.native
  def removeNotifications(): reapopLib.Anon_Type = js.native
  def updateNotification(notification: reapopLib.reapopMod.Notification): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], reapopLib.reapopMod.Notification] = js.native
}

