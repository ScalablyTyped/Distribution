package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends ReactMarkdownProps {
  val definitions: js.UndefOr[js.Object] = js.native
}

object RenderProps {
  @scala.inline
  def apply(): RenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
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
    def setDefinitions(value: js.Object): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
  }
  
}

