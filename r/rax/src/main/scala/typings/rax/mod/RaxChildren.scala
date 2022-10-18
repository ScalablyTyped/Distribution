package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Rax.Children
// ----------------------------------------------------------------------
@js.native
trait RaxChildren extends StObject {
  
  def count(children: Any): Double = js.native
  
  def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  
  def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
  def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
  
  def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = js.native
  
  def toArray[C](children: C): js.Array[C] = js.native
  def toArray[C](children: js.Array[C]): js.Array[C] = js.native
}
