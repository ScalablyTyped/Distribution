package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.ConnectableObservable
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/publishReplay", JSImport.Namespace)
@js.native
object operatorPublishReplayMod extends js.Object {
  def publishReplay[T](`this`: Observable[T]): ConnectableObservable[T] = js.native
  def publishReplay[T](`this`: Observable[T], bufferSize: Double): ConnectableObservable[T] = js.native
  def publishReplay[T](`this`: Observable[T], bufferSize: Double, windowTime: Double): ConnectableObservable[T] = js.native
  def publishReplay[T](`this`: Observable[T], bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T] = js.native
  def publishReplay[T](
    `this`: Observable[T],
    bufferSize: Double,
    windowTime: Double,
    selector: MonoTypeOperatorFunction[T]
  ): Observable[T] = js.native
  def publishReplay[T](
    `this`: Observable[T],
    bufferSize: Double,
    windowTime: Double,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_TR[T, R](`this`: Observable[T], bufferSize: Double, windowTime: Double, selector: OperatorFunction[T, R]): Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_TR_Observable[T, R](`this`: Observable[T]): Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_TR_Observable[T, R](`this`: Observable[T], bufferSize: Double): Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_TR_Observable[T, R](`this`: Observable[T], bufferSize: Double, windowTime: Double): Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_T_Observable[T](`this`: Observable[T]): Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_T_Observable[T](`this`: Observable[T], bufferSize: Double): Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_T_Observable[T](`this`: Observable[T], bufferSize: Double, windowTime: Double): Observable[T] = js.native
}

