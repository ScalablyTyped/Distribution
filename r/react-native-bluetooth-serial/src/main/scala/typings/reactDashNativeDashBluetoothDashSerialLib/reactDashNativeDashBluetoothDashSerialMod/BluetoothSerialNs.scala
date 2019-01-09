package typings
package reactDashNativeDashBluetoothDashSerialLib.reactDashNativeDashBluetoothDashSerialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-bluetooth-serial", "BluetoothSerial")
@js.native
object BluetoothSerialNs extends js.Object {
  def connect(id: java.lang.String): js.Promise[scala.Unit] = js.native
  def disconnect(): js.Promise[scala.Unit] = js.native
  def isConnected(): js.Promise[scala.Boolean] = js.native
  def isEnabled(): js.Promise[scala.Boolean] = js.native
  def list(): js.Promise[js.Array[reactDashNativeDashBluetoothDashSerialLib.Anon_Id]] = js.native
  def on(eventName: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeListener(eventName: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def write(data: java.lang.String): js.Promise[scala.Boolean] = js.native
  def write(data: reactDashNativeDashBluetoothDashSerialLib.reactDashNativeDashBluetoothDashSerialMod.Buffer): js.Promise[scala.Boolean] = js.native
}

