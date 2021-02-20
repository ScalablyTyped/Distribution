package typings.sortArray

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  def apply(recordset: js.Array[js.Object], columnNames: String): js.Array[js.Object] = js.native
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  def apply(recordset: js.Array[js.Object], columnNames: String, customOrder: Record[String, js.Array[_]]): js.Array[js.Object] = js.native
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  def apply(recordset: js.Array[js.Object], columnNames: js.Array[String]): js.Array[js.Object] = js.native
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  def apply(
    recordset: js.Array[js.Object],
    columnNames: js.Array[String],
    customOrder: Record[String, js.Array[_]]
  ): js.Array[js.Object] = js.native
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T]): js.Array[T] = js.native
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T], customOrder: Partial[CustomOrder[T]]): js.Array[T] = js.native
  
  type ColumnNames[T] = (/* keyof T */ String) | (js.Array[/* keyof T */ String])
  
  type CustomOrder[T] = Record[/* keyof T */ String, CustomOrderTypes[T]]
  
  type CustomOrderTypes[T] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
}
