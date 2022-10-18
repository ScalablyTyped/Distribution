package typings.rcTable

import typings.rcTable.anon.Indent
import typings.rcTable.libInterfaceMod.GetRowKey
import typings.rcTable.libInterfaceMod.Key
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseFlattenRecordsMod {
  
  @JSImport("rc-table/lib/hooks/useFlattenRecords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](data: Any, childrenColumnName: String, expandedKeys: Set[Key], getRowKey: GetRowKey[T]): js.Array[Indent[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[Indent[T]]]
}
