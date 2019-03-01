package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRendererOptions extends js.Object {
  def createNodeMock(element: reactLib.reactMod.ReactNs.ReactElement[_]): js.Any
}

object TestRendererOptions {
  @scala.inline
  def apply(createNodeMock: js.Function1[reactLib.reactMod.ReactNs.ReactElement[_], js.Any]): TestRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createNodeMock")(createNodeMock)
    __obj.asInstanceOf[TestRendererOptions]
  }
}

