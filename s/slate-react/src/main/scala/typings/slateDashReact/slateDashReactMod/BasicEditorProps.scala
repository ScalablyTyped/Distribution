package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.CSSProperties
import typings.slate.slateMod.Controller
import typings.slate.slateMod.SchemaProperties
import typings.slate.slateMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicEditorProps[T /* <: Controller */] extends js.Object {
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[OnChangeFn] = js.undefined
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var plugins: js.UndefOr[Plugins[T]] = js.undefined
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
  def apply[T /* <: Controller */](
    value: Value,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    onChange: /* change */ OnChangeParam => js.Any = null,
    placeholder: js.Any = null,
    plugins: Plugins[T] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    schema: SchemaProperties = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null
  ): BasicEditorProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicEditorProps[T]]
  }
}

