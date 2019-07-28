package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/pluck", JSImport.Namespace)
@js.native
object operatorPluckMod extends js.Object {
  def pluck[T, R](`this`: Observable[T], properties: String*): Observable[R] = js.native
}

