package typings
package reactDashNativeDashFabricLib.reactDashNativeDashFabricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fabric", "Crashlytics")
@js.native
object CrashlyticsNs extends js.Object {
  def crash(): scala.Unit = js.native
  def log(message: java.lang.String): scala.Unit = js.native
  def logException(value: java.lang.String): scala.Unit = js.native
  def recordCustomExceptionName(name: java.lang.String, reason: java.lang.String): scala.Unit = js.native
  def recordCustomExceptionName(name: java.lang.String, reason: java.lang.String, stack: js.Array[_]): scala.Unit = js.native
  def recordError(error: js.Any): scala.Unit = js.native
  def setBool(key: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setNumber(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setString(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setUserEmail(email: java.lang.String): scala.Unit = js.native
  def setUserIdentifier(id: java.lang.String): scala.Unit = js.native
  def setUserName(userName: java.lang.String): scala.Unit = js.native
  def throwException(): scala.Unit = js.native
}

