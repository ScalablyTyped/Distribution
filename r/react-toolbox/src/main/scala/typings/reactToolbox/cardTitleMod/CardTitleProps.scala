package typings.reactToolbox.cardTitleMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTitleProps extends Props {
  /**
    * A string URL or Element to specify an avatar in the left side of the title.
    */
  var avatar: js.UndefOr[ReactNode] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Text used for the sub header of the card.
    */
  var subtitle: js.UndefOr[ReactNode] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[CardTitleTheme] = js.native
  /**
    * Text used for the title of the card.
    */
  var title: js.UndefOr[ReactNode] = js.native
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
    def setAvatar(value: ReactNode): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setSubtitle(value: ReactNode): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTheme(value: CardTitleTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

