package typings.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableStatic extends js.Object {
  def amb[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
  def amb[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def onErrorResumeNext[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
  def onErrorResumeNext[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def using[TSource, TResource /* <: IDisposable */](
    resourceFactory: js.Function0[TResource],
    observableFactory: js.Function1[/* resource */ TResource, Observable[TSource]]
  ): Observable[TSource] = js.native
}

