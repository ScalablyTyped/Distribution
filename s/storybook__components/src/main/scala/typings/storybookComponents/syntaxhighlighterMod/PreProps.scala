package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProps extends js.Object {
  var padded: js.UndefOr[Boolean] = js.native
}

object PreProps {
  @scala.inline
  def apply(): PreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreProps]
  }
  @scala.inline
  implicit class PrePropsOps[Self <: PreProps] (val x: Self) extends AnyVal {
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
    def setPadded(value: Boolean): Self = this.set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadded: Self = this.set("padded", js.undefined)
  }
  
}

