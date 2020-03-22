package typings.semanticUiDropdown

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
    backspace: Int | Double = null,
    deleteKey: Int | Double = null,
    delimiter: Double | `false` = null,
    downArrow: Int | Double = null,
    enter: Int | Double = null,
    escape: Int | Double = null,
    leftArrow: Int | Double = null,
    pageDown: Int | Double = null,
    pageUp: Int | Double = null,
    rightArrow: Int | Double = null,
    upArrow: Int | Double = null
  ): PartialPickImplkeyofImplBackspace = {
    val __obj = js.Dynamic.literal()
    if (backspace != null) __obj.updateDynamic("backspace")(backspace.asInstanceOf[js.Any])
    if (deleteKey != null) __obj.updateDynamic("deleteKey")(deleteKey.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (downArrow != null) __obj.updateDynamic("downArrow")(downArrow.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (leftArrow != null) __obj.updateDynamic("leftArrow")(leftArrow.asInstanceOf[js.Any])
    if (pageDown != null) __obj.updateDynamic("pageDown")(pageDown.asInstanceOf[js.Any])
    if (pageUp != null) __obj.updateDynamic("pageUp")(pageUp.asInstanceOf[js.Any])
    if (rightArrow != null) __obj.updateDynamic("rightArrow")(rightArrow.asInstanceOf[js.Any])
    if (upArrow != null) __obj.updateDynamic("upArrow")(upArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBackspace]
  }
}

