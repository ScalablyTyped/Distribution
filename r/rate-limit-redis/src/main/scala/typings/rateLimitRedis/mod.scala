package typings.rateLimitRedis

import typings.expressRateLimit.mod.IncrementResponse
import typings.expressRateLimit.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rate-limit-redis", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RedisStore {
    /**
    	 * @constructor for `RedisStore`.
    	 *
    	 * @param options {Options} - The configuration options for the store.
    	 */
    def this(options: Options) = this()
    
    /**
    	 * Method to decrement a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    /* CompleteClass */
    override def decrement(key: String): js.Promise[Unit] | Unit = js.native
    
    /**
    	 * Method to increment a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 *
    	 * @returns {IncrementResponse} - The number of hits and reset time for that client.
    	 */
    /* CompleteClass */
    override def increment(key: String): js.Promise[IncrementResponse] | IncrementResponse = js.native
    
    /**
    	 * Method that actually initializes the store.
    	 *
    	 * @param options {RateLimitConfiguration} - The options used to setup the middleware.
    	 */
    /* CompleteClass */
    @JSName("init")
    override def init_MRedisStore(options: typings.expressRateLimit.mod.Options): Unit = js.native
    
    /* CompleteClass */
    override def loadScript(): js.Promise[String] = js.native
    
    /**
    	 * Stores the loaded SHA1 of the LUA script for executing the increment operations.
    	 */
    /* CompleteClass */
    var loadedScriptSha1: js.Promise[String] = js.native
    
    /**
    	 * The text to prepend to the key in Redis.
    	 */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
    	 * Method to prefix the keys with the given text.
    	 *
    	 * @param key {string} - The key.
    	 *
    	 * @returns {string} - The text + the key.
    	 */
    /* CompleteClass */
    override def prefixKey(key: String): String = js.native
    
    /**
    	 * Whether to reset the expiry for a particular key whenever its hit count
    	 * changes.
    	 */
    /* CompleteClass */
    var resetExpiryOnChange: Boolean = js.native
    
    /**
    	 * Method to reset a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    /* CompleteClass */
    override def resetKey(key: String): js.Promise[Unit] | Unit = js.native
    
    /**
    	 * The function used to send raw commands to Redis.
    	 */
    /* CompleteClass */
    override def sendCommand(args: String*): js.Promise[RedisReply | js.Array[RedisReply]] = js.native
    /**
    	 * The function used to send raw commands to Redis.
    	 */
    /* CompleteClass */
    @JSName("sendCommand")
    var sendCommand_Original: SendCommandFn = js.native
    
    /**
    	 * The number of milliseconds to remember that user's requests.
    	 */
    /* CompleteClass */
    var windowMs: Double = js.native
  }
  
  trait Options extends StObject {
    
    /**
    	 * The text to prepend to the key in Redis.
    	 */
    val prefix: js.UndefOr[String] = js.undefined
    
    /**
    	 * Whether to reset the expiry for a particular key whenever its hit count
    	 * changes.
    	 */
    val resetExpiryOnChange: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * The function used to send commands to Redis.
    	 */
    def sendCommand(args: String*): js.Promise[RedisReply | js.Array[RedisReply]]
  }
  object Options {
    
    inline def apply(sendCommand: /* repeated */ String => js.Promise[RedisReply | js.Array[RedisReply]]): Options = {
      val __obj = js.Dynamic.literal(sendCommand = js.Any.fromFunction1(sendCommand))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setResetExpiryOnChange(value: Boolean): Self = StObject.set(x, "resetExpiryOnChange", value.asInstanceOf[js.Any])
      
      inline def setResetExpiryOnChangeUndefined: Self = StObject.set(x, "resetExpiryOnChange", js.undefined)
      
      inline def setSendCommand(value: /* repeated */ String => js.Promise[RedisReply | js.Array[RedisReply]]): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
    }
  }
  
  type RedisReply = Double | String
  
  trait RedisStore
    extends StObject
       with Store {
    
    /**
    	 * Method that actually initializes the store.
    	 *
    	 * @param options {RateLimitConfiguration} - The options used to setup the middleware.
    	 */
    @JSName("init")
    def init_MRedisStore(options: typings.expressRateLimit.mod.Options): Unit
    
    def loadScript(): js.Promise[String]
    
    /**
    	 * Stores the loaded SHA1 of the LUA script for executing the increment operations.
    	 */
    var loadedScriptSha1: js.Promise[String]
    
    /**
    	 * The text to prepend to the key in Redis.
    	 */
    var prefix: String
    
    /**
    	 * Method to prefix the keys with the given text.
    	 *
    	 * @param key {string} - The key.
    	 *
    	 * @returns {string} - The text + the key.
    	 */
    def prefixKey(key: String): String
    
    /**
    	 * Whether to reset the expiry for a particular key whenever its hit count
    	 * changes.
    	 */
    var resetExpiryOnChange: Boolean
    
    /**
    	 * The function used to send raw commands to Redis.
    	 */
    def sendCommand(args: String*): js.Promise[RedisReply | js.Array[RedisReply]]
    /**
    	 * The function used to send raw commands to Redis.
    	 */
    @JSName("sendCommand")
    var sendCommand_Original: SendCommandFn
    
    /**
    	 * The number of milliseconds to remember that user's requests.
    	 */
    var windowMs: Double
  }
  object RedisStore {
    
    inline def apply(
      decrement: String => js.Promise[Unit] | Unit,
      increment: String => js.Promise[IncrementResponse] | IncrementResponse,
      init: typings.expressRateLimit.mod.Options => Unit,
      loadScript: () => js.Promise[String],
      loadedScriptSha1: js.Promise[String],
      prefix: String,
      prefixKey: String => String,
      resetExpiryOnChange: Boolean,
      resetKey: String => js.Promise[Unit] | Unit,
      sendCommand: SendCommandFn,
      windowMs: Double
    ): RedisStore = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), increment = js.Any.fromFunction1(increment), init = js.Any.fromFunction1(init), loadScript = js.Any.fromFunction0(loadScript), loadedScriptSha1 = loadedScriptSha1.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], prefixKey = js.Any.fromFunction1(prefixKey), resetExpiryOnChange = resetExpiryOnChange.asInstanceOf[js.Any], resetKey = js.Any.fromFunction1(resetKey), sendCommand = sendCommand.asInstanceOf[js.Any], windowMs = windowMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisStore] (val x: Self) extends AnyVal {
      
      inline def setInit(value: typings.expressRateLimit.mod.Options => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setLoadScript(value: () => js.Promise[String]): Self = StObject.set(x, "loadScript", js.Any.fromFunction0(value))
      
      inline def setLoadedScriptSha1(value: js.Promise[String]): Self = StObject.set(x, "loadedScriptSha1", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixKey(value: String => String): Self = StObject.set(x, "prefixKey", js.Any.fromFunction1(value))
      
      inline def setResetExpiryOnChange(value: Boolean): Self = StObject.set(x, "resetExpiryOnChange", value.asInstanceOf[js.Any])
      
      inline def setSendCommand(value: SendCommandFn): Self = StObject.set(x, "sendCommand", value.asInstanceOf[js.Any])
      
      inline def setWindowMs(value: Double): Self = StObject.set(x, "windowMs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendCommandFn extends StObject {
    
    def apply(args: String*): js.Promise[RedisReply | js.Array[RedisReply]] = js.native
  }
}
