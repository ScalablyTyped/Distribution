package typings
package reactDashNativeDashUuidDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-uuid-generator", JSImport.Namespace)
@js.native
object reactDashNativeDashUuidDashGeneratorMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def getRandomUUID(): stdLib.Promise[java.lang.String] = js.native
    def getRandomUUID(callback: js.Function1[/* uuid */ java.lang.String, scala.Unit]): scala.Unit = js.native
  }
  
}

