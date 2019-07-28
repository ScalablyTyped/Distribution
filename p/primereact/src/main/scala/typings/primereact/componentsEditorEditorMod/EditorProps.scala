package typings.primereact.componentsEditorEditorMod

import typings.primereact.Anon_DeltaHtmlValue
import typings.primereact.Anon_OldRange
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var formats: js.UndefOr[js.Array[_]] = js.undefined
  var headerTemplate: js.UndefOr[Element] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modules: js.UndefOr[js.Any] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Anon_OldRange, Unit]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* e */ Anon_DeltaHtmlValue, Unit]] = js.undefined
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
    onSelectionChange: /* e */ Anon_OldRange => Unit = null,
    onTextChange: /* e */ Anon_DeltaHtmlValue => Unit = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    theme: String = null,
    value: String = null
  ): EditorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditorProps]
  }
}

