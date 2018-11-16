package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/publishReplay", JSImport.Namespace)
@js.native
object operatorPublishReplayMod extends js.Object {
  def publishReplay[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  def publishReplay[T](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  def publishReplay[T](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double, windowTime: scala.Double): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  def publishReplay[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    bufferSize: scala.Double,
    windowTime: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  def publishReplay[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    bufferSize: scala.Double,
    windowTime: scala.Double,
    selector: rxjsLib.internalTypesMod.MonoTypeOperatorFunction[T]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def publishReplay[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    bufferSize: scala.Double,
    windowTime: scala.Double,
    selector: rxjsLib.internalTypesMod.MonoTypeOperatorFunction[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_TObservable[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_TObservable[T](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_TObservable[T](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double, windowTime: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("publishReplay")
  def publishReplay_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    bufferSize: scala.Double,
    windowTime: scala.Double,
    selector: rxjsLib.internalTypesMod.OperatorFunction[T, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_TRObservable[T, R](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_TRObservable[T, R](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("publishReplay")
  def publishReplay_TRObservable[T, R](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double, windowTime: scala.Double): rxjsLib.rxjsMod.Observable[R] = js.native
}

