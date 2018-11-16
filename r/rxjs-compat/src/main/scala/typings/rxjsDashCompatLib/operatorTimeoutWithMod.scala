package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/timeoutWith", JSImport.Namespace)
@js.native
object operatorTimeoutWithMod extends js.Object {
  def timeoutWith[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: scala.Double,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[T]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def timeoutWith[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: scala.Double,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def timeoutWith[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: stdLib.Date,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[T]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def timeoutWith[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: stdLib.Date,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: scala.Double,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[R]
  ): rxjsLib.rxjsMod.Observable[T | R] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: scala.Double,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | R] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: stdLib.Date,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[R]
  ): rxjsLib.rxjsMod.Observable[T | R] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: stdLib.Date,
    withObservable: rxjsLib.internalTypesMod.ObservableInput[R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T | R] = js.native
}

