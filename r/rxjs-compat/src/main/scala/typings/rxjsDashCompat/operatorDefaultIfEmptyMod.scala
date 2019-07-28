package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/defaultIfEmpty", JSImport.Namespace)
@js.native
object operatorDefaultIfEmptyMod extends js.Object {
  def defaultIfEmpty[T](`this`: Observable[T]): Observable[T] = js.native
  def defaultIfEmpty[T](`this`: Observable[T], defaultValue: T): Observable[T] = js.native
  @JSName("defaultIfEmpty")
  def defaultIfEmpty_TR[T, R](`this`: Observable[T]): Observable[T | R] = js.native
  @JSName("defaultIfEmpty")
  def defaultIfEmpty_TR[T, R](`this`: Observable[T], defaultValue: R): Observable[T | R] = js.native
}

