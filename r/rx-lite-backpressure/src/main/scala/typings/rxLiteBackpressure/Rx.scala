package typings.rxLiteBackpressure

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  @js.native
  trait ControlledObservable[T] extends Observable[T] {
    
    def request(): IDisposable = js.native
    def request(numberOfItems: Double): IDisposable = js.native
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    /**
      * Attaches a controller to the observable sequence with the ability to queue.
      * @example
      * var source = Rx.Observable.interval(100).controlled();
      * source.request(3); // Reads 3 values
      */
    def controlled(): ControlledObservable[T] = js.native
    def controlled(enableQueue: Boolean): ControlledObservable[T] = js.native
    
    /**
      * Pauses the underlying observable sequence based upon the observable sequence which yields true/false.
      * @example
      * var pauser = new Rx.Subject();
      * var source = Rx.Observable.interval(100).pausable(pauser);
      * @param pauser The observable sequence used to pause the underlying sequence.
      * @returns The observable sequence which is paused based upon the pauser.
      */
    def pausable(): PausableObservable[T] = js.native
    def pausable(pauser: Observable[Boolean]): PausableObservable[T] = js.native
    
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
    def pausableBuffered(pauser: Observable[Boolean]): PausableObservable[T] = js.native
  }
  
  @js.native
  trait PausableObservable[T] extends Observable[T] {
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
}
