package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Notifications
@js.native
trait Notification[T] extends StObject {
  
  def accept(observer: IObserver[T]): Unit = js.native
  def accept[TResult](onNext: js.Function1[/* value */ T, TResult]): TResult = js.native
  def accept[TResult](
    onNext: js.Function1[/* value */ T, TResult],
    onError: js.Function1[/* exception */ js.Any, TResult]
  ): TResult = js.native
  def accept[TResult](
    onNext: js.Function1[/* value */ T, TResult],
    onError: js.Function1[/* exception */ js.Any, TResult],
    onCompleted: js.Function0[TResult]
  ): TResult = js.native
  def accept[TResult](onNext: js.Function1[/* value */ T, TResult], onError: Unit, onCompleted: js.Function0[TResult]): TResult = js.native
  
  def equals(other: Notification[T]): Boolean = js.native
  
  var exception: js.Any = js.native
  
  var hasValue: Boolean = js.native
  
  var kind: String = js.native
  
  def toObservable(): Observable[T] = js.native
  def toObservable(scheduler: IScheduler): Observable[T] = js.native
  
  var value: T = js.native
}
