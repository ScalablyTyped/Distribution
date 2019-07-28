package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeMod.addonsNs.TestModuleStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "addons")
@js.native
object addonsNs extends js.Object {
  trait TestModuleStatic extends js.Object {
    def markTestCompleted(): Unit
    def markTestPassed(indicator: js.Any): Unit
    def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]): Unit
  }
  
  val TestModule: TestModuleStatic = js.native
  type TestModule = TestModuleStatic
}

