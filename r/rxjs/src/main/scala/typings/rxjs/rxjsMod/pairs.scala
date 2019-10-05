package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "pairs")
@js.native
object pairs extends js.Object {
  def apply[T](obj: js.Object): typings.rxjs.internalObservableMod.Observable[js.Tuple2[String, T]] = js.native
  def apply[T](obj: js.Object, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Tuple2[String, T]] = js.native
}

