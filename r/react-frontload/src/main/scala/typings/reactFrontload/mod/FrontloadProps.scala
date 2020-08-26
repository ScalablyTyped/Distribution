package typings.reactFrontload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrontloadProps extends js.Object {
  var noServerRender: js.UndefOr[Boolean] = js.native
}

object FrontloadProps {
  @scala.inline
  def apply(): FrontloadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrontloadProps]
  }
  @scala.inline
  implicit class FrontloadPropsOps[Self <: FrontloadProps] (val x: Self) extends AnyVal {
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
    def setNoServerRender(value: Boolean): Self = this.set("noServerRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoServerRender: Self = this.set("noServerRender", js.undefined)
  }
  
}

