package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.CSSProperties
import typings.slate.slateMod.SchemaProperties
import typings.slate.slateMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicEditorProps extends js.Object {
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[OnChangeFn] = js.undefined
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var plugins: js.UndefOr[Plugins] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[SchemaProperties] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var value: Value
}

object BasicEditorProps {
  @scala.inline
  def apply(
    value: Value,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    onChange: /* change */ OnChangeParam => js.Any = null,
    placeholder: js.Any = null,
    plugins: Plugins = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    schema: SchemaProperties = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null
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

