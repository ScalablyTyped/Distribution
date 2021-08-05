package typings.reactNativeHoneywellScanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-honeywell-scanner", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-honeywell-scanner", "default.isCompatible")
    @js.native
    val isCompatible: Boolean = js.native
    
    inline def off(eventName: String, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(eventName: String, handler: js.Function1[/* event */ String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def startReader(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("startReader")().asInstanceOf[js.Promise[Boolean]]
    
    inline def stopReader(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopReader")().asInstanceOf[js.Promise[Unit]]
  }
}
