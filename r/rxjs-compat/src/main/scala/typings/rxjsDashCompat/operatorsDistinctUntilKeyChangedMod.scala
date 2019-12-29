package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/distinctUntilKeyChanged", JSImport.Namespace)
@js.native
object operatorsDistinctUntilKeyChangedMod extends js.Object {
  def distinctUntilKeyChanged[T](key: String): js.Any = js.native
  def distinctUntilKeyChanged[T, K /* <: String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): js.Any = js.native
}

