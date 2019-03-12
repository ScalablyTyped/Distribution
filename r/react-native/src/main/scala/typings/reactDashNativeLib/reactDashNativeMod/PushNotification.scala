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
    * Gets the category string from the `aps` object
    */
  def getCategory(): java.lang.String
  /**
    * Gets the content-available number from the `aps` object
    */
  def getContentAvailable(): scala.Double
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

object PushNotification {
  @scala.inline
  def apply(
    finish: java.lang.String => scala.Unit,
    getAlert: () => java.lang.String | js.Object,
    getBadgeCount: () => scala.Double,
    getCategory: () => java.lang.String,
    getContentAvailable: () => scala.Double,
    getData: () => js.Object,
    getMessage: () => java.lang.String | js.Object,
    getSound: () => java.lang.String
  ): PushNotification = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction1(finish), getAlert = js.Any.fromFunction0(getAlert), getBadgeCount = js.Any.fromFunction0(getBadgeCount), getCategory = js.Any.fromFunction0(getCategory), getContentAvailable = js.Any.fromFunction0(getContentAvailable), getData = js.Any.fromFunction0(getData), getMessage = js.Any.fromFunction0(getMessage), getSound = js.Any.fromFunction0(getSound))
  
    __obj.asInstanceOf[PushNotification]
  }
}

