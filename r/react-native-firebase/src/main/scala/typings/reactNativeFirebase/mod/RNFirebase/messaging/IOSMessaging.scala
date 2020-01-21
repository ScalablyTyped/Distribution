package typings.reactNativeFirebase.mod.RNFirebase.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.messaging.IOSMessaging")
@js.native
class IOSMessaging () extends js.Object {
  /**
    * Returns the devices APNS token.
    */
  def getAPNSToken(): js.Promise[String | Null] = js.native
  /**
    * Register for iOS remote notifications
    */
  def registerForRemoteNotifications(): js.Promise[Unit] = js.native
}

