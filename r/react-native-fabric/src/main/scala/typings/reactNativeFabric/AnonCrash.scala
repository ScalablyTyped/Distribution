package typings.reactNativeFabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCrash extends js.Object {
  def crash(): Unit = js.native
  def log(message: String): Unit = js.native
  def logException(value: String): Unit = js.native
  def recordCustomExceptionName(name: String, reason: String, frameArray: js.Array[js.Object]): Unit = js.native
  def recordError(error: String): Unit = js.native
  def recordError(error: js.Object): Unit = js.native
  def recordError(error: Double): Unit = js.native
  def setBool(key: String, value: Boolean): Unit = js.native
  def setNumber(key: String, value: Double): Unit = js.native
  def setString(key: String, value: String): Unit = js.native
  def setUserEmail(email: String): Unit = js.native
  def setUserIdentifier(userIdentifier: String): Unit = js.native
  def setUserName(userName: String): Unit = js.native
  def throwException(): Unit = js.native
}

