package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTextAreaProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Indicates whether height of the textarea fits the content or not. */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called on change.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLTextAreaElement], 
      /* data */ TextAreaProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called on input.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onInput: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLTextAreaElement], 
      /* data */ TextAreaProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Indicates row count for a TextArea. */
  var rows: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Custom TextArea style. */
  var style: js.UndefOr[js.Object] = js.undefined
  /** The value of the textarea. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StrictTextAreaProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* event */ reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLTextAreaElement], /* data */ TextAreaProps) => scala.Unit = null,
    onInput: (/* event */ reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLTextAreaElement], /* data */ TextAreaProps) => scala.Unit = null,
    rows: scala.Double | java.lang.String = null,
    style: js.Object = null,
    value: scala.Double | java.lang.String = null
  ): StrictTextAreaProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction2(onInput))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTextAreaProps]
  }
}

