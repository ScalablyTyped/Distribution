package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromIterableMod {
  
  @JSImport("rxjs/internal/observable/fromIterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIterable[T](input: Iterable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
