package typings
package reactDashNativeDashHoneywellDashScannerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-honeywell-scanner", JSImport.Namespace)
@js.native
object reactDashNativeDashHoneywellDashScannerMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    val isCompatible: scala.Boolean = js.native
    def off(eventName: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
    def on(
      eventName: java.lang.String,
      handler: js.Function1[/* event */ java.lang.String | scala.Null, scala.Unit]
    ): scala.Unit = js.native
    def startReader(): js.Promise[scala.Boolean] = js.native
    def stopReader(): js.Promise[scala.Unit] = js.native
  }
  
}

