package typings.rxjs.internalDashCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "CombineLatestOperator")
@js.native
class CombineLatestOperator[T, R] ()
  extends typings.rxjs.internalObservableCombineLatestMod.CombineLatestOperator[T, R] {
  def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
}

