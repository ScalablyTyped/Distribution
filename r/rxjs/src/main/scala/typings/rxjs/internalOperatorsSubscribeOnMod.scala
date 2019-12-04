package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/subscribeOn", JSImport.Namespace)
@js.native
object internalOperatorsSubscribeOnMod extends js.Object {
  def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
}

