package typings.reactDashNativeDashBluetoothDashSerial.reactDashNativeDashBluetoothDashSerialMod

import typings.reactDashNativeDashBluetoothDashSerial.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-bluetooth-serial", "BluetoothSerial")
@js.native
object BluetoothSerialNs extends js.Object {
  def connect(id: String): js.Promise[Unit] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def isConnected(): js.Promise[Boolean] = js.native
  def isEnabled(): js.Promise[Boolean] = js.native
  def list(): js.Promise[js.Array[Anon_Id]] = js.native
  def on(eventName: String, handler: js.Function0[Unit]): Unit = js.native
  def removeListener(eventName: String, handler: js.Function0[Unit]): Unit = js.native
  def write(data: String): js.Promise[Boolean] = js.native
  def write(data: Buffer): js.Promise[Boolean] = js.native
}

