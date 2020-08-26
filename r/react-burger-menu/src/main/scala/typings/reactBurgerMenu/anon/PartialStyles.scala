package typings.reactBurgerMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-burger-menu.react-burger-menu.Styles> */
@js.native
trait PartialStyles extends js.Object {
  var bmBurgerBars: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmBurgerButton: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmCross: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmCrossButton: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmItemList: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmMenu: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmMenuWrap: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmMorphShape: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var bmOverlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object PartialStyles {
  @scala.inline
  def apply(): PartialStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyles]
  }
  @scala.inline
  implicit class PartialStylesOps[Self <: PartialStyles] (val x: Self) extends AnyVal {
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
    def setBmBurgerBars(value: PartialCSSStyleDeclaratio): Self = this.set("bmBurgerBars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmBurgerBars: Self = this.set("bmBurgerBars", js.undefined)
    @scala.inline
    def setBmBurgerButton(value: PartialCSSStyleDeclaratio): Self = this.set("bmBurgerButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmBurgerButton: Self = this.set("bmBurgerButton", js.undefined)
    @scala.inline
    def setBmCross(value: PartialCSSStyleDeclaratio): Self = this.set("bmCross", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmCross: Self = this.set("bmCross", js.undefined)
    @scala.inline
    def setBmCrossButton(value: PartialCSSStyleDeclaratio): Self = this.set("bmCrossButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmCrossButton: Self = this.set("bmCrossButton", js.undefined)
    @scala.inline
    def setBmItemList(value: PartialCSSStyleDeclaratio): Self = this.set("bmItemList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmItemList: Self = this.set("bmItemList", js.undefined)
    @scala.inline
    def setBmMenu(value: PartialCSSStyleDeclaratio): Self = this.set("bmMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmMenu: Self = this.set("bmMenu", js.undefined)
    @scala.inline
    def setBmMenuWrap(value: PartialCSSStyleDeclaratio): Self = this.set("bmMenuWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmMenuWrap: Self = this.set("bmMenuWrap", js.undefined)
    @scala.inline
    def setBmMorphShape(value: PartialCSSStyleDeclaratio): Self = this.set("bmMorphShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmMorphShape: Self = this.set("bmMorphShape", js.undefined)
    @scala.inline
    def setBmOverlay(value: PartialCSSStyleDeclaratio): Self = this.set("bmOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBmOverlay: Self = this.set("bmOverlay", js.undefined)
  }
  
}

