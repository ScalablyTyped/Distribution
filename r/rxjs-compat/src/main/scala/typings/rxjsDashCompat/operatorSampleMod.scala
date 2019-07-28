package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/sample", JSImport.Namespace)
@js.native
object operatorSampleMod extends js.Object {
  def sample[T](`this`: Observable[T], notifier: Observable[_]): Observable[T] = js.native
}

