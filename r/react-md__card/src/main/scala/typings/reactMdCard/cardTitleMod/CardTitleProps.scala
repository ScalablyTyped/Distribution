package typings.reactMdCard.cardTitleMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTitleProps extends HTMLAttributes[HTMLHeadingElement] {
  /**
    * Boolean if the title should not be able to line-wrap and will ellipsis long
    * text.
    */
  var noWrap: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the title should be smaller than normal. You should usually
    * enable this prop when using the `CardSubtitle` with this component in the
    * `CardHeader`.
    */
  var small: js.UndefOr[Boolean] = js.native
}

object CardTitleProps {
  @scala.inline
  def apply(): CardTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTitleProps]
  }
  @scala.inline
  implicit class CardTitlePropsOps[Self <: CardTitleProps] (val x: Self) extends AnyVal {
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
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
  }
  
}

