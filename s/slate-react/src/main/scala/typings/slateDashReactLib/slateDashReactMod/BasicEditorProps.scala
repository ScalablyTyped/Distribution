package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicEditorProps extends js.Object {
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* change */ slateDashReactLib.Anon_Operations, _]] = js.undefined
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var schema: js.UndefOr[slateLib.slateMod.SchemaProperties] = js.undefined
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: slateLib.slateMod.Value
}

object BasicEditorProps {
  @scala.inline
  def apply(
    value: slateLib.slateMod.Value,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    onChange: /* change */ slateDashReactLib.Anon_Operations => _ = null,
    placeholder: js.Any = null,
    plugins: js.Array[Plugin] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    schema: slateLib.slateMod.SchemaProperties = null,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null
  ): BasicEditorProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (role != null) __obj.updateDynamic("role")(role)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicEditorProps]
  }
}

