package typings.rxjs.internalCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "CombineLatestOperator")
@js.native
class CombineLatestOperator[T, R] ()
  extends typings.rxjs.combineLatestMod.CombineLatestOperator[T, R] {
  def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
}
