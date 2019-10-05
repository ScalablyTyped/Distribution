package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "range")
@js.native
object range extends js.Object {
  def apply(): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(start: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(start: Double, count: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(start: Double, count: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
}

