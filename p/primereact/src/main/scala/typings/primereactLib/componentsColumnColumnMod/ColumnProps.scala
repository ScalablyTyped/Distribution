package typings
package primereactLib.componentsColumnColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var bodyClassName: js.UndefOr[java.lang.String] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  var editor: js.UndefOr[
    js.Function1[/* props */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, scala.Boolean]] = js.undefined
  var editorValidatorEvent: js.UndefOr[java.lang.String] = js.undefined
  var excludeGlobalFilter: js.UndefOr[scala.Boolean] = js.undefined
  var expander: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterElement: js.UndefOr[js.Object] = js.undefined
  var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, scala.Unit]] = js.undefined
  var filterMatchMode: js.UndefOr[java.lang.String] = js.undefined
  var filterMaxLength: js.UndefOr[scala.Double] = js.undefined
  var filterPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var filterType: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerClassName: js.UndefOr[java.lang.String] = js.undefined
  var footerStyle: js.UndefOr[js.Object] = js.undefined
  var frozen: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  var headerStyle: js.UndefOr[js.Object] = js.undefined
  var loadingBody: js.UndefOr[js.Any] = js.undefined
  var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, scala.Unit]] = js.undefined
  var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, scala.Unit]] = js.undefined
  var rowReorder: js.UndefOr[scala.Boolean] = js.undefined
  var rowReorderIcon: js.UndefOr[java.lang.String] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  var sortFunction: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Field, scala.Unit]] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    body: js.Any = null,
    bodyClassName: java.lang.String = null,
    bodyStyle: js.Object = null,
    className: java.lang.String = null,
    colSpan: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    editor: /* props */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    editorValidator: /* props */ js.Any => scala.Boolean = null,
    editorValidatorEvent: java.lang.String = null,
    excludeGlobalFilter: js.UndefOr[scala.Boolean] = js.undefined,
    expander: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterElement: js.Object = null,
    filterFunction: (/* value */ js.Any, /* filter */ js.Any) => scala.Unit = null,
    filterMatchMode: java.lang.String = null,
    filterMaxLength: scala.Int | scala.Double = null,
    filterPlaceholder: java.lang.String = null,
    filterType: java.lang.String = null,
    footer: js.Any = null,
    footerClassName: java.lang.String = null,
    footerStyle: js.Object = null,
    frozen: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: java.lang.String = null,
    headerStyle: js.Object = null,
    loadingBody: js.Any = null,
    onEditorCancel: /* props */ js.Any => scala.Unit = null,
    onEditorSubmit: /* props */ js.Any => scala.Unit = null,
    rowReorder: js.UndefOr[scala.Boolean] = js.undefined,
    rowReorderIcon: java.lang.String = null,
    rowSpan: scala.Int | scala.Double = null,
    selectionMode: java.lang.String = null,
    sortField: java.lang.String = null,
    sortFunction: /* e */ primereactLib.Anon_Field => scala.Unit = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
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

