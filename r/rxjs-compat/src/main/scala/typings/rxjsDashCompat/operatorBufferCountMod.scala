package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/bufferCount", JSImport.Namespace)
@js.native
object operatorBufferCountMod extends js.Object {
  def bufferCount[T](`this`: Observable[T], bufferSize: Double): Observable[js.Array[T]] = js.native
  def bufferCount[T](`this`: Observable[T], bufferSize: Double, startBufferEvery: Double): Observable[js.Array[T]] = js.native
}

