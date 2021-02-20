package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduleIterableMod {
  
  @JSImport("rxjs/internal/scheduled/scheduleIterable", "scheduleIterable")
  @js.native
  def scheduleIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}
