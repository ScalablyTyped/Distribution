package typings.reactMdCard.cardHeaderMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactMdCard.reactMdCardStrings.bottom
import typings.reactMdCard.reactMdCardStrings.center
import typings.reactMdCard.reactMdCardStrings.none
import typings.reactMdCard.reactMdCardStrings.top
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardHeaderProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Optional children to render after the main `children` in the component.
    * This is a good place to add expander buttons or overflow menus.
    *
    * This using the `TextIconSpacing` component behind the scenes, so some
    * additional margin will be added to separate the content.
    */
  var afterChildren: js.UndefOr[ReactNode] = js.native
  /**
    * This is how to align the items within the header component. It's really
    * just a simple pass-through to `align-items`.
    */
  var align: js.UndefOr[top | center | bottom | none] = js.native
  /**
    * Optional children to render before the main `children` in the component.
    * This is a good place to add `Avatar`s or additional `Media` to display with
    * the card.
    *
    * This using the `TextIconSpacing` component behind the scenes, so some
    * additional margin will be added to separate the content.
    */
  var beforeChildren: js.UndefOr[ReactNode] = js.native
  /**
    * Since it's possible to add content before or after the main children, the
    * main content gets wrapped in a small `<span>` to help stack the `CardTitle`
    * and `CardSubtitle` components while still allowing content to be centered
    * vertically. If you need to add additional styles to this element for some
    * reason, you can use this class name to do so.
    */
  var contentClassName: js.UndefOr[String] = js.native
}

object CardHeaderProps {
  @scala.inline
  def apply(): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeaderProps]
  }
  @scala.inline
  implicit class CardHeaderPropsOps[Self <: CardHeaderProps] (val x: Self) extends AnyVal {
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
    def setAfterChildren(value: ReactNode): Self = this.set("afterChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterChildren: Self = this.set("afterChildren", js.undefined)
    @scala.inline
    def setAlign(value: top | center | bottom | none): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBeforeChildren(value: ReactNode): Self = this.set("beforeChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeChildren: Self = this.set("beforeChildren", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
  }
  
}

