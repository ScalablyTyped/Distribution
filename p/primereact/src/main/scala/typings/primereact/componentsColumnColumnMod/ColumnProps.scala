package typings.primereact.componentsColumnColumnMod

import typings.primereact.Anon_Field
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var bodyClassName: js.UndefOr[String] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var columnKey: js.UndefOr[String] = js.undefined
  var editor: js.UndefOr[js.Function1[/* props */ js.Any, js.UndefOr[Element]]] = js.undefined
  var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.undefined
  var editorValidatorEvent: js.UndefOr[String] = js.undefined
  var excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined
  var expander: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterElement: js.UndefOr[js.Object] = js.undefined
  var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, Unit]] = js.undefined
  var filterMatchMode: js.UndefOr[String] = js.undefined
  var filterMaxLength: js.UndefOr[Double] = js.undefined
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var filterType: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerClassName: js.UndefOr[String] = js.undefined
  var footerStyle: js.UndefOr[js.Object] = js.undefined
  var frozen: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerClassName: js.UndefOr[String] = js.undefined
  var headerStyle: js.UndefOr[js.Object] = js.undefined
  var loadingBody: js.UndefOr[js.Any] = js.undefined
  var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
  var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
  var rowReorder: js.UndefOr[Boolean] = js.undefined
  var rowReorderIcon: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var sortField: js.UndefOr[String] = js.undefined
  var sortFunction: js.UndefOr[js.Function1[/* e */ Anon_Field, Unit]] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    body: js.Any = null,
    bodyClassName: String = null,
    bodyStyle: js.Object = null,
    className: String = null,
    colSpan: Int | Double = null,
    columnKey: String = null,
    editor: /* props */ js.Any => js.UndefOr[Element] = null,
    editorValidator: /* props */ js.Any => Boolean = null,
    editorValidatorEvent: String = null,
    excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined,
    expander: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterElement: js.Object = null,
    filterFunction: (/* value */ js.Any, /* filter */ js.Any) => Unit = null,
    filterMatchMode: String = null,
    filterMaxLength: Int | Double = null,
    filterPlaceholder: String = null,
    filterType: String = null,
    footer: js.Any = null,
    footerClassName: String = null,
    footerStyle: js.Object = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: String = null,
    headerStyle: js.Object = null,
    loadingBody: js.Any = null,
    onEditorCancel: /* props */ js.Any => Unit = null,
    onEditorSubmit: /* props */ js.Any => Unit = null,
    rowReorder: js.UndefOr[Boolean] = js.undefined,
    rowReorderIcon: String = null,
    rowSpan: Int | Double = null,
    selectionMode: String = null,
    sortField: String = null,
    sortFunction: /* e */ Anon_Field => Unit = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (editor != null) __obj.updateDynamic("editor")(js.Any.fromFunction1(editor))
    if (editorValidator != null) __obj.updateDynamic("editorValidator")(js.Any.fromFunction1(editorValidator))
    if (editorValidatorEvent != null) __obj.updateDynamic("editorValidatorEvent")(editorValidatorEvent)
    if (!js.isUndefined(excludeGlobalFilter)) __obj.updateDynamic("excludeGlobalFilter")(excludeGlobalFilter)
    if (!js.isUndefined(expander)) __obj.updateDynamic("expander")(expander)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterElement != null) __obj.updateDynamic("filterElement")(filterElement)
    if (filterFunction != null) __obj.updateDynamic("filterFunction")(js.Any.fromFunction2(filterFunction))
    if (filterMatchMode != null) __obj.updateDynamic("filterMatchMode")(filterMatchMode)
    if (filterMaxLength != null) __obj.updateDynamic("filterMaxLength")(filterMaxLength.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName)
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (loadingBody != null) __obj.updateDynamic("loadingBody")(loadingBody)
    if (onEditorCancel != null) __obj.updateDynamic("onEditorCancel")(js.Any.fromFunction1(onEditorCancel))
    if (onEditorSubmit != null) __obj.updateDynamic("onEditorSubmit")(js.Any.fromFunction1(onEditorSubmit))
    if (!js.isUndefined(rowReorder)) __obj.updateDynamic("rowReorder")(rowReorder)
    if (rowReorderIcon != null) __obj.updateDynamic("rowReorderIcon")(rowReorderIcon)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction1(sortFunction))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ColumnProps]
  }
}

