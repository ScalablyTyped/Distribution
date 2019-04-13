package typings
package reactDashColorLib.libComponentsCommonEditableInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableInputStyles extends js.Object {
  var input: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var wrap: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object EditableInputStyles {
  @scala.inline
  def apply(
    input: reactLib.reactMod.CSSProperties = null,
    label: reactLib.reactMod.CSSProperties = null,
    wrap: reactLib.reactMod.CSSProperties = null
  ): EditableInputStyles = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (label != null) __obj.updateDynamic("label")(label)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[EditableInputStyles]
  }
}

