package typings.reactNativeHoneywellScanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-honeywell-scanner", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    val isCompatible: Boolean = js.native
    
    def off(eventName: String, handler: js.Function0[Unit]): Unit = js.native
    
    def on(eventName: String, handler: js.Function1[/* event */ String | Null, Unit]): Unit = js.native
    
    def startReader(): js.Promise[Boolean] = js.native
    
    def stopReader(): js.Promise[Unit] = js.native
  }
}
