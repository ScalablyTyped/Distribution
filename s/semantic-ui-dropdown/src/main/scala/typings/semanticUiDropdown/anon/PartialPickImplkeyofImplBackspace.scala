package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl>> */
trait PartialPickImplkeyofImplBackspace extends js.Object {
  var backspace: js.UndefOr[Double] = js.undefined
  var deleteKey: js.UndefOr[Double] = js.undefined
  var delimiter: js.UndefOr[Double | `false`] = js.undefined
  var downArrow: js.UndefOr[Double] = js.undefined
  var enter: js.UndefOr[Double] = js.undefined
  var escape: js.UndefOr[Double] = js.undefined
  var leftArrow: js.UndefOr[Double] = js.undefined
  var pageDown: js.UndefOr[Double] = js.undefined
  var pageUp: js.UndefOr[Double] = js.undefined
  var rightArrow: js.UndefOr[Double] = js.undefined
  var upArrow: js.UndefOr[Double] = js.undefined
}

object PartialPickImplkeyofImplBackspace {
  @scala.inline
  def apply(
    backspace: js.UndefOr[Double] = js.undefined,
    deleteKey: js.UndefOr[Double] = js.undefined,
    delimiter: Double | `false` = null,
    downArrow: js.UndefOr[Double] = js.undefined,
    enter: js.UndefOr[Double] = js.undefined,
    escape: js.UndefOr[Double] = js.undefined,
    leftArrow: js.UndefOr[Double] = js.undefined,
    pageDown: js.UndefOr[Double] = js.undefined,
    pageUp: js.UndefOr[Double] = js.undefined,
    rightArrow: js.UndefOr[Double] = js.undefined,
    upArrow: js.UndefOr[Double] = js.undefined
  ): PartialPickImplkeyofImplBackspace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backspace)) __obj.updateDynamic("backspace")(backspace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteKey)) __obj.updateDynamic("deleteKey")(deleteKey.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(downArrow)) __obj.updateDynamic("downArrow")(downArrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftArrow)) __obj.updateDynamic("leftArrow")(leftArrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageDown)) __obj.updateDynamic("pageDown")(pageDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageUp)) __obj.updateDynamic("pageUp")(pageUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightArrow)) __obj.updateDynamic("rightArrow")(rightArrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upArrow)) __obj.updateDynamic("upArrow")(upArrow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBackspace]
  }
}

