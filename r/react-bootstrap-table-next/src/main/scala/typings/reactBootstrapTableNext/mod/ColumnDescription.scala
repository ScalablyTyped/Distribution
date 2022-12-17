package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.FilterElement
import typings.reactBootstrapTableNext.anon.OnClick
import typings.reactBootstrapTableNext.anon.Options
import typings.reactBootstrapTableNext.anon.TooltipFormatter
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDescription[T /* <: js.Object */, E] extends StObject {
  
  var align: js.UndefOr[CellAlignment] = js.undefined
  
  var classes: js.UndefOr[
    String | (js.Function4[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      String
    ])
  ] = js.undefined
  
  /**
    * Toggle column display in CSV export
    */
  var csvExport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom csv cell formatter used when exporting csv
    */
  var csvFormatter: js.UndefOr[ColumnFormatter[T, E, Any]] = js.undefined
  
  /**
    * csvText defaults to column.text
    */
  var csvText: js.UndefOr[String] = js.undefined
  
  /**
    * CSV Column options only used with the toolkit provider
    */
  /**
    * export csv cell type can be Number or String
    */
  var csvType: js.UndefOr[js.Object] = js.undefined
  
  var dataField: Any
  
  var editable: js.UndefOr[
    Boolean | (js.Function4[/* cell */ Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
  ] = js.undefined
  
  var editor: js.UndefOr[Options] = js.undefined
  
  var filter: js.UndefOr[Boolean | (TableColumnFilterProps[Any, Any])] = js.undefined
  
  var filterValue: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      String
    ]
  ] = js.undefined
  
  var footer: js.UndefOr[
    Boolean | Double | String | (js.Function3[
      /* columnData */ Any, 
      /* column */ ColumnDescription[T, E], 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.undefined
  
  var footerAlign: js.UndefOr[
    CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
  ] = js.undefined
  
  var footerClasses: js.UndefOr[
    String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
  ] = js.undefined
  
  var footerEvents: js.UndefOr[OnClick[T, E]] = js.undefined
  
  var footerFormatter: js.UndefOr[
    js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, Unit]
  ] = js.undefined
  
  var footerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var footerTitle: js.UndefOr[Boolean] = js.undefined
  
  var formatExtraData: js.UndefOr[TooltipFormatter[T] & E] = js.undefined
  
  var formatter: js.UndefOr[ColumnFormatter[T, E, Any]] = js.undefined
  
  var headerAlign: js.UndefOr[CellAlignment] = js.undefined
  
  var headerClasses: js.UndefOr[
    String | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, String])
  ] = js.undefined
  
  var headerFormatter: js.UndefOr[HeaderFormatter[T]] = js.undefined
  
  var headerSortingClasses: js.UndefOr[HeaderSortingClasses[T, E]] = js.undefined
  
  var headerStyle: js.UndefOr[CSSProperties | js.Function0[CSSProperties]] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set the column will not use cell values
    */
  var isDummyField: js.UndefOr[Boolean] = js.undefined
  
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
  
  var sortCaret: js.UndefOr[ColumnSortCaret[T, E]] = js.undefined
  
  var sortFunc: js.UndefOr[ColumnSortFunc[T, Any]] = js.undefined
  
  var sortValue: js.UndefOr[ColumnSortValue[T, Any]] = js.undefined
  
  var style: js.UndefOr[
    CSSProperties | (js.Function4[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      CSSProperties
    ])
  ] = js.undefined
  
  /**
    * Column header field
    */
  var text: String
  
  var tooltipDataField: js.UndefOr[String] = js.undefined
  
  var validator: js.UndefOr[
    js.Function4[
      /* newValue */ Any, 
      /* row */ T, 
      /* column */ ColumnDescription[T, E], 
      /* done */ js.Function1[/* result */ js.UndefOr[ValidationResult], Any], 
      Boolean | ValidationResult
    ]
  ] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ColumnDescription {
  
  inline def apply[T /* <: js.Object */, E](dataField: Any, text: String): ColumnDescription[T, E] = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[T, E]]
  }
  
  extension [Self <: ColumnDescription[?, ?], T /* <: js.Object */, E](x: Self & (ColumnDescription[T, E])) {
    
    inline def setAlign(value: CellAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setClasses(
      value: String | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
          /* row */ T, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          String
        ])
    ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => String
    ): Self = StObject.set(x, "classes", js.Any.fromFunction4(value))
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCsvExport(value: Boolean): Self = StObject.set(x, "csvExport", value.asInstanceOf[js.Any])
    
    inline def setCsvExportUndefined: Self = StObject.set(x, "csvExport", js.undefined)
    
    inline def setCsvFormatter(value: (Any, T, /* rowIndex */ Double, /* formatExtraData */ js.UndefOr[E]) => ReactNode): Self = StObject.set(x, "csvFormatter", js.Any.fromFunction4(value))
    
    inline def setCsvFormatterUndefined: Self = StObject.set(x, "csvFormatter", js.undefined)
    
    inline def setCsvText(value: String): Self = StObject.set(x, "csvText", value.asInstanceOf[js.Any])
    
    inline def setCsvTextUndefined: Self = StObject.set(x, "csvText", js.undefined)
    
    inline def setCsvType(value: js.Object): Self = StObject.set(x, "csvType", value.asInstanceOf[js.Any])
    
    inline def setCsvTypeUndefined: Self = StObject.set(x, "csvType", js.undefined)
    
    inline def setDataField(value: Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setEditable(
      value: Boolean | (js.Function4[/* cell */ Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
    ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableFunction4(value: (/* cell */ Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction4(value))
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditor(value: Options): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setFilter(value: Boolean | (TableColumnFilterProps[Any, Any])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T) => String
    ): Self = StObject.set(x, "filterValue", js.Any.fromFunction2(value))
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setFooter(
      value: Boolean | Double | String | (js.Function3[
          /* columnData */ Any, 
          /* column */ ColumnDescription[T, E], 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterAlign(
      value: CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
    ): Self = StObject.set(x, "footerAlign", value.asInstanceOf[js.Any])
    
    inline def setFooterAlignFunction2(value: (/* column */ ColumnDescription[T, E], /* colIndex */ Double) => CellAlignment): Self = StObject.set(x, "footerAlign", js.Any.fromFunction2(value))
    
    inline def setFooterAlignUndefined: Self = StObject.set(x, "footerAlign", js.undefined)
    
    inline def setFooterClasses(
      value: String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
    ): Self = StObject.set(x, "footerClasses", value.asInstanceOf[js.Any])
    
    inline def setFooterClassesFunction2(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String): Self = StObject.set(x, "footerClasses", js.Any.fromFunction2(value))
    
    inline def setFooterClassesUndefined: Self = StObject.set(x, "footerClasses", js.undefined)
    
    inline def setFooterEvents(value: OnClick[T, E]): Self = StObject.set(x, "footerEvents", value.asInstanceOf[js.Any])
    
    inline def setFooterEventsUndefined: Self = StObject.set(x, "footerEvents", js.undefined)
    
    inline def setFooterFormatter(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => Unit): Self = StObject.set(x, "footerFormatter", js.Any.fromFunction2(value))
    
    inline def setFooterFormatterUndefined: Self = StObject.set(x, "footerFormatter", js.undefined)
    
    inline def setFooterFunction3(
      value: (/* columnData */ Any, /* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String
    ): Self = StObject.set(x, "footer", js.Any.fromFunction3(value))
    
    inline def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    inline def setFooterTitle(value: Boolean): Self = StObject.set(x, "footerTitle", value.asInstanceOf[js.Any])
    
    inline def setFooterTitleUndefined: Self = StObject.set(x, "footerTitle", js.undefined)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormatExtraData(value: TooltipFormatter[T] & E): Self = StObject.set(x, "formatExtraData", value.asInstanceOf[js.Any])
    
    inline def setFormatExtraDataUndefined: Self = StObject.set(x, "formatExtraData", js.undefined)
    
    inline def setFormatter(value: (Any, T, /* rowIndex */ Double, /* formatExtraData */ js.UndefOr[E]) => ReactNode): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setHeaderAlign(value: CellAlignment): Self = StObject.set(x, "headerAlign", value.asInstanceOf[js.Any])
    
    inline def setHeaderAlignUndefined: Self = StObject.set(x, "headerAlign", js.undefined)
    
    inline def setHeaderClasses(
      value: String | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, String])
    ): Self = StObject.set(x, "headerClasses", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassesFunction2(value: (/* column */ ColumnDescription[T, E], /* colIndex */ Double) => String): Self = StObject.set(x, "headerClasses", js.Any.fromFunction2(value))
    
    inline def setHeaderClassesUndefined: Self = StObject.set(x, "headerClasses", js.undefined)
    
    inline def setHeaderFormatter(
      value: (/* column */ ColumnDescription[T, Any], /* colIndex */ Double, /* components */ FilterElement) => ReactNode
    ): Self = StObject.set(x, "headerFormatter", js.Any.fromFunction3(value))
    
    inline def setHeaderFormatterUndefined: Self = StObject.set(x, "headerFormatter", js.undefined)
    
    inline def setHeaderSortingClasses(value: HeaderSortingClasses[T, E]): Self = StObject.set(x, "headerSortingClasses", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortingClassesFunction4(
      value: (/* column */ ColumnDescription[T, E], /* sortOrder */ asc | desc, /* isLastSorting */ Boolean, /* colIndex */ Double) => String
    ): Self = StObject.set(x, "headerSortingClasses", js.Any.fromFunction4(value))
    
    inline def setHeaderSortingClassesUndefined: Self = StObject.set(x, "headerSortingClasses", js.undefined)
    
    inline def setHeaderStyle(value: CSSProperties | js.Function0[CSSProperties]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleFunction0(value: () => CSSProperties): Self = StObject.set(x, "headerStyle", js.Any.fromFunction0(value))
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIsDummyField(value: Boolean): Self = StObject.set(x, "isDummyField", value.asInstanceOf[js.Any])
    
    inline def setIsDummyFieldUndefined: Self = StObject.set(x, "isDummyField", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortCaret(
      value: (/* order */ js.UndefOr[asc | desc], /* column */ ColumnDescription[T, E]) => Element | String | Null
    ): Self = StObject.set(x, "sortCaret", js.Any.fromFunction2(value))
    
    inline def setSortCaretUndefined: Self = StObject.set(x, "sortCaret", js.undefined)
    
    inline def setSortFunc(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, /* order */ asc | desc, /* dataField */ Any, T, T) => Double
    ): Self = StObject.set(x, "sortFunc", js.Any.fromFunction6(value))
    
    inline def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortValue(value: (Any, T) => Boolean | String | Double): Self = StObject.set(x, "sortValue", js.Any.fromFunction2(value))
    
    inline def setSortValueUndefined: Self = StObject.set(x, "sortValue", js.undefined)
    
    inline def setStyle(
      value: CSSProperties | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
          /* row */ T, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          CSSProperties
        ])
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => CSSProperties
    ): Self = StObject.set(x, "style", js.Any.fromFunction4(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTooltipDataField(value: String): Self = StObject.set(x, "tooltipDataField", value.asInstanceOf[js.Any])
    
    inline def setTooltipDataFieldUndefined: Self = StObject.set(x, "tooltipDataField", js.undefined)
    
    inline def setValidator(
      value: (/* newValue */ Any, /* row */ T, /* column */ ColumnDescription[T, E], /* done */ js.Function1[/* result */ js.UndefOr[ValidationResult], Any]) => Boolean | ValidationResult
    ): Self = StObject.set(x, "validator", js.Any.fromFunction4(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
