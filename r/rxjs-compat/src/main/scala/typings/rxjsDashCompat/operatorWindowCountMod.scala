package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowCount", JSImport.Namespace)
@js.native
object operatorWindowCountMod extends js.Object {
  def windowCount[T](`this`: Observable[T], windowSize: Double): Observable[Observable[T]] = js.native
  def windowCount[T](`this`: Observable[T], windowSize: Double, startWindowEvery: Double): Observable[Observable[T]] = js.native
}

