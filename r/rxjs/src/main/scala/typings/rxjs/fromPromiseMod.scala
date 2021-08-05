package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromPromiseMod {
  
  @JSImport("rxjs/internal/observable/fromPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPromise[T](input: js.Thenable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromPromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
