package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The default text in the TextInput.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the TextInput can be used.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether multiple lines can be inputted into the TextInput.
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the TextInput text is changed. The new text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Whether the TextInput can be written to by the user.
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether characters are hidden in the TextInput. Commonly used for passwords.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the TextInput can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    children: java.lang.String = null,
    column: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    row: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TextInputProps]
  }
}

