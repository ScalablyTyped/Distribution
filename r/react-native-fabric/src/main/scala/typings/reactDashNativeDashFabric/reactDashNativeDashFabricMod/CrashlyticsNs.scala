package typings.reactDashNativeDashFabric.reactDashNativeDashFabricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fabric", "Crashlytics")
@js.native
object CrashlyticsNs extends js.Object {
  def crash(): Unit = js.native
  def log(message: String): Unit = js.native
  def logException(value: String): Unit = js.native
  def recordCustomExceptionName(name: String, reason: String): Unit = js.native
  def recordCustomExceptionName(name: String, reason: String, stack: js.Array[_]): Unit = js.native
  def recordError(error: js.Any): Unit = js.native
  def setBool(key: String, value: Boolean): Unit = js.native
  def setNumber(key: String, value: Double): Unit = js.native
  def setString(key: String, value: String): Unit = js.native
  def setUserEmail(email: String): Unit = js.native
  def setUserIdentifier(id: String): Unit = js.native
  def setUserName(userName: String): Unit = js.native
  def throwException(): Unit = js.native
}

