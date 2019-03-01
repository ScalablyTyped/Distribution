package typings
package reactDashDataDashGridLib.AdazzleReactDataGridPluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteEditorProps extends js.Object {
  var column: js.UndefOr[reactDashDataDashGridLib.AdazzleReactDataGridNs.ExcelColumn] = js.undefined
  var editorDisplayValue: js.UndefOr[
    js.Function2[
      /* column */ reactDashDataDashGridLib.AdazzleReactDataGridNs.ExcelColumn, 
      /* value */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[js.Any] = js.undefined
  var onCommit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var options: js.UndefOr[js.Array[reactDashDataDashGridLib.Anon_Id]] = js.undefined
  var resultIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var valueParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AutoCompleteEditorProps {
  @scala.inline
  def apply(
    column: reactDashDataDashGridLib.AdazzleReactDataGridNs.ExcelColumn = null,
    editorDisplayValue: js.Function2[
      /* column */ reactDashDataDashGridLib.AdazzleReactDataGridNs.ExcelColumn, 
      /* value */ js.Any, 
      java.lang.String
    ] = null,
    height: scala.Int | scala.Double = null,
    label: js.Any = null,
    onCommit: js.Function0[scala.Unit] = null,
    onFocus: js.Function0[scala.Unit] = null,
    onKeyDown: js.Function0[scala.Unit] = null,
    options: js.Array[reactDashDataDashGridLib.Anon_Id] = null,
    resultIdentifier: java.lang.String = null,
    search: java.lang.String = null,
    value: js.Any = null,
    valueParams: js.Array[java.lang.String] = null
  ): AutoCompleteEditorProps = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (editorDisplayValue != null) __obj.updateDynamic("editorDisplayValue")(editorDisplayValue)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onCommit != null) __obj.updateDynamic("onCommit")(onCommit)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (options != null) __obj.updateDynamic("options")(options)
    if (resultIdentifier != null) __obj.updateDynamic("resultIdentifier")(resultIdentifier)
    if (search != null) __obj.updateDynamic("search")(search)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueParams != null) __obj.updateDynamic("valueParams")(valueParams)
    __obj.asInstanceOf[AutoCompleteEditorProps]
  }
}

