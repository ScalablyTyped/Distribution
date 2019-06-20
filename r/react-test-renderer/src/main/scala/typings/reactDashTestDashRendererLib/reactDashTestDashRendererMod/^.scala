package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-test-renderer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def act(callback: js.Function0[js.UndefOr[scala.Unit]]): DebugPromiseLike | js.Object = js.native
  def create(nextElement: reactLib.reactMod.ReactElement): ReactTestRenderer = js.native
  def create(nextElement: reactLib.reactMod.ReactElement, options: TestRendererOptions): ReactTestRenderer = js.native
}

