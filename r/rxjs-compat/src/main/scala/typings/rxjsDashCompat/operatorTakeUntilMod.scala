package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/takeUntil", JSImport.Namespace)
@js.native
object operatorTakeUntilMod extends js.Object {
  def takeUntil[T](`this`: Observable[T], notifier: Observable[_]): Observable[T] = js.native
}

