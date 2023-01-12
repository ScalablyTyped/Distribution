package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.esfxCancelable.mod.CancelableSource
import typings.esfxDisposable.distTypesDisposableMod.Disposable
import typings.prex.anon.Dispose
import typings.prex.prexStrings.abort
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLibCancellationMod {
  
  @JSImport("prex/out/lib/cancellation", "CancelError")
  @js.native
  open class CancelError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("prex/out/lib/cancellation", "CancellationToken")
  @js.native
  open class CancellationToken ()
    extends StObject
       with Cancelable {
    
    /* private */ var _source: Any = js.native
    
    /**
      * Gets a value indicating whether the underlying source can be canceled.
      */
    def canBeCanceled: Boolean = js.native
    
    /**
      * Gets a value indicating whether cancellation has been requested.
      */
    def cancellationRequested: Boolean = js.native
    
    /**
      * Registers a callback to execute when cancellation is requested.
      *
      * @param callback The callback to register.
      */
    def register(callback: js.Function0[Unit]): CancellationTokenRegistration = js.native
    
    /**
      * Throws a CancelError if cancellation has been requested.
      */
    def throwIfCancellationRequested(): Unit = js.native
  }
  /* static members */
  object CancellationToken {
    
    @JSImport("prex/out/lib/cancellation", "CancellationToken")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    inline def all(tokens: js.Iterable[CancellationToken | Cancelable]): CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(tokens.asInstanceOf[js.Any]).asInstanceOf[CancellationToken]
    
    /**
      * A token that is already canceled.
      */
    @JSImport("prex/out/lib/cancellation", "CancellationToken.canceled")
    @js.native
    val canceled: CancellationToken = js.native
    
    inline def from(cancelable: Cancelable): CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancellationToken]
    inline def from(cancelable: AbortSignalLike): CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancellationToken]
    /**
      * Adapts a CancellationToken-like primitive from a different library.
      */
    inline def from(cancelable: CancellationToken): CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancellationToken]
    inline def from(cancelable: VSCodeCancellationTokenLike): CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancellationToken]
    
    /**
      * A token which will never be canceled.
      */
    @JSImport("prex/out/lib/cancellation", "CancellationToken.none")
    @js.native
    val none: CancellationToken = js.native
    
    /**
      * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    inline def race(tokens: js.Iterable[CancellationToken | Cancelable]): CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(tokens.asInstanceOf[js.Any]).asInstanceOf[CancellationToken]
  }
  
  @JSImport("prex/out/lib/cancellation", "CancellationTokenCountdown")
  @js.native
  open class CancellationTokenCountdown () extends StObject {
    def this(iterable: js.Iterable[CancellationToken | Cancelable]) = this()
    
    /* private */ var _addedCount: Any = js.native
    
    /* private */ var _canBeSignaled: Any = js.native
    
    /* private */ var _checkSignalState: Any = js.native
    
    /* private */ var _registrations: Any = js.native
    
    /* private */ var _signaledCount: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    def add(token: Cancelable): this.type = js.native
    /**
      * Adds a CancellationToken to the countdown.
      */
    def add(token: CancellationToken): this.type = js.native
    
    /**
      * Gets the number of tokens added to the countdown.
      */
    def addedCount: Double = js.native
    
    /**
      * Gets the number of tokens that have not yet been canceled.
      */
    def remainingCount: Double = js.native
    
    /**
      * Gets the CancellationToken for the countdown.
      */
    def token: CancellationToken = js.native
  }
  
  @JSImport("prex/out/lib/cancellation", "CancellationTokenSource")
  @js.native
  /**
    * Initializes a new instance of a CancellationTokenSource.
    *
    * @param linkedTokens An optional iterable of tokens to which to link this source.
    */
  open class CancellationTokenSource ()
    extends StObject
       with CancelableSource {
    def this(linkedTokens: js.Iterable[CancellationToken | Cancelable]) = this()
    
    /**
      * Executes the provided callback.
      *
      * @param callback The callback to execute.
      */
    /* private */ var _executeCallback: Any = js.native
    
    /* private */ var _linkingRegistrations: Any = js.native
    
    /* private */ var _registrations: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _token: Any = js.native
    
    /**
      * Unlinks the source from any linked tokens.
      */
    /* private */ var _unlink: Any = js.native
    
    /**
      * Cancels the source, evaluating any registered callbacks. If any callback raises an exception,
      * the exception is propagated to a host specific unhanedle exception mechanism.
      */
    def cancel(): Unit = js.native
    
    /**
      * Closes the source, preventing the possibility of future cancellation.
      */
    def close(): Unit = js.native
    
    /**
      * Gets a CancellationToken linked to this source.
      */
    def token: CancellationToken = js.native
  }
  
  trait AbortSignalLike extends StObject {
    
    val aborted: Boolean
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, callback: js.Function0[Any]): Any
  }
  object AbortSignalLike {
    
    inline def apply(aborted: Boolean, addEventListener: (abort, js.Function0[Any]) => Any): AbortSignalLike = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener))
      __obj.asInstanceOf[AbortSignalLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortSignalLike] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(value: (abort, js.Function0[Any]) => Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait CancellationTokenRegistration extends Disposable {
    
    /**
      * Unregisters the callback
      */
    def unregister(): Unit = js.native
  }
  
  trait VSCodeCancellationTokenLike extends StObject {
    
    val isCancellationRequested: Boolean
    
    def onCancellationRequested(listener: js.Function0[Any]): Dispose
  }
  object VSCodeCancellationTokenLike {
    
    inline def apply(isCancellationRequested: Boolean, onCancellationRequested: js.Function0[Any] => Dispose): VSCodeCancellationTokenLike = {
      val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any], onCancellationRequested = js.Any.fromFunction1(onCancellationRequested))
      __obj.asInstanceOf[VSCodeCancellationTokenLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSCodeCancellationTokenLike] (val x: Self) extends AnyVal {
      
      inline def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
      
      inline def setOnCancellationRequested(value: js.Function0[Any] => Dispose): Self = StObject.set(x, "onCancellationRequested", js.Any.fromFunction1(value))
    }
  }
}
