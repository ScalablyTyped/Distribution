package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduled/scheduleIterable", JSImport.Namespace)
@js.native
object scheduleIterableMod extends js.Object {
  
  def scheduleIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}
