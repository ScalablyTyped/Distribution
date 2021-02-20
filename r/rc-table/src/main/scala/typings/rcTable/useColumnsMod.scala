package typings.rcTable

import typings.rcTable.anon.Columns
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useColumnsMod {
  
  /**
    * Parse `columns` & `children` into `columns`.
    */
  @JSImport("rc-table/lib/hooks/useColumns", JSImport.Default)
  @js.native
  def default[RecordType](
    hasPrefixClsColumnsChildrenExpandableExpandedKeysGetRowKeyOnTriggerExpandExpandIconRowExpandableExpandIconColumnIndexDirectionExpandRowByClick: Columns[RecordType],
    transformColumns: js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  ): js.Tuple2[ColumnsType[RecordType], js.Array[ColumnType[RecordType]]] = js.native
  
  @JSImport("rc-table/lib/hooks/useColumns", "convertChildrenToColumns")
  @js.native
  def convertChildrenToColumns[RecordType](children: ReactNode): ColumnsType[RecordType] = js.native
}
