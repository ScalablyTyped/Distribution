package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactText
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.FilterElement
import typings.reactBootstrapTableNext.anon.OnClick
import typings.reactBootstrapTableNext.anon.Options
import typings.reactBootstrapTableNext.anon.TooltipFormatter
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDescription[T /* <: js.Object */, E] extends StObject {
  
  var align: js.UndefOr[CellAlignment] = js.native
  
  var classes: js.UndefOr[
    String | (js.Function4[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      String
    ])
  ] = js.native
  
  /**
    * Toggle column display in CSV export
    */
  var csvExport: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom csv cell formatter used when exporting csv
    */
  var csvFormatter: js.UndefOr[ColumnFormatter[T, E, _]] = js.native
  
  /**
    * csvText defaults to column.text
    */
  var csvText: js.UndefOr[String] = js.native
  
  /**
    * CSV Column options only used with the toolkit provider
    */
  /**
    * export csv cell type can be Number or String
    */
  var csvType: js.UndefOr[js.Object] = js.native
  
  var dataField: js.Any = js.native
  
  var editable: js.UndefOr[
    Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
  ] = js.native
  
  var editor: js.UndefOr[Options] = js.native
  
  var filter: js.UndefOr[Boolean | (TableColumnFilterProps[_, _])] = js.native
  
  var filterValue: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      String
    ]
  ] = js.native
  
  var footer: js.UndefOr[
    Boolean | Double | String | (js.Function3[
      /* columnData */ js.Any, 
      /* column */ ColumnDescription[T, E], 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.native
  
  var footerAlign: js.UndefOr[
    CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
  ] = js.native
  
  var footerClasses: js.UndefOr[
    String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
  ] = js.native
  
  var footerEvents: js.UndefOr[OnClick[T, E]] = js.native
  
  var footerFormatter: js.UndefOr[
    js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, Unit]
  ] = js.native
  
  var footerStyle: js.UndefOr[CSSProperties] = js.native
  
  var footerTitle: js.UndefOr[Boolean] = js.native
  
  var formatExtraData: js.UndefOr[TooltipFormatter[T] with E] = js.native
  
  var formatter: js.UndefOr[ColumnFormatter[T, E, _]] = js.native
  
  var headerAlign: js.UndefOr[CellAlignment] = js.native
  
  var headerClasses: js.UndefOr[
    String | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, String])
  ] = js.native
  
  var headerFormatter: js.UndefOr[HeaderFormatter[T]] = js.native
  
  var headerSortingClasses: js.UndefOr[HeaderSortingClasses[T, E]] = js.native
  
  var headerStyle: js.UndefOr[CSSProperties | js.Function0[CSSProperties]] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * If set the column will not use cell values
    */
  var isDummyField: js.UndefOr[Boolean] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  var sortCaret: js.UndefOr[ColumnSortCaret[T, E]] = js.native
  
  var sortFunc: js.UndefOr[ColumnSortFunc[T, _]] = js.native
  
  var style: js.UndefOr[
    CSSProperties | (js.Function4[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      CSSProperties
    ])
  ] = js.native
  
  /**
    * Column header field
    */
  var text: String = js.native
  
  var tooltipDataField: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ColumnDescription {
  
  @scala.inline
  def apply[T /* <: js.Object */, E](dataField: js.Any, text: String): ColumnDescription[T, E] = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[T, E]]
  }
  
  @scala.inline
  implicit class ColumnDescriptionMutableBuilder[Self <: ColumnDescription[_, _], T /* <: js.Object */, E] (val x: Self with (ColumnDescription[T, E])) extends AnyVal {
    
    @scala.inline
    def setAlign(value: CellAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setClasses(
      value: String | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
          /* row */ T, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          String
        ])
    ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => String
    ): Self = StObject.set(x, "classes", js.Any.fromFunction4(value))
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setCsvExport(value: Boolean): Self = StObject.set(x, "csvExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvExportUndefined: Self = StObject.set(x, "csvExport", js.undefined)
    
    @scala.inline
    def setCsvFormatter(value: (_, T, /* rowIndex */ Double, E) => Element | String | Boolean | ReactText): Self = StObject.set(x, "csvFormatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCsvFormatterUndefined: Self = StObject.set(x, "csvFormatter", js.undefined)
    
    @scala.inline
    def setCsvText(value: String): Self = StObject.set(x, "csvText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvTextUndefined: Self = StObject.set(x, "csvText", js.undefined)
    
    @scala.inline
    def setCsvType(value: js.Object): Self = StObject.set(x, "csvType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvTypeUndefined: Self = StObject.set(x, "csvType", js.undefined)
    
    @scala.inline
    def setDataField(value: js.Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(
      value: Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
    ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableFunction4(value: (/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditor(value: Options): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean | (TableColumnFilterProps[_, _])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T) => String
    ): Self = StObject.set(x, "filterValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    @scala.inline
    def setFooter(
      value: Boolean | Double | String | (js.Function3[
          /* columnData */ js.Any, 
          /* column */ ColumnDescription[T, E], 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterAlign(
      value: CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
    ): Self = StObject.set(x, "footerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterAlignFunction2(value: (/* column */ ColumnDescription[T, E], /* colIndex */ Double) => CellAlignment): Self = StObject.set(x, "footerAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooterAlignUndefined: Self = StObject.set(x, "footerAlign", js.undefined)
    
    @scala.inline
    def setFooterClasses(
      value: String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
    ): Self = StObject.set(x, "footerClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterClassesFunction2(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String): Self = StObject.set(x, "footerClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooterClassesUndefined: Self = StObject.set(x, "footerClasses", js.undefined)
    
    @scala.inline
    def setFooterEvents(value: OnClick[T, E]): Self = StObject.set(x, "footerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterEventsUndefined: Self = StObject.set(x, "footerEvents", js.undefined)
    
    @scala.inline
    def setFooterFormatter(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => Unit): Self = StObject.set(x, "footerFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooterFormatterUndefined: Self = StObject.set(x, "footerFormatter", js.undefined)
    
    @scala.inline
    def setFooterFunction3(
      value: (/* columnData */ js.Any, /* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String
    ): Self = StObject.set(x, "footer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    @scala.inline
    def setFooterTitle(value: Boolean): Self = StObject.set(x, "footerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTitleUndefined: Self = StObject.set(x, "footerTitle", js.undefined)
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormatExtraData(value: TooltipFormatter[T] with E): Self = StObject.set(x, "formatExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatExtraDataUndefined: Self = StObject.set(x, "formatExtraData", js.undefined)
    
    @scala.inline
    def setFormatter(value: (_, T, /* rowIndex */ Double, E) => Element | String | Boolean | ReactText): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHeaderAlign(value: CellAlignment): Self = StObject.set(x, "headerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderAlignUndefined: Self = StObject.set(x, "headerAlign", js.undefined)
    
    @scala.inline
    def setHeaderClasses(
      value: String | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, String])
    ): Self = StObject.set(x, "headerClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassesFunction2(value: (/* column */ ColumnDescription[T, E], /* colIndex */ Double) => String): Self = StObject.set(x, "headerClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeaderClassesUndefined: Self = StObject.set(x, "headerClasses", js.undefined)
    
    @scala.inline
    def setHeaderFormatter(
      value: (/* column */ ColumnDescription[T, js.Any], /* colIndex */ Double, /* components */ FilterElement) => Element | String | Double | ReactText
    ): Self = StObject.set(x, "headerFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHeaderFormatterUndefined: Self = StObject.set(x, "headerFormatter", js.undefined)
    
    @scala.inline
    def setHeaderSortingClasses(value: HeaderSortingClasses[T, E]): Self = StObject.set(x, "headerSortingClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderSortingClassesFunction4(
      value: (/* column */ ColumnDescription[T, E], /* sortOrder */ asc | desc, /* isLastSorting */ Boolean, /* colIndex */ Double) => String
    ): Self = StObject.set(x, "headerSortingClasses", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHeaderSortingClassesUndefined: Self = StObject.set(x, "headerSortingClasses", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties | js.Function0[CSSProperties]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleFunction0(value: () => CSSProperties): Self = StObject.set(x, "headerStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIsDummyField(value: Boolean): Self = StObject.set(x, "isDummyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDummyFieldUndefined: Self = StObject.set(x, "isDummyField", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCaret(
      value: (/* order */ js.UndefOr[asc | desc], /* column */ ColumnDescription[T, E]) => Element | String | Null
    ): Self = StObject.set(x, "sortCaret", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortCaretUndefined: Self = StObject.set(x, "sortCaret", js.undefined)
    
    @scala.inline
    def setSortFunc(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, /* order */ asc | desc, /* dataField */ js.Any, T, T) => Double
    ): Self = StObject.set(x, "sortFunc", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStyle(
      value: CSSProperties | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
          /* row */ T, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          CSSProperties
        ])
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => CSSProperties
    ): Self = StObject.set(x, "style", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDataField(value: String): Self = StObject.set(x, "tooltipDataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDataFieldUndefined: Self = StObject.set(x, "tooltipDataField", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
