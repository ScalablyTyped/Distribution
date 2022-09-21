package typings.reactBootstrapTableNext.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.FilterElement
import typings.reactBootstrapTableNext.mod.^
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CHECKBOX_STATUS_CHECKED: /* "checked" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("CHECKBOX_STATUS_CHECKED").asInstanceOf[/* "checked" */ String]

inline def CHECKBOX_STATUS_INDETERMINATE: /* "indeterminate" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("CHECKBOX_STATUS_INDETERMINATE").asInstanceOf[/* "indeterminate" */ String]

inline def CHECKBOX_STATUS_UNCHECKED: /* "unchecked" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("CHECKBOX_STATUS_UNCHECKED").asInstanceOf[/* "unchecked" */ String]

inline def FILTERS_POSITION_BOTTOM: /* "bottom" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTERS_POSITION_BOTTOM").asInstanceOf[/* "bottom" */ String]

inline def FILTERS_POSITION_INLINE: /* "inline" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTERS_POSITION_INLINE").asInstanceOf[/* "inline" */ String]

inline def FILTERS_POSITION_TOP: /* "top" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTERS_POSITION_TOP").asInstanceOf[/* "top" */ String]

inline def ROW_SELECT_DISABLED: /* "ROW_SELECT_DISABLED" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ROW_SELECT_DISABLED").asInstanceOf[/* "ROW_SELECT_DISABLED" */ String]

inline def ROW_SELECT_MULTIPLE: /* "checkbox" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ROW_SELECT_MULTIPLE").asInstanceOf[/* "checkbox" */ String]

inline def ROW_SELECT_SINGLE: /* "radio" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ROW_SELECT_SINGLE").asInstanceOf[/* "radio" */ String]

type BootstrapTable[T /* <: js.Object */, K] = Component[BootstrapTableProps[T, K], js.Object, Any]

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.center
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.start
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.end
  - java.lang.String
*/
type CellAlignment = _CellAlignment | String

type ColumnFormatter[R, E, C] = js.Function4[
/* cell */ C, 
/* row */ R, 
/* rowIndex */ Double, 
/* formatExtraData */ js.UndefOr[E], 
ReactNode]

type ColumnSortCaret[T /* <: js.Object */, E] = js.Function2[
/* order */ js.UndefOr[asc | desc], 
/* column */ ColumnDescription[T, E], 
Element | String | Null]

type ColumnSortFunc[T, E /* <: /* keyof T */ String */] = js.Function6[
/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, 
/* order */ asc | desc, 
/* dataField */ Any, 
/* rowA */ T, 
/* rowB */ T, 
Double]

type ColumnSortValue[R, C] = js.Function2[/* cell */ C, /* row */ R, Boolean | String | Double]

type FilterPosition = /* "inline" */ String

type HeaderFormatter[T /* <: js.Object */] = js.Function3[
/* column */ ColumnDescription[T, Any], 
/* colIndex */ Double, 
/* components */ FilterElement, 
ReactNode]

type HeaderSortingClasses[T /* <: js.Object */, E] = String | (js.Function4[
/* column */ ColumnDescription[T, E], 
/* sortOrder */ asc | desc, 
/* isLastSorting */ Boolean, 
/* colIndex */ Double, 
String])

type RowEventHandler[T] = js.Function3[
/* e */ SyntheticEvent[typings.std.Element, Event], 
/* row */ T, 
/* rowIndex */ Double, 
Unit]

type RowSelectionType = /* "radio" */ String

type TableChangeHandler[T] = js.Function2[/* type */ TableChangeType, /* newState */ TableChangeState[T], Unit]

type TableCheckboxStatus = /* "indeterminate" */ String
