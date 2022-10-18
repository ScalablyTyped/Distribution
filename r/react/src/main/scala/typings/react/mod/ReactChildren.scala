package typings.react.mod

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// React.Children
// ----------------------------------------------------------------------
/**
  * @deprecated - Use `typeof React.Children` instead.
  */
// Sync with type of `const Children`.
@js.native
trait ReactChildren extends StObject {
  
  def count(children: Any): Double = js.native
  
  def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  
  def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
  def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
  
  def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = js.native
  
  def toArray(children: js.Array[ReactNode]): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = js.native
  def toArray(children: ReactNode): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = js.native
}
