package typings.ramda

import typings.ramda.toolsMod.Functor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  def default[T, U](
    fn: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T & keyof U] */ /* x */ js.Any) | (/* x */ T), 
      (/* import warning: importer.ImportType#apply Failed type conversion: U[keyof T & keyof U] */ js.Any) | U
    ]
  ): js.Function1[/* obj */ Functor[T], Functor[U]] = js.native
  def default[T, U](
    fn: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T & keyof U] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: U[keyof T & keyof U] */ js.Any
    ],
    list: T
  ): U = js.native
  def default[T, U](fn: js.Function1[/* x */ T, U], list: js.Array[T]): js.Array[U] = js.native
  def default[T, U](fn: js.Function1[/* x */ T, U], obj: Functor[T]): Functor[U] = js.native
}

