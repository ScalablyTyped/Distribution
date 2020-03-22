package typings.rcTable

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/hooks/useColumns", JSImport.Namespace)
@js.native
object useColumnsMod extends js.Object {
  def convertChildrenToColumns[RecordType](children: ReactNode): ColumnsType[RecordType] = js.native
  /**
    * Parse `columns` & `children` into `columns`.
    */
  def default[RecordType](
    hasPrefixClsColumnsChildrenExpandableExpandedKeysGetRowKeyOnTriggerExpandExpandIconRowExpandableExpandIconColumnIndexDirection: AnonColumns[RecordType],
    transformColumns: js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  ): js.Tuple2[ColumnsType[RecordType], js.Array[ColumnType[RecordType]]] = js.native
}

