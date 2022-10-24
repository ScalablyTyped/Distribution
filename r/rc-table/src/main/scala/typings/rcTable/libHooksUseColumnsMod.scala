package typings.rcTable

import typings.rcTable.anon.ColumnTitle
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.ColumnsType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseColumnsMod {
  
  @JSImport("rc-table/lib/hooks/useColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse `columns` & `children` into `columns`.
    */
  inline def default[RecordType](
    param0: ColumnTitle[RecordType],
    transformColumns: js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  ): js.Tuple2[ColumnsType[RecordType], js.Array[ColumnType[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], transformColumns.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ColumnsType[RecordType], js.Array[ColumnType[RecordType]]]]
  
  inline def convertChildrenToColumns[RecordType](children: ReactNode): ColumnsType[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToColumns")(children.asInstanceOf[js.Any]).asInstanceOf[ColumnsType[RecordType]]
}
