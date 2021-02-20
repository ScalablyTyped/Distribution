package typings.std.global

import typings.std.NotificationOptions
import typings.std.NotificationPermission
import typings.std.NotificationPermissionCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Notification")
@js.native
class Notification protected ()
  extends typings.std.Notification {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, options: NotificationOptions) = this()
}
object Notification {
  
  @JSGlobal("Notification.maxActions")
  @js.native
  val maxActions: Double = js.native
  
  @JSGlobal("Notification.permission")
  @js.native
  val permission: NotificationPermission = js.native
  
  @JSGlobal("Notification.requestPermission")
  @js.native
  def requestPermission(): js.Promise[NotificationPermission] = js.native
  @JSGlobal("Notification.requestPermission")
  @js.native
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
}
