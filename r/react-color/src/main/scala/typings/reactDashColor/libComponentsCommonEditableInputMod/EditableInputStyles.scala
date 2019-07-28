package typings.reactDashColor.libComponentsCommonEditableInputMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableInputStyles extends js.Object {
  var input: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var wrap: js.UndefOr[CSSProperties] = js.undefined
}

object EditableInputStyles {
  @scala.inline
  def apply(input: CSSProperties = null, label: CSSProperties = null, wrap: CSSProperties = null): EditableInputStyles = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (label != null) __obj.updateDynamic("label")(label)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[EditableInputStyles]
  }
}

