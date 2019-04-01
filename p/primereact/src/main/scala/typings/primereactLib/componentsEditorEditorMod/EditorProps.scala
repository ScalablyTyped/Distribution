package typings
package primereactLib.componentsEditorEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var formats: js.UndefOr[js.Array[_]] = js.undefined
  var headerTemplate: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OldRange, scala.Unit]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DeltaHtmlValue, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    formats: js.Array[_] = null,
    headerTemplate: reactLib.reactMod.Global.JSXNs.Element = null,
    id: java.lang.String = null,
    onSelectionChange: /* e */ primereactLib.Anon_OldRange => scala.Unit = null,
    onTextChange: /* e */ primereactLib.Anon_DeltaHtmlValue => scala.Unit = null,
    placeholder: java.lang.String = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    value: java.lang.String = null
  ): EditorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditorProps]
  }
}

