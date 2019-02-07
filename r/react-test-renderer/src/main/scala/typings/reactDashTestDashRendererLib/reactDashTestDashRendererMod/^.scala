package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-test-renderer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def act(callback: js.Function0[js.UndefOr[scala.Unit]]): reactDashTestDashRendererLib.reactDashTestDashRendererMod.DebugPromiseLike | js.Object = js.native
  def create(nextElement: reactLib.reactMod.ReactNs.ReactElement[_]): reactDashTestDashRendererLib.reactDashTestDashRendererMod.ReactTestRenderer = js.native
  def create(
    nextElement: reactLib.reactMod.ReactNs.ReactElement[_],
    options: reactDashTestDashRendererLib.reactDashTestDashRendererMod.TestRendererOptions
  ): reactDashTestDashRendererLib.reactDashTestDashRendererMod.ReactTestRenderer = js.native
}

