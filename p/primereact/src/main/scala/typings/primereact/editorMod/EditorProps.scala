package typings.primereact.editorMod

import typings.primereact.AnonHtmlValue
import typings.primereact.AnonOldRange
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var formats: js.UndefOr[js.Array[_]] = js.undefined
  var headerTemplate: js.UndefOr[Element] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modules: js.UndefOr[js.Any] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ AnonOldRange, Unit]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* e */ AnonHtmlValue, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply(
    className: String = null,
    formats: js.Array[_] = null,
    headerTemplate: Element = null,
    id: String = null,
    modules: js.Any = null,
    onSelectionChange: /* e */ AnonOldRange => Unit = null,
    onTextChange: /* e */ AnonHtmlValue => Unit = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    theme: String = null,
    value: String = null
  ): EditorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorProps]
  }
}

