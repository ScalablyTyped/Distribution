package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/skipWhile", JSImport.Namespace)
@js.native
object operatorSkipWhileMod extends js.Object {
  def skipWhile[T](`this`: Observable[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable[T] = js.native
}

