package typings.atPulumiPulumi

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/tests/util", JSImport.Namespace)
@js.native
object testsUtilMod extends js.Object {
  def assertAsyncThrows(test: js.Function0[js.Promise[Unit]]): js.Promise[String] = js.native
  def asyncTest(test: js.Function0[js.Promise[Unit]]): js.Function1[/* func */ MochaFunc, Unit] = js.native
  type MochaFunc = js.Function1[/* err */ Error, Unit]
}

