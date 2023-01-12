package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotification extends StObject {
  
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushNotification] (val x: Self) extends AnyVal {
    
    inline def setFinish(value: String => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    inline def setGetAlert(value: () => String | js.Object): Self = StObject.set(x, "getAlert", js.Any.fromFunction0(value))
    
    inline def setGetBadgeCount(value: () => Double): Self = StObject.set(x, "getBadgeCount", js.Any.fromFunction0(value))
    
    inline def setGetCategory(value: () => String): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
    
    inline def setGetContentAvailable(value: () => Double): Self = StObject.set(x, "getContentAvailable", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => js.Object): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetMessage(value: () => String | js.Object): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    inline def setGetSound(value: () => String): Self = StObject.set(x, "getSound", js.Any.fromFunction0(value))
  }
}
