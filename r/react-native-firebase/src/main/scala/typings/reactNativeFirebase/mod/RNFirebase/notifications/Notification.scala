package typings.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.notifications.Notification")
@js.native
class Notification () extends StObject {
  
  var android: AndroidNotification = js.native
  
  var body: String = js.native
  
  var data: StringDictionary[String] = js.native
  
  var ios: IOSNotification = js.native
  
  var notificationId: String = js.native
  
  def setBody(body: String): Notification = js.native
  
  def setData(data: js.Any): Notification = js.native
  
  def setNotificationId(notificationId: String): Notification = js.native
  
  def setSound(sound: String): Notification = js.native
  
  def setSubtitle(subtitle: String): Notification = js.native
  
  def setTitle(title: String): Notification = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var title: String = js.native
}
