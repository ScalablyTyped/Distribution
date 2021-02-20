package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromPromiseMod {
  
  @JSImport("rxjs/internal/observable/fromPromise", "fromPromise")
  @js.native
  def fromPromise[T](input: js.Thenable[T]): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/fromPromise", "fromPromise")
  @js.native
  def fromPromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}
