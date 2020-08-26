package typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 8
    */
  var backspace: Double = js.native
  /**
    * @default 46
    */
  var deleteKey: Double = js.native
  /**
    * @default 188
    */
  var delimiter: Double | `false` = js.native
  /**
    * @default 40
    */
  var downArrow: Double = js.native
  /**
    * @default 13
    */
  var enter: Double = js.native
  /**
    * @default 27
    */
  var escape: Double = js.native
  /**
    * @default 37
    */
  var leftArrow: Double = js.native
  /**
    * @default 34
    */
  var pageDown: Double = js.native
  /**
    * @default 33
    */
  var pageUp: Double = js.native
  /**
    * @default 39
    */
  var rightArrow: Double = js.native
  /**
    * @default 38
    */
  var upArrow: Double = js.native
}

object Impl {
  @scala.inline
  def apply(
    backspace: Double,
    deleteKey: Double,
    delimiter: Double | `false`,
    downArrow: Double,
    enter: Double,
    escape: Double,
    leftArrow: Double,
    pageDown: Double,
    pageUp: Double,
    rightArrow: Double,
    upArrow: Double
  ): Impl = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any], deleteKey = deleteKey.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], pageDown = pageDown.asInstanceOf[js.Any], pageUp = pageUp.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setBackspace(value: Double): Self = this.set("backspace", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteKey(value: Double): Self = this.set("deleteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: Double | `false`): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownArrow(value: Double): Self = this.set("downArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnter(value: Double): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscape(value: Double): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftArrow(value: Double): Self = this.set("leftArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDown(value: Double): Self = this.set("pageDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageUp(value: Double): Self = this.set("pageUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightArrow(value: Double): Self = this.set("rightArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpArrow(value: Double): Self = this.set("upArrow", value.asInstanceOf[js.Any])
  }
  
}

