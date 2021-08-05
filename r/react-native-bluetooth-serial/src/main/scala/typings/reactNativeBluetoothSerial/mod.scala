package typings.reactNativeBluetoothSerial

import typings.reactNativeBluetoothSerial.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object BluetoothSerial {
    
    @JSImport("react-native-bluetooth-serial", "BluetoothSerial")
    @js.native
    val ^ : js.Any = js.native
    
    inline def connect(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def disconnect(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[js.Promise[Unit]]
    
    inline def isConnected(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnected")().asInstanceOf[js.Promise[Boolean]]
    
    inline def isEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[js.Promise[Boolean]]
    
    inline def list(): js.Promise[js.Array[Id]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[Id]]]
    
    inline def on(eventName: String, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeListener(eventName: String, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def write(data: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def write(data: Buffer): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  }
  
  type Buffer = js.Function1[/* data */ js.Array[Double], Unit]
}
