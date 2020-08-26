package typings.reactTestRenderer.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRendererOptions extends js.Object {
  def createNodeMock(element: ReactElement): js.Any = js.native
}

object TestRendererOptions {
  @scala.inline
  def apply(createNodeMock: ReactElement => js.Any): TestRendererOptions = {
    val __obj = js.Dynamic.literal(createNodeMock = js.Any.fromFunction1(createNodeMock))
    __obj.asInstanceOf[TestRendererOptions]
  }
  @scala.inline
  implicit class TestRendererOptionsOps[Self <: TestRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateNodeMock(value: ReactElement => js.Any): Self = this.set("createNodeMock", js.Any.fromFunction1(value))
  }
  
}

