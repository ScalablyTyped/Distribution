package typings.storybookComponents.separatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparatorProps extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
}

object SeparatorProps {
  @scala.inline
  def apply(): SeparatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorProps]
  }
  @scala.inline
  implicit class SeparatorPropsOps[Self <: SeparatorProps] (val x: Self) extends AnyVal {
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
  
}

