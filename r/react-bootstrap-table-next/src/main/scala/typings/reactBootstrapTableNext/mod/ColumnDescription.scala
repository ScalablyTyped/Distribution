package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactText
import typings.react.mod._Global_.JSX.Element
import typings.reactBootstrapTableNext.AnonFilterElement
import typings.reactBootstrapTableNext.AnonOnClick
import typings.reactBootstrapTableNext.AnonOptions
import typings.reactBootstrapTableNext.AnonTooltipFormatter
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDescription[T /* <: js.Object */, E] extends js.Object {
  var align: js.UndefOr[CellAlignment] = js.undefined
  var dataField: js.Any
  var editable: js.UndefOr[
    Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
  ] = js.undefined
  var editor: js.UndefOr[AnonOptions] = js.undefined
  var filter: js.UndefOr[Boolean | (TableColumnFilterProps[_, _])] = js.undefined
  var filterValue: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      String
    ]
  ] = js.undefined
  var footer: js.UndefOr[
    Boolean | Double | String | (js.Function3[
      /* columnData */ js.Any, 
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
  var footerEvents: js.UndefOr[AnonOnClick[T, E]] = js.undefined
  var footerFormatter: js.UndefOr[
    js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, Unit]
  ] = js.undefined
  var footerStyle: js.UndefOr[CSSProperties] = js.undefined
  var footerTitle: js.UndefOr[Boolean] = js.undefined
  var formatExtraData: js.UndefOr[AnonTooltipFormatter[T] with E] = js.undefined
  var formatter: js.UndefOr[ColumnFormatter[T, E, _]] = js.undefined
  var headerAlign: js.UndefOr[CellAlignment] = js.undefined
  var headerFormatter: js.UndefOr[HeaderFormatter[T]] = js.undefined
  var headerStyle: js.UndefOr[CSSProperties | js.Function0[CSSProperties]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * If set the column will not use cell values
    */
  var isDummyField: js.UndefOr[Boolean] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var sortFunc: js.UndefOr[ColumnSortFunc[T, _]] = js.undefined
  /**
    * Column header field
    */
  var text: String
  var tooltipDataField: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ColumnDescription {
  @scala.inline
  def apply[T /* <: js.Object */, E](
    dataField: js.Any,
    text: String,
    align: CellAlignment = null,
    editable: Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean]) = null,
    editor: AnonOptions = null,
    filter: Boolean | (TableColumnFilterProps[_, _]) = null,
    filterValue: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T) => String = null,
    footer: Boolean | Double | String | (js.Function3[
      /* columnData */ js.Any, 
      /* column */ ColumnDescription[T, E], 
      /* columnIndex */ Double, 
      String
    ]) = null,
    footerAlign: CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment]) = null,
    footerClasses: String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String]) = null,
    footerEvents: AnonOnClick[T, E] = null,
    footerFormatter: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => Unit = null,
    footerStyle: CSSProperties = null,
    footerTitle: js.UndefOr[Boolean] = js.undefined,
    formatExtraData: AnonTooltipFormatter[T] with E = null,
    formatter: (_, T, /* rowIndex */ Double, E) => Element | String | Boolean | ReactText = null,
    headerAlign: CellAlignment = null,
    headerFormatter: (/* column */ ColumnDescription[T, js.Any], /* colIndex */ Double, /* components */ AnonFilterElement) => Element | String | Double | ReactText = null,
    headerStyle: CSSProperties | js.Function0[CSSProperties] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isDummyField: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortFunc: (/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, /* order */ asc | desc, /* dataField */ js.Any, T, T) => Double = null,
    tooltipDataField: String = null,
    width: Int | Double = null
  ): ColumnDescription[T, E] = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(js.Any.fromFunction2(filterValue))
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerAlign != null) __obj.updateDynamic("footerAlign")(footerAlign.asInstanceOf[js.Any])
    if (footerClasses != null) __obj.updateDynamic("footerClasses")(footerClasses.asInstanceOf[js.Any])
    if (footerEvents != null) __obj.updateDynamic("footerEvents")(footerEvents.asInstanceOf[js.Any])
    if (footerFormatter != null) __obj.updateDynamic("footerFormatter")(js.Any.fromFunction2(footerFormatter))
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(footerTitle)) __obj.updateDynamic("footerTitle")(footerTitle.asInstanceOf[js.Any])
    if (formatExtraData != null) __obj.updateDynamic("formatExtraData")(formatExtraData.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction4(formatter))
    if (headerAlign != null) __obj.updateDynamic("headerAlign")(headerAlign.asInstanceOf[js.Any])
    if (headerFormatter != null) __obj.updateDynamic("headerFormatter")(js.Any.fromFunction3(headerFormatter))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isDummyField)) __obj.updateDynamic("isDummyField")(isDummyField.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (sortFunc != null) __obj.updateDynamic("sortFunc")(js.Any.fromFunction6(sortFunc))
    if (tooltipDataField != null) __obj.updateDynamic("tooltipDataField")(tooltipDataField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[T, E]]
  }
}

