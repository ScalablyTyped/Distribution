package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/distinctUntilKeyChanged", JSImport.Namespace)
@js.native
object internalOperatorsDistinctUntilKeyChangedMod extends js.Object {
  def distinctUntilKeyChanged[T](key: String): MonoTypeOperatorFunction[T] = js.native
  def distinctUntilKeyChanged[T, K /* <: String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): MonoTypeOperatorFunction[T] = js.native
}

