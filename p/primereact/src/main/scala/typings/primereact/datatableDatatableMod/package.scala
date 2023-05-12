package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Custom datatable editing rows.
  */
type DataTableEditingRows = StringDictionary[Boolean]

/**
  * Custom datatable expanded rows.
  */
type DataTableExpandedRows = StringDictionary[Boolean]

/**
  * Custom datatable filter meta.
  */
type DataTableFilterMeta = /**
  * Extra options.
  */
StringDictionary[DataTableFilterMetaData | DataTableOperatorFilterMetaData]

type DataTableFooterTemplateOptions[TValue /* <: DataTableValueArray */] = DataTableHeaderTemplateOptions[TValue]

type DataTableFooterTemplateType[TValue /* <: DataTableValueArray */] = ReactNode | (js.Function1[/* options */ DataTableFooterTemplateOptions[TValue], ReactNode])

type DataTableHeaderTemplateType[TValue /* <: DataTableValueArray */] = ReactNode | (js.Function1[/* options */ DataTableHeaderTemplateOptions[TValue], ReactNode])

/**
  * Custom row click event.
  * @see {@link DataTableProps.onRowClick}, {@link DataTableProps.onRowDoubleClick}
  * @extends DataTableRowMouseEvent
  * @event
  */
type DataTableRowClickEvent = DataTableRowMouseEvent

type DataTableRowDataArray[TValue /* <: DataTableValueArray */] = js.Array[DataTableRowData[TValue]]

type DataTableRowGroupFooterTemplateType[TValue /* <: DataTableValueArray */] = ReactNode | (js.Function2[
/* data */ Any, 
/* options */ DataTableRowGroupFooterTemplateOptions[TValue], 
ReactNode])

type DataTableRowGroupHeaderTemplateType[TValue /* <: DataTableValueArray */] = ReactNode | (js.Function2[
/* data */ Any, 
/* options */ DataTableRowGroupHeaderTemplateOptions[TValue], 
ReactNode])

/* Rewritten from type alias, can be one of: 
  - typings.primereact.datatableDatatableMod.DataTableRowData[TValue]
  - typings.primereact.datatableDatatableMod.DataTableRowDataArray[TValue]
  - typings.primereact.datatableDatatableMod.DataTableCellSelection[TValue]
*/
type DataTableSelection[TValue /* <: DataTableValueArray */] = _DataTableSelection[TValue] | DataTableRowDataArray[TValue]

/**
  * Custom unselect event.
  * @see {@link DataTableProps.onAllRowsUnselect}, {@link DataTableProps.onRowUnselect}
  * @extends DataTableSelectEvent
  * @event
  */
type DataTableUnselectEvent = DataTableSelectEvent

/**
  * Custom value definition.
  * @extends Record<string, any>
  */
type DataTableValue = Record[String, Any]

/**
  * Custom value array definition.
  * @extends Array<DataTableValue>
  */
type DataTableValueArray = js.Array[DataTableValue]
