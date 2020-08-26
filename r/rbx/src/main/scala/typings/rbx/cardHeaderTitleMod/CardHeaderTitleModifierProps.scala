package typings.rbx.cardHeaderTitleMod

import typings.rbx.rbxStrings.centered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardHeaderTitleModifierProps extends js.Object {
  var align: js.UndefOr[centered] = js.native
}

object CardHeaderTitleModifierProps {
  @scala.inline
  def apply(): CardHeaderTitleModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeaderTitleModifierProps]
  }
  @scala.inline
  implicit class CardHeaderTitleModifierPropsOps[Self <: CardHeaderTitleModifierProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: centered): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
  
}

