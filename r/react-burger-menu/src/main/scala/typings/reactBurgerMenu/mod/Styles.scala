package typings.reactBurgerMenu.mod

import typings.reactBurgerMenu.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  var bmBurgerBars: PartialCSSStyleDeclaratio = js.native
  var bmBurgerButton: PartialCSSStyleDeclaratio = js.native
  var bmCross: PartialCSSStyleDeclaratio = js.native
  var bmCrossButton: PartialCSSStyleDeclaratio = js.native
  var bmItemList: PartialCSSStyleDeclaratio = js.native
  var bmMenu: PartialCSSStyleDeclaratio = js.native
  var bmMenuWrap: PartialCSSStyleDeclaratio = js.native
  var bmMorphShape: PartialCSSStyleDeclaratio = js.native
  var bmOverlay: PartialCSSStyleDeclaratio = js.native
}

object Styles {
  @scala.inline
  def apply(
    bmBurgerBars: PartialCSSStyleDeclaratio,
    bmBurgerButton: PartialCSSStyleDeclaratio,
    bmCross: PartialCSSStyleDeclaratio,
    bmCrossButton: PartialCSSStyleDeclaratio,
    bmItemList: PartialCSSStyleDeclaratio,
    bmMenu: PartialCSSStyleDeclaratio,
    bmMenuWrap: PartialCSSStyleDeclaratio,
    bmMorphShape: PartialCSSStyleDeclaratio,
    bmOverlay: PartialCSSStyleDeclaratio
  ): Styles = {
    val __obj = js.Dynamic.literal(bmBurgerBars = bmBurgerBars.asInstanceOf[js.Any], bmBurgerButton = bmBurgerButton.asInstanceOf[js.Any], bmCross = bmCross.asInstanceOf[js.Any], bmCrossButton = bmCrossButton.asInstanceOf[js.Any], bmItemList = bmItemList.asInstanceOf[js.Any], bmMenu = bmMenu.asInstanceOf[js.Any], bmMenuWrap = bmMenuWrap.asInstanceOf[js.Any], bmMorphShape = bmMorphShape.asInstanceOf[js.Any], bmOverlay = bmOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
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
    def setBmBurgerButton(value: PartialCSSStyleDeclaratio): Self = this.set("bmBurgerButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmCross(value: PartialCSSStyleDeclaratio): Self = this.set("bmCross", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmCrossButton(value: PartialCSSStyleDeclaratio): Self = this.set("bmCrossButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmItemList(value: PartialCSSStyleDeclaratio): Self = this.set("bmItemList", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmMenu(value: PartialCSSStyleDeclaratio): Self = this.set("bmMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmMenuWrap(value: PartialCSSStyleDeclaratio): Self = this.set("bmMenuWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmMorphShape(value: PartialCSSStyleDeclaratio): Self = this.set("bmMorphShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setBmOverlay(value: PartialCSSStyleDeclaratio): Self = this.set("bmOverlay", value.asInstanceOf[js.Any])
  }
  
}

