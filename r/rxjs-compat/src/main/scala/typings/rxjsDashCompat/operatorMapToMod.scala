package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mapTo", JSImport.Namespace)
@js.native
object operatorMapToMod extends js.Object {
  def mapTo[T, R](`this`: Observable[T], value: R): Observable[R] = js.native
}

