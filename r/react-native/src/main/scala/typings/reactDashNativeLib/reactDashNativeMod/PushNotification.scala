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
    finish: js.Function1[java.lang.String, scala.Unit],
    getAlert: js.Function0[java.lang.String | js.Object],
    getBadgeCount: js.Function0[scala.Double],
    getCategory: js.Function0[java.lang.String],
    getContentAvailable: js.Function0[scala.Double],
    getData: js.Function0[js.Object],
    getMessage: js.Function0[java.lang.String | js.Object],
    getSound: js.Function0[java.lang.String]
  ): PushNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("finish")(finish)
    __obj.updateDynamic("getAlert")(getAlert)
    __obj.updateDynamic("getBadgeCount")(getBadgeCount)
    __obj.updateDynamic("getCategory")(getCategory)
    __obj.updateDynamic("getContentAvailable")(getContentAvailable)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getMessage")(getMessage)
    __obj.updateDynamic("getSound")(getSound)
    __obj.asInstanceOf[PushNotification]
  }
}

