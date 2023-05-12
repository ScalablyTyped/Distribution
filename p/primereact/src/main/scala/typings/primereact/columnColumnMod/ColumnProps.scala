package typings.primereact.columnColumnMod

import typings.primereact.primereactStrings.center
import typings.primereact.primereactStrings.contains
import typings.primereact.primereactStrings.custom
import typings.primereact.primereactStrings.date
import typings.primereact.primereactStrings.endsWith
import typings.primereact.primereactStrings.equals
import typings.primereact.primereactStrings.gt
import typings.primereact.primereactStrings.gte
import typings.primereact.primereactStrings.in
import typings.primereact.primereactStrings.left
import typings.primereact.primereactStrings.lt
import typings.primereact.primereactStrings.lte
import typings.primereact.primereactStrings.multiple
import typings.primereact.primereactStrings.notEquals
import typings.primereact.primereactStrings.numeric
import typings.primereact.primereactStrings.right
import typings.primereact.primereactStrings.single
import typings.primereact.primereactStrings.startsWith
import typings.primereact.primereactStrings.text
import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.primereact.utilsUtilsMod.IconOptions
import typings.primereact.utilsUtilsMod.IconType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnProps extends StObject {
  
  /**
    * Aligns the content of the column, valid values are left, right and center.
    */
  var align: js.UndefOr[left | right | center | Null] = js.undefined
  
  /**
    * Position of a frozen column, valid values are left and right.
    */
  var alignFrozen: js.UndefOr[left | right] = js.undefined
  
  /**
    * Aligns the header of the column, valid values are left, right and center.
    */
  var alignHeader: js.UndefOr[left | right | center | Null] = js.undefined
  
  /**
    * Body content of the column.
    */
  var body: js.UndefOr[
    ReactNode | (js.Function2[/* data */ Any, /* options */ ColumnBodyOptions, ReactNode])
  ] = js.undefined
  
  /**
    * Style class of the body. If using a function must return a string.
    */
  var bodyClassName: js.UndefOr[String | (js.Function2[/* data */ Any, /* options */ ColumnBodyOptions, String])] = js.undefined
  
  /**
    * Inline style of the body.
    */
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Validator function to validate the cell input value.
    * @param {ColumnEvent} event - Custom event.
    */
  var cellEditValidator: js.UndefOr[js.Function1[/* event */ ColumnEvent, Boolean]] = js.undefined
  
  /**
    * Event to trigger the validation, possible values are "click" and "blur".
    * @defaultValue click
    */
  var cellEditValidatorEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Used to get the child elements of the component.
    * @readonly
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Style class of the component.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Number of columns to span for grouping.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifier of a column if field property is not defined. Only utilized by reorderableColumns feature at the moment.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Depending on the dataType of the column, suitable match modes are displayed.
    */
  var dataType: js.UndefOr[text | numeric | date | String] = js.undefined
  
  /**
    * Function to provide the cell editor input.
    */
  var editor: js.UndefOr[ReactNode | (js.Function1[/* options */ ColumnEditorOptions, ReactNode])] = js.undefined
  
  /**
    * Whether to exclude from global filtering or not.
    * @defaultValue false
    */
  var excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays an icon to toggle row expansion.
    * @defaultValue false
    */
  var expander: js.UndefOr[
    Boolean | (js.Function2[/* data */ Any, /* options */ ColumnBodyOptions, Boolean])
  ] = js.undefined
  
  /**
    * Property of a row data used for exporting, defaults to field.
    */
  var exportField: js.UndefOr[String] = js.undefined
  
  /**
    * Defines whether the column is exported or not.
    * @defaultValue true
    */
  var exportable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Property of a row data.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * Defines if a column can be filtered.
    * @defaultValue false
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Template of apply element in menu.
    */
  var filterApply: js.UndefOr[
    ReactNode | (js.Function1[/* options */ ColumnFilterApplyTemplateOptions, ReactNode])
  ] = js.undefined
  
  /**
    * Template of clear element in menu.
    */
  var filterClear: js.UndefOr[
    ReactNode | (js.Function1[/* options */ ColumnFilterClearTemplateOptions, ReactNode])
  ] = js.undefined
  
  /**
    * Element for custom filtering.
    */
  var filterElement: js.UndefOr[
    ReactNode | (js.Function1[/* options */ ColumnFilterElementTemplateOptions, ReactNode])
  ] = js.undefined
  
  /**
    * Property of a row data used for filtering, defaults to field.
    */
  var filterField: js.UndefOr[String] = js.undefined
  
  /**
    * Template of footer element in menu.
    */
  var filterFooter: js.UndefOr[
    ReactNode | (js.Function1[/* options */ ColumnFilterFooterTemplateOptions, ReactNode])
  ] = js.undefined
  
  /**
    * Custom filter function.
    * @param {*} value - Value of the filter event.
    * @param {*} filter - Filter of the filter event.
    * @param {*} filterLocale - Filter locale of the event.
    * @param {*} params - Params of the filter event.
    */
  var filterFunction: js.UndefOr[
    js.Function4[
      /* value */ Any, 
      /* filter */ Any, 
      /* filterLocale */ String, 
      /* params */ ColumnFilterEvent, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Template of header element in menu.
    */
  var filterHeader: js.UndefOr[
    ReactNode | (js.Function1[/* options */ ColumnFilterHeaderTemplateOptions, ReactNode])
  ] = js.undefined
  
  /**
    * Style class of the filter header.
    */
  var filterHeaderClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Inline style of the filter header.
    */
  var filterHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Defines filterMatchMode; "startsWith", "contains", "endsWith", "equals", "notEquals", "in", "lt", "lte", "gt", "gte" and "custom".
    */
  var filterMatchMode: js.UndefOr[
    startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom
  ] = js.undefined
  
  /**
    * An array of label-value pairs to override the global match mode options.
    */
  var filterMatchModeOptions: js.UndefOr[js.Array[ColumnFilterMatchModeOptions]] = js.undefined
  
  /**
    * Specifies the maximum number of characters allowed in the filter element.
    */
  var filterMaxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Style class of the column filter overlay.
    */
  var filterMenuClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Inline style of the column filter overlay.
    */
  var filterMenuStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Defines placeholder of the input fields.
    */
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the filter input field.
    * @defaultValue text
    */
  var filterType: js.UndefOr[String] = js.undefined
  
  /**
    * Footer content of the table.
    */
  var footer: js.UndefOr[ReactNode | (js.Function1[/* options */ ColumnFooterOptions, ReactNode])] = js.undefined
  
  /**
    * Style class of the footer.
    */
  var footerClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Inline style of the footer.
    */
  var footerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Whether the column is fixed in horizontal scrolling or not.
    * @defaultValue false
    */
  var frozen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Header content of the table.
    */
  var header: js.UndefOr[ReactNode | (js.Function1[/* options */ ColumnHeaderOptions, ReactNode])] = js.undefined
  
  /**
    * Style class of the header.
    */
  var headerClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Inline style of the header.
    */
  var headerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Content of the header tooltip.
    */
  var headerTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration of the header tooltip, refer to the tooltip documentation for more information.
    */
  var headerTooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * Whether the column is rendered.
    * @defaultValue false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of constraints for a column filter.
    * @defaultValue 2
    */
  var maxConstraints: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback to invoke before the cell editor is hidden.
    * @param {ColumnEvent} event - Custom event.
    */
  var onBeforeCellEditHide: js.UndefOr[js.Function1[/* event */ ColumnEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke before the cell editor is shown.
    * @param {ColumnEvent} event - Custom event.
    */
  var onBeforeCellEditShow: js.UndefOr[js.Function1[/* event */ ColumnEvent, Unit]] = js.undefined
  
  /**
    * Callback to execute when editor is cancelled.
    * @param {ColumnEvent} event - Custom event.
    */
  var onCellEditCancel: js.UndefOr[js.Function1[/* event */ ColumnEvent, Unit]] = js.undefined
  
  /**
    * Callback to execute when editor is submitted.
    * @param {ColumnEvent} event - Custom event.
    */
  var onCellEditComplete: js.UndefOr[js.Function1[/* event */ ColumnEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke when cell edit is initiated.
    * @param {ColumnEvent} event - Custom event.
    */
  var onCellEditInit: js.UndefOr[js.Function1[/* event */ ColumnEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke when the apply button is clicked.
    * @param {ColumnFilterApplyClickEvent} event - Custom filter event.
    */
  var onFilterApplyClick: js.UndefOr[js.Function1[/* event */ ColumnFilterApplyClickEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke when the filter meta is cleared.
    */
  var onFilterClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback to invoke when a new constraint is added.
    * @param {ColumnFilterConstraintAddEvent} event - Custom filter event.
    */
  var onFilterConstraintAdd: js.UndefOr[js.Function1[/* event */ ColumnFilterConstraintAddEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke when a constraint is removed.
    * @param {ColumnFilterConstraintRemoveEvent} event - Custom filter event.
    */
  var onFilterConstraintRemove: js.UndefOr[js.Function1[/* event */ ColumnFilterConstraintRemoveEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke when the match mode option is changed.
    * @param {ColumnFilterMatchModeChangeEvent} event - Custom filter event.
    */
  var onFilterMatchModeChange: js.UndefOr[js.Function1[/* event */ ColumnFilterMatchModeChangeEvent, Unit]] = js.undefined
  
  /**
    * Callback to invoke when the filter operator option is changed.
    * @param {ColumnFilterOperatorChangeEvent} event - Custom filter event.
    */
  var onFilterOperatorChange: js.UndefOr[js.Function1[/* event */ ColumnFilterOperatorChangeEvent, Unit]] = js.undefined
  
  /**
    * Used to defined reorderableColumns per column when reorderableColumns of table is enabled, defaults to value of reorderableColumns.
    */
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to defined resizeableColumns per column when resizeableColumns of table is enabled, defaults to value of resizeableColumns.
    */
  var resizeable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays icons to edit row.
    * @defaultValue false
    */
  var rowEditor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this column displays an icon to reorder the rows.
    * @defaultValue false
    */
  var rowReorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon of the drag handle to reorder rows.
    */
  var rowReorderIcon: js.UndefOr[IconType[ColumnProps]] = js.undefined
  
  /**
    * Number of rows to span for grouping.
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the selection mode, valid values are "single", "multiple", "radiobutton" and "checkbox".
    */
  var selectionMode: js.UndefOr[single | multiple] = js.undefined
  
  /**
    * When enabled, a button is displayed to add more rules.
    * @defaultValue true
    */
  var showAddButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays a button to apply the column filtering.
    * @defaultValue true
    */
  var showApplyButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays a button to clear the column filtering.
    * @defaultValue true
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show the match modes selector.
    * @defaultValue true
    */
  var showFilterMatchModes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display the filter overlay.
    * @defaultValue true
    */
  var showFilterMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show the match modes selector and match operator selector.
    * @defaultValue true
    */
  var showFilterMenuOptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled, match all and match any operator selector is displayed.
    * @defaultValue true
    */
  var showFilterOperator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the field to sort data by default.
    */
  var sortField: js.UndefOr[String] = js.undefined
  
  /**
    * Sort function for custom sorting.
    * @param {ColumnSortEvent} event - Custom sort event.
    */
  var sortFunction: js.UndefOr[js.Function1[/* event */ ColumnSortEvent, Unit]] = js.undefined
  
  /**
    * Defines if a column is sortable.
    * @defaultValue false
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled, the data of columns with this property cannot be sorted or changed by the user.
    * @defaultValue false
    */
  var sortableDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Inline style of the component.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ColumnProps {
  
  inline def apply(): ColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignFrozen(value: left | right): Self = StObject.set(x, "alignFrozen", value.asInstanceOf[js.Any])
    
    inline def setAlignFrozenUndefined: Self = StObject.set(x, "alignFrozen", js.undefined)
    
    inline def setAlignHeader(value: left | right | center): Self = StObject.set(x, "alignHeader", value.asInstanceOf[js.Any])
    
    inline def setAlignHeaderNull: Self = StObject.set(x, "alignHeader", null)
    
    inline def setAlignHeaderUndefined: Self = StObject.set(x, "alignHeader", js.undefined)
    
    inline def setAlignNull: Self = StObject.set(x, "align", null)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBody(value: ReactNode | (js.Function2[/* data */ Any, /* options */ ColumnBodyOptions, ReactNode])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyClassName(value: String | (js.Function2[/* data */ Any, /* options */ ColumnBodyOptions, String])): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    inline def setBodyClassNameFunction2(value: (/* data */ Any, /* options */ ColumnBodyOptions) => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction2(value))
    
    inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    inline def setBodyFunction2(value: (/* data */ Any, /* options */ ColumnBodyOptions) => ReactNode): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
    
    inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCellEditValidator(value: /* event */ ColumnEvent => Boolean): Self = StObject.set(x, "cellEditValidator", js.Any.fromFunction1(value))
    
    inline def setCellEditValidatorEvent(value: String): Self = StObject.set(x, "cellEditValidatorEvent", value.asInstanceOf[js.Any])
    
    inline def setCellEditValidatorEventUndefined: Self = StObject.set(x, "cellEditValidatorEvent", js.undefined)
    
    inline def setCellEditValidatorUndefined: Self = StObject.set(x, "cellEditValidator", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setDataType(value: text | numeric | date | String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setEditor(value: ReactNode | (js.Function1[/* options */ ColumnEditorOptions, ReactNode])): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorFunction1(value: /* options */ ColumnEditorOptions => ReactNode): Self = StObject.set(x, "editor", js.Any.fromFunction1(value))
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setExcludeGlobalFilter(value: Boolean): Self = StObject.set(x, "excludeGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def setExcludeGlobalFilterUndefined: Self = StObject.set(x, "excludeGlobalFilter", js.undefined)
    
    inline def setExpander(value: Boolean | (js.Function2[/* data */ Any, /* options */ ColumnBodyOptions, Boolean])): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
    
    inline def setExpanderFunction2(value: (/* data */ Any, /* options */ ColumnBodyOptions) => Boolean): Self = StObject.set(x, "expander", js.Any.fromFunction2(value))
    
    inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
    
    inline def setExportField(value: String): Self = StObject.set(x, "exportField", value.asInstanceOf[js.Any])
    
    inline def setExportFieldUndefined: Self = StObject.set(x, "exportField", js.undefined)
    
    inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterApply(value: ReactNode | (js.Function1[/* options */ ColumnFilterApplyTemplateOptions, ReactNode])): Self = StObject.set(x, "filterApply", value.asInstanceOf[js.Any])
    
    inline def setFilterApplyFunction1(value: /* options */ ColumnFilterApplyTemplateOptions => ReactNode): Self = StObject.set(x, "filterApply", js.Any.fromFunction1(value))
    
    inline def setFilterApplyUndefined: Self = StObject.set(x, "filterApply", js.undefined)
    
    inline def setFilterClear(value: ReactNode | (js.Function1[/* options */ ColumnFilterClearTemplateOptions, ReactNode])): Self = StObject.set(x, "filterClear", value.asInstanceOf[js.Any])
    
    inline def setFilterClearFunction1(value: /* options */ ColumnFilterClearTemplateOptions => ReactNode): Self = StObject.set(x, "filterClear", js.Any.fromFunction1(value))
    
    inline def setFilterClearUndefined: Self = StObject.set(x, "filterClear", js.undefined)
    
    inline def setFilterElement(value: ReactNode | (js.Function1[/* options */ ColumnFilterElementTemplateOptions, ReactNode])): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
    
    inline def setFilterElementFunction1(value: /* options */ ColumnFilterElementTemplateOptions => ReactNode): Self = StObject.set(x, "filterElement", js.Any.fromFunction1(value))
    
    inline def setFilterElementUndefined: Self = StObject.set(x, "filterElement", js.undefined)
    
    inline def setFilterField(value: String): Self = StObject.set(x, "filterField", value.asInstanceOf[js.Any])
    
    inline def setFilterFieldUndefined: Self = StObject.set(x, "filterField", js.undefined)
    
    inline def setFilterFooter(value: ReactNode | (js.Function1[/* options */ ColumnFilterFooterTemplateOptions, ReactNode])): Self = StObject.set(x, "filterFooter", value.asInstanceOf[js.Any])
    
    inline def setFilterFooterFunction1(value: /* options */ ColumnFilterFooterTemplateOptions => ReactNode): Self = StObject.set(x, "filterFooter", js.Any.fromFunction1(value))
    
    inline def setFilterFooterUndefined: Self = StObject.set(x, "filterFooter", js.undefined)
    
    inline def setFilterFunction(
      value: (/* value */ Any, /* filter */ Any, /* filterLocale */ String, /* params */ ColumnFilterEvent) => Unit
    ): Self = StObject.set(x, "filterFunction", js.Any.fromFunction4(value))
    
    inline def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
    inline def setFilterHeader(value: ReactNode | (js.Function1[/* options */ ColumnFilterHeaderTemplateOptions, ReactNode])): Self = StObject.set(x, "filterHeader", value.asInstanceOf[js.Any])
    
    inline def setFilterHeaderClassName(value: String): Self = StObject.set(x, "filterHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def setFilterHeaderClassNameUndefined: Self = StObject.set(x, "filterHeaderClassName", js.undefined)
    
    inline def setFilterHeaderFunction1(value: /* options */ ColumnFilterHeaderTemplateOptions => ReactNode): Self = StObject.set(x, "filterHeader", js.Any.fromFunction1(value))
    
    inline def setFilterHeaderStyle(value: CSSProperties): Self = StObject.set(x, "filterHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setFilterHeaderStyleUndefined: Self = StObject.set(x, "filterHeaderStyle", js.undefined)
    
    inline def setFilterHeaderUndefined: Self = StObject.set(x, "filterHeader", js.undefined)
    
    inline def setFilterMatchMode(value: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchModeOptions(value: js.Array[ColumnFilterMatchModeOptions]): Self = StObject.set(x, "filterMatchModeOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchModeOptionsUndefined: Self = StObject.set(x, "filterMatchModeOptions", js.undefined)
    
    inline def setFilterMatchModeOptionsVarargs(value: ColumnFilterMatchModeOptions*): Self = StObject.set(x, "filterMatchModeOptions", js.Array(value*))
    
    inline def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
    
    inline def setFilterMaxLength(value: Double): Self = StObject.set(x, "filterMaxLength", value.asInstanceOf[js.Any])
    
    inline def setFilterMaxLengthUndefined: Self = StObject.set(x, "filterMaxLength", js.undefined)
    
    inline def setFilterMenuClassName(value: String): Self = StObject.set(x, "filterMenuClassName", value.asInstanceOf[js.Any])
    
    inline def setFilterMenuClassNameUndefined: Self = StObject.set(x, "filterMenuClassName", js.undefined)
    
    inline def setFilterMenuStyle(value: CSSProperties): Self = StObject.set(x, "filterMenuStyle", value.asInstanceOf[js.Any])
    
    inline def setFilterMenuStyleUndefined: Self = StObject.set(x, "filterMenuStyle", js.undefined)
    
    inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFooter(value: ReactNode | (js.Function1[/* options */ ColumnFooterOptions, ReactNode])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterClassName(value: String): Self = StObject.set(x, "footerClassName", value.asInstanceOf[js.Any])
    
    inline def setFooterClassNameUndefined: Self = StObject.set(x, "footerClassName", js.undefined)
    
    inline def setFooterFunction1(value: /* options */ ColumnFooterOptions => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
    
    inline def setHeader(value: ReactNode | (js.Function1[/* options */ ColumnHeaderOptions, ReactNode])): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    inline def setHeaderFunction1(value: /* options */ ColumnHeaderOptions => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
    
    inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHeaderTooltip(value: String): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "headerTooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipOptionsUndefined: Self = StObject.set(x, "headerTooltipOptions", js.undefined)
    
    inline def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setMaxConstraints(value: Double): Self = StObject.set(x, "maxConstraints", value.asInstanceOf[js.Any])
    
    inline def setMaxConstraintsUndefined: Self = StObject.set(x, "maxConstraints", js.undefined)
    
    inline def setOnBeforeCellEditHide(value: /* event */ ColumnEvent => Unit): Self = StObject.set(x, "onBeforeCellEditHide", js.Any.fromFunction1(value))
    
    inline def setOnBeforeCellEditHideUndefined: Self = StObject.set(x, "onBeforeCellEditHide", js.undefined)
    
    inline def setOnBeforeCellEditShow(value: /* event */ ColumnEvent => Unit): Self = StObject.set(x, "onBeforeCellEditShow", js.Any.fromFunction1(value))
    
    inline def setOnBeforeCellEditShowUndefined: Self = StObject.set(x, "onBeforeCellEditShow", js.undefined)
    
    inline def setOnCellEditCancel(value: /* event */ ColumnEvent => Unit): Self = StObject.set(x, "onCellEditCancel", js.Any.fromFunction1(value))
    
    inline def setOnCellEditCancelUndefined: Self = StObject.set(x, "onCellEditCancel", js.undefined)
    
    inline def setOnCellEditComplete(value: /* event */ ColumnEvent => Unit): Self = StObject.set(x, "onCellEditComplete", js.Any.fromFunction1(value))
    
    inline def setOnCellEditCompleteUndefined: Self = StObject.set(x, "onCellEditComplete", js.undefined)
    
    inline def setOnCellEditInit(value: /* event */ ColumnEvent => Unit): Self = StObject.set(x, "onCellEditInit", js.Any.fromFunction1(value))
    
    inline def setOnCellEditInitUndefined: Self = StObject.set(x, "onCellEditInit", js.undefined)
    
    inline def setOnFilterApplyClick(value: /* event */ ColumnFilterApplyClickEvent => Unit): Self = StObject.set(x, "onFilterApplyClick", js.Any.fromFunction1(value))
    
    inline def setOnFilterApplyClickUndefined: Self = StObject.set(x, "onFilterApplyClick", js.undefined)
    
    inline def setOnFilterClear(value: () => Unit): Self = StObject.set(x, "onFilterClear", js.Any.fromFunction0(value))
    
    inline def setOnFilterClearUndefined: Self = StObject.set(x, "onFilterClear", js.undefined)
    
    inline def setOnFilterConstraintAdd(value: /* event */ ColumnFilterConstraintAddEvent => Unit): Self = StObject.set(x, "onFilterConstraintAdd", js.Any.fromFunction1(value))
    
    inline def setOnFilterConstraintAddUndefined: Self = StObject.set(x, "onFilterConstraintAdd", js.undefined)
    
    inline def setOnFilterConstraintRemove(value: /* event */ ColumnFilterConstraintRemoveEvent => Unit): Self = StObject.set(x, "onFilterConstraintRemove", js.Any.fromFunction1(value))
    
    inline def setOnFilterConstraintRemoveUndefined: Self = StObject.set(x, "onFilterConstraintRemove", js.undefined)
    
    inline def setOnFilterMatchModeChange(value: /* event */ ColumnFilterMatchModeChangeEvent => Unit): Self = StObject.set(x, "onFilterMatchModeChange", js.Any.fromFunction1(value))
    
    inline def setOnFilterMatchModeChangeUndefined: Self = StObject.set(x, "onFilterMatchModeChange", js.undefined)
    
    inline def setOnFilterOperatorChange(value: /* event */ ColumnFilterOperatorChangeEvent => Unit): Self = StObject.set(x, "onFilterOperatorChange", js.Any.fromFunction1(value))
    
    inline def setOnFilterOperatorChangeUndefined: Self = StObject.set(x, "onFilterOperatorChange", js.undefined)
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    inline def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
    
    inline def setResizeableUndefined: Self = StObject.set(x, "resizeable", js.undefined)
    
    inline def setRowEditor(value: Boolean): Self = StObject.set(x, "rowEditor", value.asInstanceOf[js.Any])
    
    inline def setRowEditorUndefined: Self = StObject.set(x, "rowEditor", js.undefined)
    
    inline def setRowReorder(value: Boolean): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
    
    inline def setRowReorderIcon(value: IconType[ColumnProps]): Self = StObject.set(x, "rowReorderIcon", value.asInstanceOf[js.Any])
    
    inline def setRowReorderIconFunction1(value: /* options */ IconOptions[ColumnProps] => ReactNode): Self = StObject.set(x, "rowReorderIcon", js.Any.fromFunction1(value))
    
    inline def setRowReorderIconUndefined: Self = StObject.set(x, "rowReorderIcon", js.undefined)
    
    inline def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setSelectionMode(value: single | multiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
    
    inline def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
    
    inline def setShowApplyButton(value: Boolean): Self = StObject.set(x, "showApplyButton", value.asInstanceOf[js.Any])
    
    inline def setShowApplyButtonUndefined: Self = StObject.set(x, "showApplyButton", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowFilterMatchModes(value: Boolean): Self = StObject.set(x, "showFilterMatchModes", value.asInstanceOf[js.Any])
    
    inline def setShowFilterMatchModesUndefined: Self = StObject.set(x, "showFilterMatchModes", js.undefined)
    
    inline def setShowFilterMenu(value: Boolean): Self = StObject.set(x, "showFilterMenu", value.asInstanceOf[js.Any])
    
    inline def setShowFilterMenuOptions(value: Boolean): Self = StObject.set(x, "showFilterMenuOptions", value.asInstanceOf[js.Any])
    
    inline def setShowFilterMenuOptionsUndefined: Self = StObject.set(x, "showFilterMenuOptions", js.undefined)
    
    inline def setShowFilterMenuUndefined: Self = StObject.set(x, "showFilterMenu", js.undefined)
    
    inline def setShowFilterOperator(value: Boolean): Self = StObject.set(x, "showFilterOperator", value.asInstanceOf[js.Any])
    
    inline def setShowFilterOperatorUndefined: Self = StObject.set(x, "showFilterOperator", js.undefined)
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortFunction(value: /* event */ ColumnSortEvent => Unit): Self = StObject.set(x, "sortFunction", js.Any.fromFunction1(value))
    
    inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableDisabled(value: Boolean): Self = StObject.set(x, "sortableDisabled", value.asInstanceOf[js.Any])
    
    inline def setSortableDisabledUndefined: Self = StObject.set(x, "sortableDisabled", js.undefined)
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
