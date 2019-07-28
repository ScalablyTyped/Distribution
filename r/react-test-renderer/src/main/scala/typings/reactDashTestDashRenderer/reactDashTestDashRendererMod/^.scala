package typings.reactDashTestDashRenderer.reactDashTestDashRendererMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-test-renderer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  def create(nextElement: ReactElement): ReactTestRenderer = js.native
  def create(nextElement: ReactElement, options: TestRendererOptions): ReactTestRenderer = js.native
}

