package typings.reactNativeFirebase.mod.RNFirebase.crashlytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crashlytics extends js.Object {
  
  /**
    * Forces a crash. Useful for testing your application is set up correctly.
    */
  def crash(): Unit = js.native
  
  /**
    * Enable Crashlytics reporting. Only avaliable when disabled automatic initialization
    */
  def enableCrashlyticsCollection(): Unit = js.native
  
  /**
    * Logs a message that will appear in any subsequent crash reports.
    */
  def log(message: String): Unit = js.native
  
  /**
    * Logs a custom non fatal exception.
    */
  def recordCustomError(name: String, message: String): Unit = js.native
  def recordCustomError(name: String, message: String, stack: js.Array[customError]): Unit = js.native
  
  /**
    * Logs a non fatal exception.
    */
  def recordError(code: Double, message: String): Unit = js.native
  
  /**
    * Set a boolean value to show alongside any subsequent crash reports.
    */
  def setBoolValue(key: String, value: Boolean): Unit = js.native
  
  /**
    * Set a float value to show alongside any subsequent crash reports.
    */
  def setFloatValue(key: String, value: Double): Unit = js.native
  
  /**
    * Set an integer value to show alongside any subsequent crash reports.
    */
  def setIntValue(key: String, value: Double): Unit = js.native
  
  /**
    * Set a string value to show alongside any subsequent crash reports.
    */
  def setStringValue(key: String, value: String): Unit = js.native
  
  /**
    * Set the user email to show alongside any subsequent crash reports.
    */
  def setUserEmail(userEmail: String): Unit = js.native
  
  /**
    * Set the user ID to show alongside any subsequent crash reports.
    */
  def setUserIdentifier(userId: String): Unit = js.native
  
  /**
    * Set the user name to show alongside any subsequent crash reports.
    */
  def setUserName(userName: String): Unit = js.native
}
