package typings.reactMdCard.cardMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Boolean if the card should use a border instead of box-shadow. Enabling
    * this prop will always disable the `raiseable` prop.
    */
  var bordered: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the card should no longer be `display: inline-block`, but
    * instead `display: block; width: 100%;`.
    */
  var fullWidth: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the card should gain additional box-shadow elevation once
    * hovered.
    */
  var raiseable: js.UndefOr[Boolean] = js.native
}

object CardProps {
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  @scala.inline
  implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setRaiseable(value: Boolean): Self = this.set("raiseable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaiseable: Self = this.set("raiseable", js.undefined)
  }
  
}

