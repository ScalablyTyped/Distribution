package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PushNotification extends js.Object {
  /**
       * iOS Only
       * Signifies remote notification handling is complete
       */
  def finish(result: java.lang.String): scala.Unit
  /**
       * Gets the notification's main message from the `aps` object
       */
  def getAlert(): java.lang.String | js.Object
  /**
       * Gets the badge count number from the `aps` object
       */
  def getBadgeCount(): scala.Double
  /**
       * Gets the data object on the notif
       */
  def getData(): js.Object
  /**
       * An alias for `getAlert` to get the notification's main message string
       */
  def getMessage(): java.lang.String | js.Object
  /**
       * Gets the sound string from the `aps` object
       */
  def getSound(): java.lang.String
}

