package typings.reactDashNativeDashHoneywellDashScanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-honeywell-scanner", JSImport.Namespace)
@js.native
object reactDashNativeDashHoneywellDashScannerMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    val isCompatible: Boolean = js.native
    def off(eventName: String, handler: js.Function0[Unit]): Unit = js.native
    def on(eventName: String, handler: js.Function1[/* event */ String | Null, Unit]): Unit = js.native
    def startReader(): js.Promise[Boolean] = js.native
    def stopReader(): js.Promise[Unit] = js.native
  }
  
}

