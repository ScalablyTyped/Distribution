package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/takeWhile", JSImport.Namespace)
@js.native
object operatorTakeWhileMod extends js.Object {
  def takeWhile[T](`this`: Observable[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable[T] = js.native
}

