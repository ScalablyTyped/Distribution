package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.AbortSignalLike
import typings.prex.cancellationMod.VSCodeCancellationTokenLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prex", "AsyncBoundedQueue")
  @js.native
  /**
    * Initializes a new instance of the AsyncProducerConsumerQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncBoundedQueue[T] ()
    extends typings.prex.boundedQueueMod.AsyncBoundedQueue[T] {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
  }
  
  @JSImport("prex", "AsyncQueue")
  @js.native
  /**
    * Initializes a new instance of the AsyncQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncQueue[T] ()
    extends typings.prex.queueMod.AsyncQueue[T] {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
  }
  
  @JSImport("prex", "AsyncStack")
  @js.native
  /**
    * Initializes a new instance of the AsyncStack class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncStack[T] ()
    extends typings.prex.stackMod.AsyncStack[T] {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
  }
  
  @JSImport("prex", "AutoResetEvent")
  @js.native
  /**
    * Initializes a new instance of the AutoResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class AutoResetEvent ()
    extends typings.prex.autoreseteventMod.AutoResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @JSImport("prex", "Barrier")
  @js.native
  class Barrier protected ()
    extends typings.prex.barrierMod.Barrier {
    /**
      * Initializes a new instance of the Barrier class.
      *
      * @param participantCount The initial number of participants for the barrier.
      * @param postPhaseAction An action to execute between each phase.
      */
    def this(participantCount: Double) = this()
    def this(
      participantCount: Double,
      postPhaseAction: js.Function1[/* barrier */ typings.prex.barrierMod.Barrier, Unit | js.Thenable[Unit]]
    ) = this()
  }
  
  @JSImport("prex", "CancelError")
  @js.native
  class CancelError ()
    extends typings.prex.cancellationMod.CancelError {
    def this(message: String) = this()
  }
  
  @JSImport("prex", "CancellationToken")
  @js.native
  class CancellationToken ()
    extends typings.prex.cancellationMod.CancellationToken
  /* static members */
  object CancellationToken {
    
    @JSImport("prex", "CancellationToken")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    @scala.inline
    def all(tokens: Iterable[typings.prex.cancellationMod.CancellationToken | Cancelable]): typings.prex.cancellationMod.CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.prex.cancellationMod.CancellationToken]
    
    /**
      * A token that is already canceled.
      */
    @JSImport("prex", "CancellationToken.canceled")
    @js.native
    val canceled: typings.prex.cancellationMod.CancellationToken = js.native
    
    @scala.inline
    def from(cancelable: Cancelable): typings.prex.cancellationMod.CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.prex.cancellationMod.CancellationToken]
    @scala.inline
    def from(cancelable: AbortSignalLike): typings.prex.cancellationMod.CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.prex.cancellationMod.CancellationToken]
    /**
      * Adapts a CancellationToken-like primitive from a different library.
      */
    @scala.inline
    def from(cancelable: typings.prex.cancellationMod.CancellationToken): typings.prex.cancellationMod.CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.prex.cancellationMod.CancellationToken]
    @scala.inline
    def from(cancelable: VSCodeCancellationTokenLike): typings.prex.cancellationMod.CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.prex.cancellationMod.CancellationToken]
    
    /**
      * A token which will never be canceled.
      */
    @JSImport("prex", "CancellationToken.none")
    @js.native
    val none: typings.prex.cancellationMod.CancellationToken = js.native
    
    /**
      * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    @scala.inline
    def race(tokens: Iterable[typings.prex.cancellationMod.CancellationToken | Cancelable]): typings.prex.cancellationMod.CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.prex.cancellationMod.CancellationToken]
  }
  
  @JSImport("prex", "CancellationTokenCountdown")
  @js.native
  class CancellationTokenCountdown ()
    extends typings.prex.cancellationMod.CancellationTokenCountdown {
    def this(iterable: Iterable[typings.prex.cancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @JSImport("prex", "CancellationTokenSource")
  @js.native
  /**
    * Initializes a new instance of a CancellationTokenSource.
    *
    * @param linkedTokens An optional iterable of tokens to which to link this source.
    */
  class CancellationTokenSource ()
    extends typings.prex.cancellationMod.CancellationTokenSource {
    def this(linkedTokens: Iterable[typings.prex.cancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @JSImport("prex", "CountdownEvent")
  @js.native
  class CountdownEvent protected ()
    extends typings.prex.countdownMod.CountdownEvent {
    /**
      * Initializes a new instance of the CountdownEvent class.
      *
      * @param initialCount The initial participant count.
      */
    def this(initialCount: Double) = this()
  }
  
  @JSImport("prex", "Deferred")
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  class Deferred[T] ()
    extends typings.prex.deferredMod.Deferred[T]
  
  @JSImport("prex", "ManualResetEvent")
  @js.native
  /**
    * Initializes a new instance of the ManualResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class ManualResetEvent ()
    extends typings.prex.manualreseteventMod.ManualResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @JSImport("prex", "Pulsar")
  @js.native
  class Pulsar ()
    extends typings.prex.pulsarMod.Pulsar
  
  @JSImport("prex", "ReaderWriterLock")
  @js.native
  class ReaderWriterLock ()
    extends typings.prex.readerwriterlockMod.ReaderWriterLock
  
  @JSImport("prex", "Semaphore")
  @js.native
  class Semaphore protected ()
    extends typings.prex.semaphoreMod.Semaphore {
    /**
      * Initializes a new instance of the Semaphore class.
      *
      * @param initialCount The initial number of entries.
      * @param maxCount The maximum number of entries.
      */
    def this(initialCount: Double) = this()
    def this(initialCount: Double, maxCount: Double) = this()
  }
  
  @scala.inline
  def delay(msec: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def delay(token: typings.prex.cancellationMod.CancellationToken, msec: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def delay[T](msec: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def delay[T](token: typings.prex.cancellationMod.CancellationToken, msec: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def delay[T](token: typings.prex.cancellationMod.CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(token.asInstanceOf[js.Any], msec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
