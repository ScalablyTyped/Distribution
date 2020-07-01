package typings.rcTextarea.resizableTextAreaMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaState extends js.Object {
  /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
  var resizeStatus: js.UndefOr[RESIZE_STATUS] = js.undefined
  var textareaStyles: js.UndefOr[CSSProperties] = js.undefined
}

object TextAreaState {
  @scala.inline
  def apply(resizeStatus: RESIZE_STATUS = null, textareaStyles: CSSProperties = null): TextAreaState = {
    val __obj = js.Dynamic.literal()
    if (resizeStatus != null) __obj.updateDynamic("resizeStatus")(resizeStatus.asInstanceOf[js.Any])
    if (textareaStyles != null) __obj.updateDynamic("textareaStyles")(textareaStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaState]
  }
}

