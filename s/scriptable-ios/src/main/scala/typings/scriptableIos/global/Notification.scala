package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Schedules and manages notifications._
  * @see https://docs.scriptable.app/notification/#-new-notification
  */
@JSGlobal("Notification")
@js.native
/**
  * _Schedules and manages notifications._
  * @see https://docs.scriptable.app/notification/#-new-notification
  */
class Notification ()
  extends typings.scriptableIos.Notification
object Notification {
  
  /**
    * _Delivered notifications displayed in the Notification Center._
    *
    * Fetches all notifications that have been scheduled from Scriptable and that are still displayed in the Notification Center of iOS.
    * @see https://docs.scriptable.app/notification/#alldelivered
    */
  /* static member */
  @JSGlobal("Notification.allDelivered")
  @js.native
  def allDelivered(): js.Promise[js.Array[typings.scriptableIos.Notification]] = js.native
  
  /**
    * _All pending notifications._
    *
    * Fetches all notifications that have been scheduled from Scriptable and are waiting to be delivered.
    * @see https://docs.scriptable.app/notification/#allpending
    */
  /* static member */
  @JSGlobal("Notification.allPending")
  @js.native
  def allPending(): js.Promise[js.Array[typings.scriptableIos.Notification]] = js.native
  
  /**
    * _Removes all delivered notifications._
    *
    * Removes all notifications that have been scheduled from Scriptable and that are still displayed in the Notification Center of iOS.
    * @see https://docs.scriptable.app/notification/#removealldelivered
    */
  /* static member */
  @JSGlobal("Notification.removeAllDelivered")
  @js.native
  def removeAllDelivered(): js.Promise[Unit] = js.native
  
  /**
    * _Removes all pending notifications._
    *
    * Removes all notifications that have been scheduled from Scriptable and are waiting to be delivered.
    *
    * Use with caution. This removes all notifications scheduled across all of your scripts and the action cannot be undone.
    * @see https://docs.scriptable.app/notification/#removeallpending
    */
  /* static member */
  @JSGlobal("Notification.removeAllPending")
  @js.native
  def removeAllPending(): js.Promise[Unit] = js.native
  
  /**
    * _Removes delivered notifications._
    *
    * Removes notifications with the specified identifiers. The notifications are only removed if they have been delivered. To remove pending notifications, see
    * `Notification.removePending()`.
    * @see https://docs.scriptable.app/notification/#removedelivered
    */
  /* static member */
  @JSGlobal("Notification.removeDelivered")
  @js.native
  def removeDelivered(identifiers: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * _Removes pending notifications._
    *
    * Removes notifications with the specified identifiers. The notifications are only removed if they are pending, that is they have been scheduled and are waiting to be delivered. To
    * remove delivered notifications, see `Notification.removeDelivered()`.
    * @see https://docs.scriptable.app/notification/#removepending
    */
  /* static member */
  @JSGlobal("Notification.removePending")
  @js.native
  def removePending(identifiers: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * _Resets the current notification._
    *
    * Effectively sets `args.notification` to null.
    *
    * When a notification scheduled from Scriptable has been tapped to open the app or while the app was open, `args.notification` will have a value until Scriptable is quit. You can
    * manually reset the value using `Notification.resetCurrent`.
    * @see https://docs.scriptable.app/notification/#resetcurrent
    */
  /* static member */
  @JSGlobal("Notification.resetCurrent")
  @js.native
  def resetCurrent(): Unit = js.native
}
