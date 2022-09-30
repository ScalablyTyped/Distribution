package typings.primereact.datatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.self
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DataTableAppendToType = js.UndefOr[self | HTMLElement | Null]

type DataTableEditingRows = StringDictionary[Boolean]

type DataTableEmptyMessageType = ReactNode | (js.Function1[/* frozen */ Boolean, ReactNode])

type DataTableExpandedRows = StringDictionary[Boolean]

type DataTableFilterMeta = StringDictionary[DataTableFilterMetaData | DataTableOperatorFilterMetaData]

type DataTableFooterTemplateOptions = DataTableHeaderTemplateOptions

type DataTableFooterTemplateType = ReactNode | (js.Function1[/* options */ DataTableFooterTemplateOptions, ReactNode])

type DataTableGlobalFilterType = js.UndefOr[String | Null]

type DataTableHeaderTemplateType = ReactNode | (js.Function1[/* options */ DataTableHeaderTemplateOptions, ReactNode])

type DataTableMultiSortMetaType = js.UndefOr[js.Array[DataTableSortMeta] | Null]

type DataTableRowGroupFooterTemplateType = ReactNode | (js.Function2[/* data */ Any, /* options */ DataTableRowGroupFooterTemplateOptions, ReactNode])

type DataTableRowGroupHeaderTemplateType = ReactNode | (js.Function2[/* data */ Any, /* options */ DataTableRowGroupHeaderTemplateOptions, ReactNode])

/* Rewritten from type alias, can be one of: 
  - typings.primereact.primereactInts.`1`
  - typings.primereact.primereactInts.`0`
  - typings.primereact.primereactInts.`-1`
  - scala.Unit
  - scala.Null
*/
type DataTableSortOrderType = js.UndefOr[_DataTableSortOrderType | Null]

type DataTableUnselectParams = DataTableSelectParams
