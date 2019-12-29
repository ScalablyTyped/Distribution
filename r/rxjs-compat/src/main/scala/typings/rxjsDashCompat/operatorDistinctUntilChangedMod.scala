package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinctUntilChanged", JSImport.Namespace)
@js.native
object operatorDistinctUntilChangedMod extends js.Object {
  def distinctUntilChanged[T](): js.Any = js.native
  def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Any = js.native
  def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): js.Any = js.native
}

