package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableAttrs extends js.Object {
  /**
  	 * Callback for on cell blur.
  	 */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Callback for onKeyDown.
  	 */
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Placeholder text to use for the cell editor field.
  	 */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
  	 * Function to pass a reference to the input editor field.
  	 */
  var ref: js.UndefOr[js.Function1[/* ref */ js.Any, _]] = js.undefined
}

object EditableAttrs {
  @scala.inline
  def apply(
    onBlur: () => Unit = null,
    onKeyDown: () => Unit = null,
    placeholder: String = null,
    ref: /* ref */ js.Any => _ = null
  ): EditableAttrs = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction0(onKeyDown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    __obj.asInstanceOf[EditableAttrs]
  }
}

