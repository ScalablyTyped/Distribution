package typings.regeneratorRuntime.mod

import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regenerator-runtime", "values")
@js.native
object values extends js.Object {
  
  def apply[T](iterableOrArrayLike: ArrayLike[T]): Iterator[T, _, _] = js.native
  def apply[T](iterableOrArrayLike: Iterable[T]): Iterator[T, _, _] = js.native
  def apply[I /* <: Iterator[_, _, _] */](iterable: typings.regeneratorRuntime.anon.Iterator[I]): I = js.native
}
