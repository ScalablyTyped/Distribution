package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/retry", JSImport.Namespace)
@js.native
object operatorRetryMod extends js.Object {
  def retry[T](`this`: Observable[T]): Observable[T] = js.native
  def retry[T](`this`: Observable[T], count: Double): Observable[T] = js.native
}

