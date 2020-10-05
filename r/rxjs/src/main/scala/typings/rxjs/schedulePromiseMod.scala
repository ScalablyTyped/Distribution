package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduled/schedulePromise", JSImport.Namespace)
@js.native
object schedulePromiseMod extends js.Object {
  def schedulePromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

