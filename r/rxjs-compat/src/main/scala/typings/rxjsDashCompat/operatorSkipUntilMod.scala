package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/skipUntil", JSImport.Namespace)
@js.native
object operatorSkipUntilMod extends js.Object {
  def skipUntil[T](`this`: Observable[T], notifier: Observable[_]): Observable[T] = js.native
}

