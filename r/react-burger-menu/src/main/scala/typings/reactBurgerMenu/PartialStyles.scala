package typings.reactBurgerMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-burger-menu.react-burger-menu.Styles> */
trait PartialStyles extends js.Object {
  var bmBurgerBars: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmBurgerButton: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmCross: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmCrossButton: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmItemList: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmMenu: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmMenuWrap: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmMorphShape: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var bmOverlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
}

object PartialStyles {
  @scala.inline
  def apply(
    bmBurgerBars: PartialCSSStyleDeclaratio = null,
    bmBurgerButton: PartialCSSStyleDeclaratio = null,
    bmCross: PartialCSSStyleDeclaratio = null,
    bmCrossButton: PartialCSSStyleDeclaratio = null,
    bmItemList: PartialCSSStyleDeclaratio = null,
    bmMenu: PartialCSSStyleDeclaratio = null,
    bmMenuWrap: PartialCSSStyleDeclaratio = null,
    bmMorphShape: PartialCSSStyleDeclaratio = null,
    bmOverlay: PartialCSSStyleDeclaratio = null
  ): PartialStyles = {
    val __obj = js.Dynamic.literal()
    if (bmBurgerBars != null) __obj.updateDynamic("bmBurgerBars")(bmBurgerBars.asInstanceOf[js.Any])
    if (bmBurgerButton != null) __obj.updateDynamic("bmBurgerButton")(bmBurgerButton.asInstanceOf[js.Any])
    if (bmCross != null) __obj.updateDynamic("bmCross")(bmCross.asInstanceOf[js.Any])
    if (bmCrossButton != null) __obj.updateDynamic("bmCrossButton")(bmCrossButton.asInstanceOf[js.Any])
    if (bmItemList != null) __obj.updateDynamic("bmItemList")(bmItemList.asInstanceOf[js.Any])
    if (bmMenu != null) __obj.updateDynamic("bmMenu")(bmMenu.asInstanceOf[js.Any])
    if (bmMenuWrap != null) __obj.updateDynamic("bmMenuWrap")(bmMenuWrap.asInstanceOf[js.Any])
    if (bmMorphShape != null) __obj.updateDynamic("bmMorphShape")(bmMorphShape.asInstanceOf[js.Any])
    if (bmOverlay != null) __obj.updateDynamic("bmOverlay")(bmOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyles]
  }
}

