package typings.reactNativeFirebase.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifications extends Shortcut {
  
  @JSImport("react-native-firebase", "notifications")
  @js.native
  val ^ : NotificationsModule = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "notifications.Notification")
  @js.native
  open class Notification ()
    extends typings.reactNativeFirebase.mod.RNFirebase.notifications.Notification
  
  type _To = NotificationsModule
  
  /* This means you don't have to write `^`, but can instead just say `notifications.foo` */
  override def _to: NotificationsModule = ^
}
