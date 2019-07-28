package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/subscribeOn", JSImport.Namespace)
@js.native
object operatorSubscribeOnMod extends js.Object {
  def subscribeOn[T](`this`: Observable[T], scheduler: SchedulerLike): Observable[T] = js.native
  def subscribeOn[T](`this`: Observable[T], scheduler: SchedulerLike, delay: Double): Observable[T] = js.native
}

