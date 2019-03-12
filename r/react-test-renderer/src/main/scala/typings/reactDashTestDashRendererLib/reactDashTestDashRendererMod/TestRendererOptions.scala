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
  def apply(createNodeMock: reactLib.reactMod.ReactNs.ReactElement[_] => js.Any): TestRendererOptions = {
    val __obj = js.Dynamic.literal(createNodeMock = js.Any.fromFunction1(createNodeMock))
  
    __obj.asInstanceOf[TestRendererOptions]
  }
}

