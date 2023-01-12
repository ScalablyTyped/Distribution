package typings.redisServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-server", JSImport.Namespace)
  @js.native
  /**
    * @param options A number or string that is a port or an object for configuration.
    */
  open class ^ ()
    extends StObject
       with RedisServer {
    def this(options: String) = this()
    def this(options: Double) = this()
    def this(options: RedisServerOptions) = this()
  }
  
  @js.native
  trait RedisServer extends StObject {
    
    /**
      * Close the associated Redis server. Returns a `Promise`.
      *
      * NOTE: Disconnect clients prior to calling this method to avoid receiving connection errors
      * from clients.
      */
    def close(): js.Promise[Unit] = js.native
    def close(callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Determine if the instance is closing a Redis server; `true` while a process is being,
      * or about to be, killed until the contained Redis server either closes or errs.
      */
    var isClosing: Boolean = js.native
    
    /**
      * Determine if the instance is starting a Redis server; `true` while a process is spawning,
      * and/or about to be spawned, until the contained Redis server either starts or errs.
      */
    var isOpening: Boolean = js.native
    
    /**
      * Determine if the instance is running a Redis server; `true` once a process has spawned and
      * the contained Redis server is ready to service requests.
      */
    var isRunning: Boolean = js.native
    
    /** Attempt to open a Redis server. Returns a `Promise`. */
    def open(): js.Promise[Unit] = js.native
    def open(callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  }
  
  trait RedisServerOptions extends StObject {
    
    /**
      * A Redis server binary path.
      */
    var bin: js.UndefOr[String] = js.undefined
    
    /**
      * A Redis server configuration file path.
      */
    var conf: js.UndefOr[String] = js.undefined
    
    /**
      * A port to bind a Redis server to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * An address of a Redis server to sync with.
      */
    var slaveof: js.UndefOr[String] = js.undefined
  }
  object RedisServerOptions {
    
    inline def apply(): RedisServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisServerOptions] (val x: Self) extends AnyVal {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setConf(value: String): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      inline def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSlaveof(value: String): Self = StObject.set(x, "slaveof", value.asInstanceOf[js.Any])
      
      inline def setSlaveofUndefined: Self = StObject.set(x, "slaveof", js.undefined)
    }
  }
}
