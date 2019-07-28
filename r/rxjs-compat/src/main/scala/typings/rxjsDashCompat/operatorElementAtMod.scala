package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/elementAt", JSImport.Namespace)
@js.native
object operatorElementAtMod extends js.Object {
  def elementAt[T](`this`: Observable[T], index: Double): Observable[T] = js.native
  def elementAt[T](`this`: Observable[T], index: Double, defaultValue: T): Observable[T] = js.native
}

