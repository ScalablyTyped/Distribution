package typings.reactDashNativeDashUuidDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-uuid-generator", JSImport.Namespace)
@js.native
object reactDashNativeDashUuidDashGeneratorMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def getRandomUUID(): js.Promise[String] = js.native
    def getRandomUUID(callback: js.Function1[/* uuid */ String, Unit]): Unit = js.native
  }
  
}

