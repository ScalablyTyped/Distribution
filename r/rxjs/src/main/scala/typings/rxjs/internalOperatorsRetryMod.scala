package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/retry", JSImport.Namespace)
@js.native
object internalOperatorsRetryMod extends js.Object {
  def retry[T](): MonoTypeOperatorFunction[T] = js.native
  def retry[T](count: Double): MonoTypeOperatorFunction[T] = js.native
}

