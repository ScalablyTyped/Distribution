package typings.reactDashNativeDashBluetoothDashSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-bluetooth-serial", JSImport.Namespace)
@js.native
object reactDashNativeDashBluetoothDashSerialMod extends js.Object {
  @js.native
  object BluetoothSerial extends js.Object {
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
  
  type Buffer = js.Function1[/* data */ js.Array[Double], Unit]
}

