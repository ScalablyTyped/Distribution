package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.ConnectableObservable
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisBufferSizeWindowTimeSelectorScheduler extends StObject {
  
  def apply[T](): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Double): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double, selector: Unit, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double, selector: MonoTypeOperatorFunction[T]): Observable_[T] = js.native
  def apply[T](
    bufferSize: Double,
    windowTime: Double,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Unit, selector: MonoTypeOperatorFunction[T]): Observable_[T] = js.native
  def apply[T](
    bufferSize: Double,
    windowTime: Unit,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Double): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Double, selector: Unit, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Double, selector: MonoTypeOperatorFunction[T]): Observable_[T] = js.native
  def apply[T](
    bufferSize: Unit,
    windowTime: Double,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): ConnectableObservable[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Unit, selector: MonoTypeOperatorFunction[T]): Observable_[T] = js.native
  def apply[T](
    bufferSize: Unit,
    windowTime: Unit,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = js.native
}
