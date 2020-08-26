package typings.storybookComponents.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.native
}

object ContentProps {
  @scala.inline
  def apply(): ContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentProps]
  }
  @scala.inline
  implicit class ContentPropsOps[Self <: ContentProps] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
  }
  
}

