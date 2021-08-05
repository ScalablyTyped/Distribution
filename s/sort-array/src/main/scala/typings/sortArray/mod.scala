package typings.sortArray

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(recordset: js.Array[js.Object], columnNames: String): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].apply(recordset.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def apply(recordset: js.Array[js.Object], columnNames: String, customOrder: Record[String, js.Array[js.Any]]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].apply(recordset.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any], customOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def apply(recordset: js.Array[js.Object], columnNames: js.Array[String]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].apply(recordset.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def apply(
    recordset: js.Array[js.Object],
    columnNames: js.Array[String],
    customOrder: Record[String, js.Array[js.Any]]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].apply(recordset.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any], customOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(recordset.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T], customOrder: Partial[CustomOrder[T]]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(recordset.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any], customOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ColumnNames[T] = (/* keyof T */ String) | (js.Array[/* keyof T */ String])
  
  type CustomOrder[T] = Record[/* keyof T */ String, CustomOrderTypes[T]]
  
  type CustomOrderTypes[T] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
}
