package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromIterableMod {
  
  @JSImport("rxjs/internal/observable/fromIterable", "fromIterable")
  @js.native
  def fromIterable[T](input: Iterable[T]): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/fromIterable", "fromIterable")
  @js.native
  def fromIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}
