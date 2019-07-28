package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/throwError", JSImport.Namespace)
@js.native
object internalObservableThrowErrorMod extends js.Object {
  def throwError(error: js.Any): Observable[scala.Nothing] = js.native
  def throwError(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

