package typings
package rxDashLiteDashBackpressureLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  /**
           * Attaches a controller to the observable sequence with the ability to queue.
           * @example
           * var source = Rx.Observable.interval(100).controlled();
           * source.request(3); // Reads 3 values
           */
  def controlled(): ControlledObservable[T] = js.native
  /**
           * Attaches a controller to the observable sequence with the ability to queue.
           * @example
           * var source = Rx.Observable.interval(100).controlled();
           * source.request(3); // Reads 3 values
           */
  def controlled(enableQueue: scala.Boolean): ControlledObservable[T] = js.native
  /**
           * Pauses the underlying observable sequence based upon the observable sequence which yields true/false.
           * @example
           * var pauser = new Rx.Subject();
           * var source = Rx.Observable.interval(100).pausable(pauser);
           * @param pauser The observable sequence used to pause the underlying sequence.
           * @returns The observable sequence which is paused based upon the pauser.
           */
  def pausable(): PausableObservable[T] = js.native
  /**
           * Pauses the underlying observable sequence based upon the observable sequence which yields true/false.
           * @example
           * var pauser = new Rx.Subject();
           * var source = Rx.Observable.interval(100).pausable(pauser);
           * @param pauser The observable sequence used to pause the underlying sequence.
           * @returns The observable sequence which is paused based upon the pauser.
           */
  def pausable(pauser: Observable[scala.Boolean]): PausableObservable[T] = js.native
  /**
           * Pauses the underlying observable sequence based upon the observable sequence which yields true/false,
           * and yields the values that were buffered while paused.
           * @example
           * var pauser = new Rx.Subject();
           * var source = Rx.Observable.interval(100).pausableBuffered(pauser);
           * @param pauser The observable sequence used to pause the underlying sequence.
           * @returns The observable sequence which is paused based upon the pauser.
           */
  def pausableBuffered(): PausableObservable[T] = js.native
  /**
           * Pauses the underlying observable sequence based upon the observable sequence which yields true/false,
           * and yields the values that were buffered while paused.
           * @example
           * var pauser = new Rx.Subject();
           * var source = Rx.Observable.interval(100).pausableBuffered(pauser);
           * @param pauser The observable sequence used to pause the underlying sequence.
           * @returns The observable sequence which is paused based upon the pauser.
           */
  def pausableBuffered(pauser: Observable[scala.Boolean]): PausableObservable[T] = js.native
}

