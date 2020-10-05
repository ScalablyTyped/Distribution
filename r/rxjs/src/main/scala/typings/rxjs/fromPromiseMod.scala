package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/fromPromise", JSImport.Namespace)
@js.native
object fromPromiseMod extends js.Object {
  def fromPromise[T](input: js.Thenable[T]): Observable[T] = js.native
  def fromPromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

