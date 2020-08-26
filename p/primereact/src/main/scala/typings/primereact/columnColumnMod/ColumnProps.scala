package typings.primereact.columnColumnMod

import typings.primereact.anon.Field
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var bodyClassName: js.UndefOr[String] = js.native
  var bodyStyle: js.UndefOr[js.Object] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var columnKey: js.UndefOr[String] = js.native
  var editor: js.UndefOr[js.Function1[/* props */ js.Any, js.UndefOr[Element]]] = js.native
  var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.native
  var editorValidatorEvent: js.UndefOr[String] = js.native
  var excludeGlobalFilter: js.UndefOr[Boolean] = js.native
  var expander: js.UndefOr[Boolean] = js.native
  var exportable: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterElement: js.UndefOr[js.Object] = js.native
  var filterField: js.UndefOr[String] = js.native
  var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, Unit]] = js.native
  var filterHeaderClassName: js.UndefOr[String] = js.native
  var filterHeaderStyle: js.UndefOr[js.Object] = js.native
  var filterMatchMode: js.UndefOr[String] = js.native
  var filterMaxLength: js.UndefOr[Double] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var filterType: js.UndefOr[String] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var footerClassName: js.UndefOr[String] = js.native
  var footerStyle: js.UndefOr[js.Object] = js.native
  var frozen: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var headerClassName: js.UndefOr[String] = js.native
  var headerStyle: js.UndefOr[js.Object] = js.native
  var loadingBody: js.UndefOr[js.Any] = js.native
  var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  var reorderable: js.UndefOr[Boolean] = js.native
  var rowEditor: js.UndefOr[Boolean] = js.native
  var rowReorder: js.UndefOr[Boolean] = js.native
  var rowReorderIcon: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var sortField: js.UndefOr[String] = js.native
  var sortFunction: js.UndefOr[js.Function1[/* e */ Field, Unit]] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object ColumnProps {
  @scala.inline
  def apply(): ColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProps]
  }
  @scala.inline
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyClassName(value: String): Self = this.set("bodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyClassName: Self = this.set("bodyClassName", js.undefined)
    @scala.inline
    def setBodyStyle(value: js.Object): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setEditor(value: /* props */ js.Any => js.UndefOr[Element]): Self = this.set("editor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setEditorValidator(value: /* props */ js.Any => Boolean): Self = this.set("editorValidator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEditorValidator: Self = this.set("editorValidator", js.undefined)
    @scala.inline
    def setEditorValidatorEvent(value: String): Self = this.set("editorValidatorEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorValidatorEvent: Self = this.set("editorValidatorEvent", js.undefined)
    @scala.inline
    def setExcludeGlobalFilter(value: Boolean): Self = this.set("excludeGlobalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeGlobalFilter: Self = this.set("excludeGlobalFilter", js.undefined)
    @scala.inline
    def setExpander(value: Boolean): Self = this.set("expander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpander: Self = this.set("expander", js.undefined)
    @scala.inline
    def setExportable(value: Boolean): Self = this.set("exportable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportable: Self = this.set("exportable", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterElement(value: js.Object): Self = this.set("filterElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterElement: Self = this.set("filterElement", js.undefined)
    @scala.inline
    def setFilterField(value: String): Self = this.set("filterField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterField: Self = this.set("filterField", js.undefined)
    @scala.inline
    def setFilterFunction(value: (/* value */ js.Any, /* filter */ js.Any) => Unit): Self = this.set("filterFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterFunction: Self = this.set("filterFunction", js.undefined)
    @scala.inline
    def setFilterHeaderClassName(value: String): Self = this.set("filterHeaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterHeaderClassName: Self = this.set("filterHeaderClassName", js.undefined)
    @scala.inline
    def setFilterHeaderStyle(value: js.Object): Self = this.set("filterHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterHeaderStyle: Self = this.set("filterHeaderStyle", js.undefined)
    @scala.inline
    def setFilterMatchMode(value: String): Self = this.set("filterMatchMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMatchMode: Self = this.set("filterMatchMode", js.undefined)
    @scala.inline
    def setFilterMaxLength(value: Double): Self = this.set("filterMaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMaxLength: Self = this.set("filterMaxLength", js.undefined)
    @scala.inline
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    @scala.inline
    def setFilterType(value: String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFooterClassName(value: String): Self = this.set("footerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterClassName: Self = this.set("footerClassName", js.undefined)
    @scala.inline
    def setFooterStyle(value: js.Object): Self = this.set("footerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterStyle: Self = this.set("footerStyle", js.undefined)
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozen: Self = this.set("frozen", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    @scala.inline
    def setHeaderStyle(value: js.Object): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setLoadingBody(value: js.Any): Self = this.set("loadingBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingBody: Self = this.set("loadingBody", js.undefined)
    @scala.inline
    def setOnEditorCancel(value: /* props */ js.Any => Unit): Self = this.set("onEditorCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEditorCancel: Self = this.set("onEditorCancel", js.undefined)
    @scala.inline
    def setOnEditorSubmit(value: /* props */ js.Any => Unit): Self = this.set("onEditorSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEditorSubmit: Self = this.set("onEditorSubmit", js.undefined)
    @scala.inline
    def setReorderable(value: Boolean): Self = this.set("reorderable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReorderable: Self = this.set("reorderable", js.undefined)
    @scala.inline
    def setRowEditor(value: Boolean): Self = this.set("rowEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowEditor: Self = this.set("rowEditor", js.undefined)
    @scala.inline
    def setRowReorder(value: Boolean): Self = this.set("rowReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowReorder: Self = this.set("rowReorder", js.undefined)
    @scala.inline
    def setRowReorderIcon(value: String): Self = this.set("rowReorderIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowReorderIcon: Self = this.set("rowReorderIcon", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortFunction(value: /* e */ Field => Unit): Self = this.set("sortFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSortFunction: Self = this.set("sortFunction", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

