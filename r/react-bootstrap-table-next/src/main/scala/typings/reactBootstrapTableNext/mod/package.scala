package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def CHECKBOX_STATUS_CHECKED: /* "checked" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CHECKBOX_STATUS_CHECKED").asInstanceOf[/* "checked" */ java.lang.String]

@scala.inline
def CHECKBOX_STATUS_INDETERMINATE: /* "indeterminate" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CHECKBOX_STATUS_INDETERMINATE").asInstanceOf[/* "indeterminate" */ java.lang.String]

@scala.inline
def CHECKBOX_STATUS_UNCHECKED: /* "unchecked" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CHECKBOX_STATUS_UNCHECKED").asInstanceOf[/* "unchecked" */ java.lang.String]

@scala.inline
def FILTERS_POSITION_BOTTOM: /* "bottom" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FILTERS_POSITION_BOTTOM").asInstanceOf[/* "bottom" */ java.lang.String]

@scala.inline
def FILTERS_POSITION_INLINE: /* "inline" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FILTERS_POSITION_INLINE").asInstanceOf[/* "inline" */ java.lang.String]

@scala.inline
def FILTERS_POSITION_TOP: /* "top" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FILTERS_POSITION_TOP").asInstanceOf[/* "top" */ java.lang.String]

@scala.inline
def ROW_SELECT_DISABLED: /* "ROW_SELECT_DISABLED" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROW_SELECT_DISABLED").asInstanceOf[/* "ROW_SELECT_DISABLED" */ java.lang.String]

@scala.inline
def ROW_SELECT_MULTIPLE: /* "checkbox" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROW_SELECT_MULTIPLE").asInstanceOf[/* "checkbox" */ java.lang.String]

@scala.inline
def ROW_SELECT_SINGLE: /* "radio" */ java.lang.String = typings.reactBootstrapTableNext.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROW_SELECT_SINGLE").asInstanceOf[/* "radio" */ java.lang.String]

type BootstrapTable[T /* <: js.Object */, K] = typings.react.mod.Component[typings.reactBootstrapTableNext.mod.BootstrapTableProps[T, K], js.Object, js.Any]

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.center
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.start
  - typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.end
  - java.lang.String
*/
type CellAlignment = typings.reactBootstrapTableNext.mod._CellAlignment | java.lang.String

type ColumnFormatter[R, E, C] = js.Function4[
/* cell */ C, 
/* row */ R, 
/* rowIndex */ scala.Double, 
/* formatExtraData */ E, 
typings.react.mod.global.JSX.Element | java.lang.String | scala.Boolean | typings.react.mod.ReactText]

type ColumnSortCaret[T /* <: js.Object */, E] = js.Function2[
/* order */ js.UndefOr[
  typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc | typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
], 
/* column */ typings.reactBootstrapTableNext.mod.ColumnDescription[T, E], 
typings.react.mod.global.JSX.Element | java.lang.String | scala.Null]

type ColumnSortFunc[T, E /* <: /* keyof T */ java.lang.String */] = js.Function6[
/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, 
/* order */ typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc | typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc, 
/* dataField */ js.Any, 
/* rowA */ T, 
/* rowB */ T, 
scala.Double]

type FilterPosition = /* "inline" */ java.lang.String

type HeaderFormatter[T /* <: js.Object */] = js.Function3[
/* column */ typings.reactBootstrapTableNext.mod.ColumnDescription[T, js.Any], 
/* colIndex */ scala.Double, 
/* components */ typings.reactBootstrapTableNext.anon.FilterElement, 
typings.react.mod.global.JSX.Element | java.lang.String | scala.Double | typings.react.mod.ReactText]

type HeaderSortingClasses[T /* <: js.Object */, E] = java.lang.String | (js.Function4[
/* column */ typings.reactBootstrapTableNext.mod.ColumnDescription[T, E], 
/* sortOrder */ typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc | typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc, 
/* isLastSorting */ scala.Boolean, 
/* colIndex */ scala.Double, 
java.lang.String])

type RowEventHandler[T] = js.Function3[
/* e */ typings.react.mod.SyntheticEvent[typings.std.Element, typings.std.Event], 
/* row */ T, 
/* rowIndex */ scala.Double, 
scala.Unit]

type RowSelectionType = /* "radio" */ java.lang.String

type TableChangeHandler[T] = js.Function2[
/* type */ typings.reactBootstrapTableNext.mod.TableChangeType, 
/* newState */ typings.reactBootstrapTableNext.mod.TableChangeState[T], 
scala.Unit]

type TableCheckboxStatus = /* "indeterminate" */ java.lang.String
