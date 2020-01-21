package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/retry", JSImport.Namespace)
@js.native
object retryMod extends js.Object {
  def retry[T](): MonoTypeOperatorFunction[T] = js.native
  def retry[T](count: Double): MonoTypeOperatorFunction[T] = js.native
}

