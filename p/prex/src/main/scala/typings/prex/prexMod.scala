package typings.prex

import typings.atEsfxCancelable.distMod.Cancelable
import typings.prex.outLibCancellationMod.AbortSignalLike
import typings.prex.outLibCancellationMod.VSCodeCancellationTokenLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", JSImport.Namespace)
@js.native
object prexMod extends js.Object {
  @js.native
  /**
    * Initializes a new instance of the AsyncProducerConsumerQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncBoundedQueue[T] ()
    extends typings.prex.outLibBoundedQueueMod.AsyncBoundedQueue[T] {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the AsyncQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncQueue[T] ()
    extends typings.prex.outLibQueueMod.AsyncQueue[T] {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the AsyncStack class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncStack[T] ()
    extends typings.prex.outLibStackMod.AsyncStack[T] {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the AutoResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class AutoResetEvent ()
    extends typings.prex.outLibAutoreseteventMod.AutoResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @js.native
  class Barrier protected ()
    extends typings.prex.outLibBarrierMod.Barrier {
    /**
      * Initializes a new instance of the Barrier class.
      *
      * @param participantCount The initial number of participants for the barrier.
      * @param postPhaseAction An action to execute between each phase.
      */
    def this(participantCount: Double) = this()
    def this(
      participantCount: Double,
      postPhaseAction: js.Function1[/* barrier */ typings.prex.outLibBarrierMod.Barrier, Unit | js.Thenable[Unit]]
    ) = this()
  }
  
  @js.native
  class CancelError ()
    extends typings.prex.outLibCancellationMod.CancelError {
    def this(message: String) = this()
  }
  
  @js.native
  class CancellationToken ()
    extends typings.prex.outLibCancellationMod.CancellationToken
  
  @js.native
  class CancellationTokenCountdown ()
    extends typings.prex.outLibCancellationMod.CancellationTokenCountdown {
    def this(iterable: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of a CancellationTokenSource.
    *
    * @param linkedTokens An optional iterable of tokens to which to link this source.
    */
  class CancellationTokenSource ()
    extends typings.prex.outLibCancellationMod.CancellationTokenSource {
    def this(linkedTokens: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @js.native
  class CountdownEvent protected ()
    extends typings.prex.outLibCountdownMod.CountdownEvent {
    /**
      * Initializes a new instance of the CountdownEvent class.
      *
      * @param initialCount The initial participant count.
      */
    def this(initialCount: Double) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  class Deferred[T] ()
    extends typings.prex.outLibDeferredMod.Deferred[T]
  
  @js.native
  /**
    * Initializes a new instance of the ManualResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class ManualResetEvent ()
    extends typings.prex.outLibManualreseteventMod.ManualResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @js.native
  class Pulsar ()
    extends typings.prex.outLibPulsarMod.Pulsar
  
  @js.native
  class ReaderWriterLock ()
    extends typings.prex.outLibReaderwriterlockMod.ReaderWriterLock
  
  @js.native
  class Semaphore protected ()
    extends typings.prex.outLibSemaphoreMod.Semaphore {
    /**
      * Initializes a new instance of the Semaphore class.
      *
      * @param initialCount The initial number of entries.
      * @param maxCount The maximum number of entries.
      */
    def this(initialCount: Double) = this()
    def this(initialCount: Double, maxCount: Double) = this()
  }
  
  def delay(msec: Double): js.Promise[Unit] = js.native
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = js.native
  def delay(token: typings.prex.outLibCancellationMod.CancellationToken, msec: Double): js.Promise[Unit] = js.native
  def delay[T](msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: typings.prex.outLibCancellationMod.CancellationToken, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: typings.prex.outLibCancellationMod.CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  /* static members */
  @js.native
  object CancellationToken extends js.Object {
    /**
      * A token that is already canceled.
      */
    val canceled: typings.prex.outLibCancellationMod.CancellationToken = js.native
    /**
      * A token which will never be canceled.
      */
    val none: typings.prex.outLibCancellationMod.CancellationToken = js.native
    /**
      * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    def all(tokens: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]): typings.prex.outLibCancellationMod.CancellationToken = js.native
    def from(cancelable: Cancelable): typings.prex.outLibCancellationMod.CancellationToken = js.native
    def from(cancelable: AbortSignalLike): typings.prex.outLibCancellationMod.CancellationToken = js.native
    /**
      * Adapts a CancellationToken-like primitive from a different library.
      */
    def from(cancelable: typings.prex.outLibCancellationMod.CancellationToken): typings.prex.outLibCancellationMod.CancellationToken = js.native
    def from(cancelable: VSCodeCancellationTokenLike): typings.prex.outLibCancellationMod.CancellationToken = js.native
    /**
      * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    def race(tokens: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]): typings.prex.outLibCancellationMod.CancellationToken = js.native
  }
  
}

