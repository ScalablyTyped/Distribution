package typings
package rxDashLiteDashCoincidenceLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def buffer[TBufferClosing](bufferClosingSelector: js.Function0[Observable[TBufferClosing]]): Observable[js.Array[T]] = js.native
  def buffer[TBufferOpening](bufferOpenings: Observable[TBufferOpening]): Observable[js.Array[T]] = js.native
  def buffer[TBufferOpening, TBufferClosing](
    bufferOpenings: Observable[TBufferOpening],
    bufferClosingSelector: js.Function0[Observable[TBufferClosing]]
  ): Observable[js.Array[T]] = js.native
  def groupJoin[TRight, TDurationLeft, TDurationRight, TResult](
    right: Observable[TRight],
    leftDurationSelector: js.Function1[/* leftItem */ T, Observable[TDurationLeft]],
    rightDurationSelector: js.Function1[/* rightItem */ TRight, Observable[TDurationRight]],
    resultSelector: js.Function2[/* leftItem */ T, /* rightItem */ Observable[TRight], TResult]
  ): Observable[TResult] = js.native
  def join[TRight, TDurationLeft, TDurationRight, TResult](
    right: Observable[TRight],
    leftDurationSelector: js.Function1[/* leftItem */ T, Observable[TDurationLeft]],
    rightDurationSelector: js.Function1[/* rightItem */ TRight, Observable[TDurationRight]],
    resultSelector: js.Function2[/* leftItem */ T, /* rightItem */ TRight, TResult]
  ): Observable[TResult] = js.native
  /**
    * Returns a new observable that triggers on the second and subsequent triggerings of the input observable.
    * The Nth triggering of the input observable passes the arguments from the N-1th and Nth triggering as a pair.
    * The argument passed to the N-1th triggering is held in hidden internal state until the Nth triggering occurs.
    * @returns An observable that triggers on successive pairs of observations from the input observable as an array.
    */
  def pairwise(): Observable[js.Array[T]] = js.native
  /**
    * Returns two observables which partition the observations of the source by the given function.
    * The first will trigger observations for those values for which the predicate returns true.
    * The second will trigger observations for those values where the predicate returns false.
    * The predicate is executed once for each subscribed observer.
    * Both also propagate all error observations arising from the source and each completes
    * when the source completes.
    * @param predicate
    *    The function to determine which output Observable will trigger a particular observation.
    * @returns
    *    An array of observables. The first triggers when the predicate returns true,
    *    and the second triggers when the predicate returns false.
    */
  def partition(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): js.Array[Observable[T]] = js.native
  def partition(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): js.Array[Observable[T]] = js.native
  def window[TWindowClosing](windowClosingSelector: js.Function0[Observable[TWindowClosing]]): Observable[Observable[T]] = js.native
  def window[TWindowOpening](windowOpenings: Observable[TWindowOpening]): Observable[Observable[T]] = js.native
  def window[TWindowOpening, TWindowClosing](
    windowOpenings: Observable[TWindowOpening],
    windowClosingSelector: js.Function0[Observable[TWindowClosing]]
  ): Observable[Observable[T]] = js.native
}

