package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableAttrs extends js.Object {
  /**
  	 * Callback for on cell blur.
  	 */
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * Callback for onKeyDown.
  	 */
  var onKeyDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * Placeholder text to use for the cell editor field.
  	 */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function to pass a reference to the input editor field.
  	 */
  var ref: js.UndefOr[js.Function1[/* ref */ js.Any, _]] = js.undefined
}

object EditableAttrs {
  @scala.inline
  def apply(
    onBlur: js.Function0[scala.Unit] = null,
    onKeyDown: js.Function0[scala.Unit] = null,
    placeholder: java.lang.String = null,
    ref: js.Function1[/* ref */ js.Any, _] = null
  ): EditableAttrs = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[EditableAttrs]
  }
}

