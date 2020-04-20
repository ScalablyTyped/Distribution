package typings.reactTestRenderer.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRendererOptions extends js.Object {
  def createNodeMock(element: ReactElement): js.Any
}

object TestRendererOptions {
  @scala.inline
  def apply(createNodeMock: ReactElement => js.Any): TestRendererOptions = {
    val __obj = js.Dynamic.literal(createNodeMock = js.Any.fromFunction1(createNodeMock))
    __obj.asInstanceOf[TestRendererOptions]
  }
}

