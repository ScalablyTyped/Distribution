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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDescription[T /* <: js.Object */, E] extends js.Object {
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
  var headerFormatter: js.UndefOr[HeaderFormatter[T]] = js.native
  var headerStyle: js.UndefOr[CSSProperties | js.Function0[CSSProperties]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * If set the column will not use cell values
    */
  var isDummyField: js.UndefOr[Boolean] = js.native
  var searchable: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[Boolean] = js.native
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
  def apply[/* <: js.Object */ T, E](dataField: js.Any, text: String): ColumnDescription[T, E] = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[T, E]]
  }
  @scala.inline
  implicit class ColumnDescriptionOps[Self <: ColumnDescription[_, _], /* <: js.Object */ T, E] (val x: Self with (ColumnDescription[T, E])) extends AnyVal {
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
    def setDataField(value: js.Any): Self = this.set("dataField", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: CellAlignment): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setClassesFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => String
    ): Self = this.set("classes", js.Any.fromFunction4(value))
    @scala.inline
    def setClasses(
      value: String | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
          /* row */ T, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          String
        ])
    ): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCsvExport(value: Boolean): Self = this.set("csvExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvExport: Self = this.set("csvExport", js.undefined)
    @scala.inline
    def setCsvFormatter(value: (_, T, /* rowIndex */ Double, E) => Element | String | Boolean | ReactText): Self = this.set("csvFormatter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCsvFormatter: Self = this.set("csvFormatter", js.undefined)
    @scala.inline
    def setCsvText(value: String): Self = this.set("csvText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvText: Self = this.set("csvText", js.undefined)
    @scala.inline
    def setCsvType(value: js.Object): Self = this.set("csvType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvType: Self = this.set("csvType", js.undefined)
    @scala.inline
    def setEditableFunction4(value: (/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => Boolean): Self = this.set("editable", js.Any.fromFunction4(value))
    @scala.inline
    def setEditable(
      value: Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
    ): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEditor(value: Options): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setFilter(value: Boolean | (TableColumnFilterProps[_, _])): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T) => String
    ): Self = this.set("filterValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    @scala.inline
    def setFooterFunction3(
      value: (/* columnData */ js.Any, /* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String
    ): Self = this.set("footer", js.Any.fromFunction3(value))
    @scala.inline
    def setFooter(
      value: Boolean | Double | String | (js.Function3[
          /* columnData */ js.Any, 
          /* column */ ColumnDescription[T, E], 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFooterAlignFunction2(value: (/* column */ ColumnDescription[T, E], /* colIndex */ Double) => CellAlignment): Self = this.set("footerAlign", js.Any.fromFunction2(value))
    @scala.inline
    def setFooterAlign(
      value: CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
    ): Self = this.set("footerAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterAlign: Self = this.set("footerAlign", js.undefined)
    @scala.inline
    def setFooterClassesFunction2(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String): Self = this.set("footerClasses", js.Any.fromFunction2(value))
    @scala.inline
    def setFooterClasses(
      value: String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
    ): Self = this.set("footerClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterClasses: Self = this.set("footerClasses", js.undefined)
    @scala.inline
    def setFooterEvents(value: OnClick[T, E]): Self = this.set("footerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterEvents: Self = this.set("footerEvents", js.undefined)
    @scala.inline
    def setFooterFormatter(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => Unit): Self = this.set("footerFormatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFooterFormatter: Self = this.set("footerFormatter", js.undefined)
    @scala.inline
    def setFooterStyle(value: CSSProperties): Self = this.set("footerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterStyle: Self = this.set("footerStyle", js.undefined)
    @scala.inline
    def setFooterTitle(value: Boolean): Self = this.set("footerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTitle: Self = this.set("footerTitle", js.undefined)
    @scala.inline
    def setFormatExtraData(value: TooltipFormatter[T] with E): Self = this.set("formatExtraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatExtraData: Self = this.set("formatExtraData", js.undefined)
    @scala.inline
    def setFormatter(value: (_, T, /* rowIndex */ Double, E) => Element | String | Boolean | ReactText): Self = this.set("formatter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setHeaderAlign(value: CellAlignment): Self = this.set("headerAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderAlign: Self = this.set("headerAlign", js.undefined)
    @scala.inline
    def setHeaderFormatter(
      value: (/* column */ ColumnDescription[T, js.Any], /* colIndex */ Double, /* components */ FilterElement) => Element | String | Double | ReactText
    ): Self = this.set("headerFormatter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHeaderFormatter: Self = this.set("headerFormatter", js.undefined)
    @scala.inline
    def setHeaderStyleFunction0(value: () => CSSProperties): Self = this.set("headerStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaderStyle(value: CSSProperties | js.Function0[CSSProperties]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIsDummyField(value: Boolean): Self = this.set("isDummyField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDummyField: Self = this.set("isDummyField", js.undefined)
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortFunc(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, /* order */ asc | desc, /* dataField */ js.Any, T, T) => Double
    ): Self = this.set("sortFunc", js.Any.fromFunction6(value))
    @scala.inline
    def deleteSortFunc: Self = this.set("sortFunc", js.undefined)
    @scala.inline
    def setStyleFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => CSSProperties
    ): Self = this.set("style", js.Any.fromFunction4(value))
    @scala.inline
    def setStyle(
      value: CSSProperties | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
          /* row */ T, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          CSSProperties
        ])
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTooltipDataField(value: String): Self = this.set("tooltipDataField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipDataField: Self = this.set("tooltipDataField", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

