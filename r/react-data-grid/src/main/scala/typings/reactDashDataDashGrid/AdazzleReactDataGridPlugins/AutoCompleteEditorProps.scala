package typings.reactDashDataDashGrid.AdazzleReactDataGridPlugins

import typings.reactDashDataDashGrid.AdazzleReactDataGrid.ExcelColumn
import typings.reactDashDataDashGrid.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.undefined
  var editorDisplayValue: js.UndefOr[js.Function2[/* column */ ExcelColumn, /* value */ js.Any, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[js.Any] = js.undefined
  var onCommit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  var resultIdentifier: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var valueParams: js.UndefOr[js.Array[String]] = js.undefined
}

object AutoCompleteEditorProps {
  @scala.inline
  def apply(
    column: ExcelColumn = null,
    editorDisplayValue: (/* column */ ExcelColumn, /* value */ js.Any) => String = null,
    height: Int | Double = null,
    label: js.Any = null,
    onCommit: () => Unit = null,
    onFocus: () => Unit = null,
    onKeyDown: () => Unit = null,
    options: js.Array[Anon_Id] = null,
    resultIdentifier: String = null,
    search: String = null,
    value: js.Any = null,
    valueParams: js.Array[String] = null
  ): AutoCompleteEditorProps = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (editorDisplayValue != null) __obj.updateDynamic("editorDisplayValue")(js.Any.fromFunction2(editorDisplayValue))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onCommit != null) __obj.updateDynamic("onCommit")(js.Any.fromFunction0(onCommit))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction0(onKeyDown))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resultIdentifier != null) __obj.updateDynamic("resultIdentifier")(resultIdentifier.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueParams != null) __obj.updateDynamic("valueParams")(valueParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteEditorProps]
  }
}

