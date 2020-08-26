package typings.reactDataGrid.AdazzleReactDataGridPlugins

import typings.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typings.reactDataGrid.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.native
  var editorDisplayValue: js.UndefOr[js.Function2[/* column */ ExcelColumn, /* value */ js.Any, String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var label: js.UndefOr[js.Any] = js.native
  var onCommit: js.UndefOr[js.Function0[Unit]] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.native
  var options: js.UndefOr[js.Array[Id]] = js.native
  var resultIdentifier: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var valueParams: js.UndefOr[js.Array[String]] = js.native
}

object AutoCompleteEditorProps {
  @scala.inline
  def apply(): AutoCompleteEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteEditorProps]
  }
  @scala.inline
  implicit class AutoCompleteEditorPropsOps[Self <: AutoCompleteEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: ExcelColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setEditorDisplayValue(value: (/* column */ ExcelColumn, /* value */ js.Any) => String): Self = this.set("editorDisplayValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditorDisplayValue: Self = this.set("editorDisplayValue", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnCommit(value: () => Unit): Self = this.set("onCommit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCommit: Self = this.set("onCommit", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: () => Unit): Self = this.set("onKeyDown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Id*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Id]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setResultIdentifier(value: String): Self = this.set("resultIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultIdentifier: Self = this.set("resultIdentifier", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueParamsVarargs(value: String*): Self = this.set("valueParams", js.Array(value :_*))
    @scala.inline
    def setValueParams(value: js.Array[String]): Self = this.set("valueParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueParams: Self = this.set("valueParams", js.undefined)
  }
  
}

