package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "interval")
@js.native
object interval extends js.Object {
  def apply(): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(period: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(period: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
}

