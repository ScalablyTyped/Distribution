package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "addons")
@js.native
object addonsNs extends js.Object {
  trait TestModuleStatic extends js.Object {
    def markTestCompleted(): scala.Unit
    def markTestPassed(indicator: js.Any): scala.Unit
    def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], scala.Unit]): scala.Unit
  }
  
  val TestModule: TestModuleStatic = js.native
  type TestModule = TestModuleStatic
}

