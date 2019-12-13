package typings.ramda

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/pluck", JSImport.Namespace)
@js.native
object srcPluckMod extends js.Object {
  def default(p: Double): js.Function1[/* list */ js.Array[NumberDictionary[_]], js.Array[_]] = js.native
  def default[P /* <: String */](p: P): js.Function1[/* list */ js.Array[Record[P, _]], js.Array[_]] = js.native
  def default[T](p: Double, list: js.Array[NumberDictionary[T]]): js.Array[T] = js.native
  def default[K /* <: String */, T](p: K, list: js.Array[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}

