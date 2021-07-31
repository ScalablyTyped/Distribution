package typings.std.global

import typings.std.NotificationOptions
import typings.std.NotificationPermission
import typings.std.NotificationPermissionCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Notification")
@js.native
class Notification protected ()
  extends StObject
     with typings.std.Notification {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, options: NotificationOptions) = this()
}
object Notification {
  
  @JSGlobal("Notification")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Notification.maxActions")
  @js.native
  val maxActions: Double = js.native
  
  @JSGlobal("Notification.permission")
  @js.native
  val permission: NotificationPermission = js.native
  
  @scala.inline
  def requestPermission(): js.Promise[NotificationPermission] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[js.Promise[NotificationPermission]]
  @scala.inline
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")(deprecatedCallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NotificationPermission]]
}
