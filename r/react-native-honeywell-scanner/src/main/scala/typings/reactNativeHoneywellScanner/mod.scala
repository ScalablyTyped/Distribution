package typings.reactNativeHoneywellScanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-honeywell-scanner", "default.isCompatible")
    @js.native
    val isCompatible: Boolean = js.native
    
    @JSImport("react-native-honeywell-scanner", "default.off")
    @js.native
    def off(eventName: String, handler: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-honeywell-scanner", "default.on")
    @js.native
    def on(eventName: String, handler: js.Function1[/* event */ String | Null, Unit]): Unit = js.native
    
    @JSImport("react-native-honeywell-scanner", "default.startReader")
    @js.native
    def startReader(): js.Promise[Boolean] = js.native
    
    @JSImport("react-native-honeywell-scanner", "default.stopReader")
    @js.native
    def stopReader(): js.Promise[Unit] = js.native
  }
}
