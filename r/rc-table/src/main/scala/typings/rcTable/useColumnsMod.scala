package typings.rcTable

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/hooks/useColumns", JSImport.Namespace)
@js.native
object useColumnsMod extends js.Object {
  /**
    * Parse `columns` & `children` into `columns`.
    */
  def default[RecordType](
    hasPrefixClsColumnsChildrenExpandableExpandedKeysGetRowKeyOnTriggerExpandExpandIconRowExpandableExpandIconColumnIndex: AnonColumns[RecordType],
    transformColumns: js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  ): js.Tuple2[ColumnsType[RecordType], js.Array[ColumnType[RecordType]]] = js.native
}

