package typings.reachMenuButton

import typings.reachMenuButton.mod.ButtonRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@reach/menu-button.@reach/menu-button.State> */
trait PartialState extends js.Object {
  var buttonId: js.UndefOr[String] = js.undefined
  var buttonRect: js.UndefOr[ButtonRect] = js.undefined
  var closingWithClick: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var selectionIndex: js.UndefOr[Double] = js.undefined
}

object PartialState {
  @scala.inline
  def apply(
    buttonId: String = null,
    buttonRect: ButtonRect = null,
    closingWithClick: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    selectionIndex: Int | Double = null
  ): PartialState = {
    val __obj = js.Dynamic.literal()
    if (buttonId != null) __obj.updateDynamic("buttonId")(buttonId.asInstanceOf[js.Any])
    if (buttonRect != null) __obj.updateDynamic("buttonRect")(buttonRect.asInstanceOf[js.Any])
    if (!js.isUndefined(closingWithClick)) __obj.updateDynamic("closingWithClick")(closingWithClick.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (selectionIndex != null) __obj.updateDynamic("selectionIndex")(selectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialState]
  }
}

