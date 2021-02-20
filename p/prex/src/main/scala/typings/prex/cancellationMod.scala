package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.esfxCancelable.distMod.CancelableSource
import typings.esfxDisposable.distMod.Disposable
import typings.prex.anon.Dispose
import typings.prex.prexStrings.abort
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancellationMod {
  
  @JSImport("prex/out/lib/cancellation", "CancelError")
  @js.native
  class CancelError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("prex/out/lib/cancellation", "CancellationToken")
  @js.native
  class CancellationToken () extends Cancelable {
    
    var _source: js.Any = js.native
    
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
    
    /**
      * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    @JSImport("prex/out/lib/cancellation", "CancellationToken.all")
    @js.native
    def all(tokens: Iterable[CancellationToken | Cancelable]): CancellationToken = js.native
    
    /**
      * A token that is already canceled.
      */
    @JSImport("prex/out/lib/cancellation", "CancellationToken.canceled")
    @js.native
    val canceled: CancellationToken = js.native
    
    @JSImport("prex/out/lib/cancellation", "CancellationToken.from")
    @js.native
    def from(cancelable: Cancelable): CancellationToken = js.native
    @JSImport("prex/out/lib/cancellation", "CancellationToken.from")
    @js.native
    def from(cancelable: AbortSignalLike): CancellationToken = js.native
    /**
      * Adapts a CancellationToken-like primitive from a different library.
      */
    @JSImport("prex/out/lib/cancellation", "CancellationToken.from")
    @js.native
    def from(cancelable: CancellationToken): CancellationToken = js.native
    @JSImport("prex/out/lib/cancellation", "CancellationToken.from")
    @js.native
    def from(cancelable: VSCodeCancellationTokenLike): CancellationToken = js.native
    
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
    @JSImport("prex/out/lib/cancellation", "CancellationToken.race")
    @js.native
    def race(tokens: Iterable[CancellationToken | Cancelable]): CancellationToken = js.native
  }
  
  @JSImport("prex/out/lib/cancellation", "CancellationTokenCountdown")
  @js.native
  class CancellationTokenCountdown () extends StObject {
    def this(iterable: Iterable[CancellationToken | Cancelable]) = this()
    
    var _addedCount: js.Any = js.native
    
    var _canBeSignaled: js.Any = js.native
    
    var _checkSignalState: js.Any = js.native
    
    var _registrations: js.Any = js.native
    
    var _signaledCount: js.Any = js.native
    
    var _source: js.Any = js.native
    
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
  class CancellationTokenSource () extends CancelableSource {
    def this(linkedTokens: Iterable[CancellationToken | Cancelable]) = this()
    
    /**
      * Executes the provided callback.
      *
      * @param callback The callback to execute.
      */
    var _executeCallback: js.Any = js.native
    
    var _linkingRegistrations: js.Any = js.native
    
    var _registrations: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _token: js.Any = js.native
    
    /**
      * Unlinks the source from any linked tokens.
      */
    var _unlink: js.Any = js.native
    
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
  
  @js.native
  trait AbortSignalLike extends StObject {
    
    val aborted: Boolean = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, callback: js.Function0[_]): js.Any = js.native
  }
  object AbortSignalLike {
    
    @scala.inline
    def apply(aborted: Boolean, addEventListener: (abort, js.Function0[_]) => js.Any): AbortSignalLike = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener))
      __obj.asInstanceOf[AbortSignalLike]
    }
    
    @scala.inline
    implicit class AbortSignalLikeMutableBuilder[Self <: AbortSignalLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddEventListener(value: (abort, js.Function0[_]) => js.Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait CancellationTokenRegistration extends Disposable {
    
    /**
      * Unregisters the callback
      */
    def unregister(): Unit = js.native
  }
  
  @js.native
  trait VSCodeCancellationTokenLike extends StObject {
    
    val isCancellationRequested: Boolean = js.native
    
    def onCancellationRequested(listener: js.Function0[_]): Dispose = js.native
  }
  object VSCodeCancellationTokenLike {
    
    @scala.inline
    def apply(isCancellationRequested: Boolean, onCancellationRequested: js.Function0[_] => Dispose): VSCodeCancellationTokenLike = {
      val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any], onCancellationRequested = js.Any.fromFunction1(onCancellationRequested))
      __obj.asInstanceOf[VSCodeCancellationTokenLike]
    }
    
    @scala.inline
    implicit class VSCodeCancellationTokenLikeMutableBuilder[Self <: VSCodeCancellationTokenLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCancellationRequested(value: js.Function0[_] => Dispose): Self = StObject.set(x, "onCancellationRequested", js.Any.fromFunction1(value))
    }
  }
}
