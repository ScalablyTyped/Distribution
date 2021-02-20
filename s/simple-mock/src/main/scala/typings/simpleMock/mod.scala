package typings.simpleMock

import org.scalablytyped.runtime.Shortcut
import typings.std.ArrayLike
import typings.std.Error
import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("simple-mock", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  @js.native
  trait Action[T] extends StObject {
    
    /**
      * arguments to call back with
      */
    var cbArgs: ArrayLike[_] = js.native
    
    var returnValue: T = js.native
    
    var throwError: Error = js.native
  }
  object Action {
    
    @scala.inline
    def apply[T](cbArgs: ArrayLike[_], returnValue: T, throwError: Error): Action[T] = {
      val __obj = js.Dynamic.literal(cbArgs = cbArgs.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], throwError = throwError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[_], T] (val x: Self with Action[T]) extends AnyVal {
      
      @scala.inline
      def setCbArgs(value: ArrayLike[_]): Self = StObject.set(x, "cbArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValue(value: T): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowError(value: Error): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Calls[T] extends StObject {
    
    /**
      * first argument
      */
    var arg: js.Any = js.native
    
    /**
      * an array of arguments received on the call
      */
    var args: js.Array[_] = js.native
    
    /**
      * the context (this) of the call
      */
    var context: js.Any = js.native
    
    /**
      * autoincrementing number, can be compared to evaluate call order
      */
    var k: Double = js.native
    
    /**
      * the value returned by the wrapped function
      */
    var returned: T = js.native
    
    /**
      * the error thrown by the wrapped function
      */
    var threw: Error = js.native
  }
  object Calls {
    
    @scala.inline
    def apply[T](arg: js.Any, args: js.Array[_], context: js.Any, k: Double, returned: T, threw: Error): Calls[T] = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any], threw = threw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calls[T]]
    }
    
    @scala.inline
    implicit class CallsMutableBuilder[Self <: Calls[_], T] (val x: Self with Calls[T]) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturned(value: T): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrew(value: Error): Self = StObject.set(x, "threw", value.asInstanceOf[js.Any])
    }
  }
  
  type Fn[T] = js.Function1[/* repeated */ js.Any, T]
  
  @js.native
  trait Spy[T] extends StObject {
    
    def apply(args: js.Any*): T = js.native
    
    /**
      * Number of times the function was called.
      */
    var callCount: Double = js.native
    
    var called: Boolean = js.native
    
    var calls: js.Array[Calls[T]] = js.native
    
    var firstCall: Calls[T] = js.native
    
    /**
      * The last call object. (This is often also the first and only call.)
      */
    var lastCall: Calls[T] = js.native
    
    /**
      * Resets all counts and properties to the original state.
      */
    def reset(): Unit = js.native
  }
  
  @js.native
  trait Static extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructorLike] = js.native
    
    /**
      * Returns a stub function that is also a spy.
      */
    def mock(): Stub[_] = js.native
    /**
      * If obj has already has this function, it is wrapped in a spy. The resulting spy can be turned into a stub by further configuration. Restores with all mocks.
      */
    def mock(obj: js.Any, key: String): Stub[_] = js.native
    /**
      * Wraps fn in a spy.
      */
    def mock[T](fn: Fn[T]): Spy[T] = js.native
    /**
      * Wraps fn in a spy and sets this on the obj, restorable with all mocks.
      */
    def mock[T](obj: js.Any, key: String, fn: Fn[T]): Stub[T] = js.native
    /**
      * Sets the value on this object. E.g. mock(config, 'title', 'test') is the same as config.title = 'test', but restorable with all mocks.
      */
    def mock[T](obj: js.Any, key: String, mockValue: T): T = js.native
    @JSName("mock")
    def mock_T[T](): Stub[T] = js.native
    @JSName("mock")
    def mock_T[T](obj: js.Any, key: String): Stub[T] = js.native
    
    /**
      * Restores all current mocks.
      */
    def restore(): Unit = js.native
    /**
      * Use this if you need to restore only a single mock value or function on an object.
      */
    def restore(obj: js.Any, key: String): Unit = js.native
    
    /**
      * Wraps fn in a spy.
      */
    def spy[T](fn: Fn[T]): Spy[T] = js.native
    
    /**
      * Returns a stub function that is also a spy.
      */
    def stub(): Stub[_] = js.native
    @JSName("stub")
    def stub_T[T](): Stub[T] = js.native
  }
  
  @js.native
  trait Stub[T] extends Spy[T] {
    
    /**
      * An array of behaviours.
      * Note: modifying this array directly is not supported, rather use stub.withActions(actions) if you need to add actions.
      */
    var actions: js.Array[Action[T]] = js.native
    
    /**
      * Configures this stub to call this function, returning its return value.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callFn[R](fn: Fn[R]): Stub[R] = js.native
    
    /**
      * Configures this stub to call the original, unstubbed function, returning its return value.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callOriginal(): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callback(args: js.Any*): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callbackArgWith(cbArgumentIndex: Double, args: js.Any*): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callbackAtIndex(cbArgumentIndex: Double, args: js.Any*): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callbackWith(args: js.Any*): Stub[T] = js.native
    
    /**
      * Configures the last configured function or callback to be called in this context, i.e. this will be obj.
      */
    def inThisContext(obj: js.Any): Stub[T] = js.native
    
    /**
      * setting whether the queue of actions for this stub should repeat.
      * @default true
      */
    var loop: Boolean = js.native
    
    /**
      * Configures the stub to disable looping.
      */
    def noLoop(): Stub[T] = js.native
    
    /**
      * Configures the stub to return a Promise (where available) rejecting with this error. Same as stub.returnWith(Promise.reject(val)).
      * You can use a custom Promise-conforming library, i.e. simple.Promise = require('bluebird') or simple.Promise = $q.
      */
    def rejectWith[V](`val`: V): Stub[js.Thenable[V]] = js.native
    
    /**
      * Configures the stub to return a Promise (where available] resolving to this value. Same as stub.returnWith(Promise.resolve(val)).
      * You can use a custom Promise-conforming library, i.e. simple.Promise = require('bluebird') or simple.Promise = $q.
      */
    def resolveWith[V](`val`: V): Stub[js.Thenable[V]] = js.native
    
    /**
      * Configures this stub to return with this value.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def returnWith[R](`val`: R): Stub[R] = js.native
    
    /**
      * Configures this stub to throw this error.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def throwWith(err: Error): Stub[T] = js.native
    
    /**
      * Configures this stub to use the specified array of actions.
      */
    def withActions(): Stub[T] = js.native
    def withActions(actions: js.Array[Action[T]]): Stub[T] = js.native
    
    /**
      * Configures the stub to enable looping.
      */
    def withLoop(): Stub[T] = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
