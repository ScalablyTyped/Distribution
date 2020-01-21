package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotification extends js.Object {
  /**
    * iOS Only
    * Signifies remote notification handling is complete
    */
  def finish(result: String): Unit
  /**
    * Gets the notification's main message from the `aps` object
    */
  def getAlert(): String | js.Object
  /**
    * Gets the badge count number from the `aps` object
    */
  def getBadgeCount(): Double
  /**
    * Gets the category string from the `aps` object
    */
  def getCategory(): String
  /**
    * Gets the content-available number from the `aps` object
    */
  def getContentAvailable(): Double
  /**
    * Gets the data object on the notif
    */
  def getData(): js.Object
  /**
    * An alias for `getAlert` to get the notification's main message string
    */
  def getMessage(): String | js.Object
  /**
    * Gets the sound string from the `aps` object
    */
  def getSound(): String
}

object PushNotification {
  @scala.inline
  def apply(
    finish: String => Unit,
    getAlert: () => String | js.Object,
    getBadgeCount: () => Double,
    getCategory: () => String,
    getContentAvailable: () => Double,
    getData: () => js.Object,
    getMessage: () => String | js.Object,
    getSound: () => String
  ): PushNotification = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction1(finish), getAlert = js.Any.fromFunction0(getAlert), getBadgeCount = js.Any.fromFunction0(getBadgeCount), getCategory = js.Any.fromFunction0(getCategory), getContentAvailable = js.Any.fromFunction0(getContentAvailable), getData = js.Any.fromFunction0(getData), getMessage = js.Any.fromFunction0(getMessage), getSound = js.Any.fromFunction0(getSound))
  
    __obj.asInstanceOf[PushNotification]
  }
}

