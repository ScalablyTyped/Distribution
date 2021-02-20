package typings.reactNativeBluetoothSerial

import typings.reactNativeBluetoothSerial.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object BluetoothSerial {
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.connect")
    @js.native
    def connect(id: String): js.Promise[Unit] = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.disconnect")
    @js.native
    def disconnect(): js.Promise[Unit] = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.isConnected")
    @js.native
    def isConnected(): js.Promise[Boolean] = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.isEnabled")
    @js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.list")
    @js.native
    def list(): js.Promise[js.Array[Id]] = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.on")
    @js.native
    def on(eventName: String, handler: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.removeListener")
    @js.native
    def removeListener(eventName: String, handler: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.write")
    @js.native
    def write(data: String): js.Promise[Boolean] = js.native
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial.write")
    @js.native
    def write(data: Buffer): js.Promise[Boolean] = js.native
  }
  
  type Buffer = js.Function1[/* data */ js.Array[Double], Unit]
}
