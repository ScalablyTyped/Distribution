package typings.redlock

import typings.bluebird.mod.Disposer
import typings.node.eventsMod.EventEmitter
import typings.redlock.redlockStrings.clientError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Inherit all the EventEmitter methods, like `on`, and `off`.
    */
  @JSImport("redlock", JSImport.Namespace)
  @js.native
  class ^ protected () extends Redlock {
    /**
      * A redlock object is instantiated with an array of at least one redis client and an optional
      * `options` object. Properties of the Redlock object should NOT be changed after it is first
      * used, as doing so could have unintended consequences for live locks.
      *
      * @param clients - you should have one client for each independent redis node
      * @param options - optionally customize settings (advanced use only)
      */
    def this(clients: js.Array[CompatibleRedisClient]) = this()
    def this(clients: js.Array[CompatibleRedisClient], options: Options) = this()
  }
  
  /**
    * An object of this type is returned when a resource is successfully locked.
    * It contains convenience methods `unlock` and `extend` which perform
    * the associated Redlock method on itself.
    */
  @JSImport("redlock", "Lock")
  @js.native
  class Lock protected () extends StObject {
    def this(redlock: Redlock, resource: String, value: String, expiration: Double, attempts: Double) = this()
    def this(redlock: Redlock, resource: String, value: Null, expiration: Double, attempts: Double) = this()
    
    var attempts: Double = js.native
    
    var expiration: Double = js.native
    
    def extend(ttl: Double): typings.bluebird.mod.^[Lock] = js.native
    def extend(ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
    
    var redlock: Redlock = js.native
    
    var resource: String = js.native
    
    def unlock(): typings.bluebird.mod.^[Unit] = js.native
    def unlock(callback: Callback[Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    var value: String | Null = js.native
  }
  
  /**
    * This error is returned when there is an error locking a resource.
    */
  @JSImport("redlock", "LockError")
  @js.native
  class LockError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var attempts: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_LockError: typings.redlock.redlockStrings.LockError = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]
  
  @js.native
  trait CompatibleRedisClient extends StObject {
    
    def eval(args: js.Array[EvalArg]): js.Any = js.native
    def eval(args: js.Array[EvalArg], callback: js.Function2[/* err */ Error | Null, /* res */ js.Any, Unit]): js.Any = js.native
  }
  
  type EvalArg = String | Double
  
  /**
    * Function that returns the LUA script to run on the
    * Redis server to extend the ttl of a locked resource.
    *
    * @param origScript - Redblock's default LUA script to extend a lock's ttl.
    */
  type ExtendScriptFunction = LockScriptFunction
  
  /**
    * Function that returns the LUA script to run on the
    * Redis server to lock a resource.
    *
    * @param origScript - Redblock's default LUA script to lock a resource.
    */
  type LockScriptFunction = js.Function1[/* origScript */ String, String]
  
  trait Options extends StObject {
    
    /**
      * The expected clock drift; for more details
      * see http://redis.io/topics/distlock
      *
      * Default is 0.01
      */
    var driftFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * LUA script to run on the Redis server to extend a lock's ttl.
      * https://redis.io/commands/eval
      *
      * Redlock has a default script.
      * Only override if you know it's necessary to do so.
      */
    var extendScript: js.UndefOr[ExtendScriptFunction | String] = js.undefined
    
    /**
      * LUA script to run on the Redis server to lock a resource.
      * https://redis.io/commands/eval
      *
      * Redlock has a default script.
      * Only override if you know it's necessary to do so.
      */
    var lockScript: js.UndefOr[LockScriptFunction | String] = js.undefined
    
    /**
      * The max number of times Redlock will attempt
      * to lock a resource before erroring.
      *
      * Default is 10
      */
    var retryCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The time in milliseconds between attempts.
      *
      * Default is 200
      */
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The max time in ms randomly added to retries
      * to improve performance under high contention
      * see https://www.awsarchitectureblog.com/2015/03/backoff.html
      *
      * Default is 100
      */
    var retryJitter: js.UndefOr[Double] = js.undefined
    
    /**
      * LUA script to run on the Redis server to unlock a resource.
      * https://redis.io/commands/eval
      *
      * Redlock has a default script.
      * Only override if you know it's necessary to do so.
      */
    var unlockScript: js.UndefOr[UnlockScriptFunction | String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDriftFactor(value: Double): Self = StObject.set(x, "driftFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriftFactorUndefined: Self = StObject.set(x, "driftFactor", js.undefined)
      
      @scala.inline
      def setExtendScript(value: ExtendScriptFunction | String): Self = StObject.set(x, "extendScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendScriptFunction1(value: /* origScript */ String => String): Self = StObject.set(x, "extendScript", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtendScriptUndefined: Self = StObject.set(x, "extendScript", js.undefined)
      
      @scala.inline
      def setLockScript(value: LockScriptFunction | String): Self = StObject.set(x, "lockScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockScriptFunction1(value: /* origScript */ String => String): Self = StObject.set(x, "lockScript", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLockScriptUndefined: Self = StObject.set(x, "lockScript", js.undefined)
      
      @scala.inline
      def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryJitter(value: Double): Self = StObject.set(x, "retryJitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryJitterUndefined: Self = StObject.set(x, "retryJitter", js.undefined)
      
      @scala.inline
      def setUnlockScript(value: UnlockScriptFunction | String): Self = StObject.set(x, "unlockScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlockScriptFunction1(value: /* origScript */ String => String): Self = StObject.set(x, "unlockScript", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnlockScriptUndefined: Self = StObject.set(x, "unlockScript", js.undefined)
    }
  }
  
  /**
    * Inherit all the EventEmitter methods, like `on`, and `off`.
    */
  @js.native
  trait Redlock extends EventEmitter {
    
    /**
      * Attach a reference to Lock, which allows the application to use instanceof to ensure type.
      */
    var Lock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.Lock */ js.Any = js.native
    
    /**
      * Attach a reference to LockError, which allows the application to use instanceof to ensure type.
      */
    var LockError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.LockError */ js.Any = js.native
    
    /**
      * This method locks a resource using the redlock algorithm.
      *
      * ```js
      * redlock.lock(
      *   'some-resource',       // the resource to lock
      *   2000,                  // ttl in ms
      *   function(err, lock) {  // callback function (optional)
      *     ...
      *   }
      * )
      * ```
      *
      * @param resource - one or more resources to lock
      * @param ttl - how long to keep the lock (milliseconds)
      */
    def acquire(resource: String, ttl: Double): typings.bluebird.mod.^[Lock] = js.native
    def acquire(resource: String, ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
    def acquire(resource: js.Array[String], ttl: Double): typings.bluebird.mod.^[Lock] = js.native
    def acquire(resource: js.Array[String], ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
    
    /*
      * Functions inherited from EventEmitter
      * https://nodejs.org/api/events.html#events_class_eventemitter
      */
    /**
      * Subscribe to `clientError` events.
      * Alias for `on(event, listener)` function.
      */
    @JSName("addListener")
    def addListener_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    
    /**
      * This method locks a resource using the redlock algorithm,
      * and returns a bluebird disposer.
      *
      * ```js
      * using(
      *     redlock.disposer(
      *         'some-resource',       // the resource to lock
      *         2000                   // ttl in ms
      *     ),
      *     function(lock) {
      *         ...
      *     }
      * );
      * ```
      *
      * @param resource - one or more resources to lock
      * @param ttl - how long to keep the lock (milliseconds)
      * @param errorHandler -- handle any errors when disposer tries to unlock the resource
      */
    def disposer(resource: String, ttl: Double): Disposer[Lock] = js.native
    def disposer(resource: String, ttl: Double, errorHandler: Callback[Unit]): Disposer[Lock] = js.native
    
    var driftFactor: Double = js.native
    
    /**
      * This method extends a valid lock by the provided `ttl`.
      *
      * @param lock - the lock whose lease to extend
      * @param ttl - the new time to live value (milliseconds) from now
      * @param callback - be notified when lock's lease is extended
      */
    def extend(lock: Lock, ttl: Double): typings.bluebird.mod.^[Lock] = js.native
    def extend(lock: Lock, ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
    
    /**
      * This method locks a resource using the redlock algorithm.
      *
      * ```js
      * redlock.lock(
      *   'some-resource',       // the resource to lock
      *   2000,                  // ttl in ms
      *   function(err, lock) {  // callback function (optional)
      *     ...
      *   }
      * )
      * ```
      *
      * @param resource - one or more resources to lock
      * @param ttl - how long to keep the lock (milliseconds)
      */
    def lock(resource: String, ttl: Double): typings.bluebird.mod.^[Lock] = js.native
    def lock(resource: String, ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
    def lock(resource: js.Array[String], ttl: Double): typings.bluebird.mod.^[Lock] = js.native
    def lock(resource: js.Array[String], ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
    
    /**
      * Subscribe to `clientError` events.
      * Your callback is invoked every time this event is emitted.
      */
    @JSName("on")
    def on_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    
    /**
      * Subscribe to `clientError` events.
      * Your callback is invoked only once for this event.
      */
    @JSName("once")
    def once_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    
    /**
      * This method runs `.quit()` on all client connections.
      */
    def quit(): typings.bluebird.mod.^[Unit] = js.native
    def quit(callback: Callback[Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    /**
      * This method unlocks the provided lock from all servers still persisting it. It will fail
      * with an error if it is unable to release the lock on a quorum of nodes, but will make no
      * attempt to restore the lock on nodes that failed to release. It is safe to re-attempt an
      * unlock or to ignore the error, as the lock will automatically expire after its timeout.
      *
      * @param lock - the lock to release
      * @param callback - be notified once lock has been released by the clients
      */
    def release(lock: Lock): typings.bluebird.mod.^[Unit] = js.native
    def release(lock: Lock, callback: Callback[Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    /**
      * Unsubscribe from the `clientError` event.
      */
    @JSName("removeListener")
    def removeListener_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    
    var retryCount: Double = js.native
    
    var retryDelay: Double = js.native
    
    var retryJitter: Double = js.native
    
    var servers: js.Array[CompatibleRedisClient] = js.native
    
    /**
      * This method unlocks the provided lock from all servers still persisting it. It will fail
      * with an error if it is unable to release the lock on a quorum of nodes, but will make no
      * attempt to restore the lock on nodes that failed to release. It is safe to re-attempt an
      * unlock or to ignore the error, as the lock will automatically expire after its timeout.
      *
      * @param lock - the lock to release
      * @param callback - be notified once lock has been released by the clients
      */
    def unlock(lock: Lock): typings.bluebird.mod.^[Unit] = js.native
    def unlock(lock: Lock, callback: Callback[Unit]): typings.bluebird.mod.^[Unit] = js.native
  }
  
  /**
    * Function that returns the LUA script to run on the
    * Redis server to unlock a resource.
    *
    * @param origScript - Redblock's default LUA script to unlock a resource.
    */
  type UnlockScriptFunction = LockScriptFunction
}
