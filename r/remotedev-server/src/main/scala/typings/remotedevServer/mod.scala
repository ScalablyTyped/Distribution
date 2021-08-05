package typings.remotedevServer

import typings.remotedevServer.remotedevServerBooleans.`true`
import typings.remotedevServer.remotedevServerStrings.http
import typings.remotedevServer.remotedevServerStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(argv: Options): js.Promise[typings.socketcluster.mod.^ | PortUsedError] = ^.asInstanceOf[js.Dynamic].apply(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.socketcluster.mod.^ | PortUsedError]]
  
  @JSImport("remotedev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("remotedev-server", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 1 */ val ERROR: typings.remotedevServer.mod.LogLevel.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 3 */ val INFO: typings.remotedevServer.mod.LogLevel.INFO & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with LogLevel
    /* 0 */ val NONE: typings.remotedevServer.mod.LogLevel.NONE & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 2 */ val WARN: typings.remotedevServer.mod.LogLevel.WARN & Double = js.native
  }
  
  trait Options extends StObject {
    
    /** The cert file for running a HTTPS server (`protocol` must be set to "https"). */
    var cert: js.UndefOr[String] = js.undefined
    
    /** Database configuration, can be an object or a path to a JSON configuration file. */
    var dbOptions: js.UndefOr[String] = js.undefined
    
    /** Hostname. */
    var hostname: js.UndefOr[String] = js.undefined
    
    /** The key file for running a HTTPS server (`protocol` must be set to "https"). */
    var key: js.UndefOr[String] = js.undefined
    
    var logHTTPRequests: js.UndefOr[Boolean] = js.undefined
    
    /** The socket server log level. */
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    /** The key passphrase for running a HTTPS server (`protocol` must be set to "https"). */
    var passphrase: js.UndefOr[String] = js.undefined
    
    /** Port. */
    var port: js.UndefOr[Double] = js.undefined
    
    /** Protocol. */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /** The socket server websocket engine. */
    var wsEngine: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setDbOptions(value: String): Self = StObject.set(x, "dbOptions", value.asInstanceOf[js.Any])
      
      inline def setDbOptionsUndefined: Self = StObject.set(x, "dbOptions", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogHTTPRequests(value: Boolean): Self = StObject.set(x, "logHTTPRequests", value.asInstanceOf[js.Any])
      
      inline def setLogHTTPRequestsUndefined: Self = StObject.set(x, "logHTTPRequests", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setWsEngine(value: String): Self = StObject.set(x, "wsEngine", value.asInstanceOf[js.Any])
      
      inline def setWsEngineUndefined: Self = StObject.set(x, "wsEngine", js.undefined)
    }
  }
  
  trait PortUsedError extends StObject {
    
    def on(status: String, cb: js.Function0[Unit]): Unit
    
    var portAlreadyUsed: `true`
  }
  object PortUsedError {
    
    inline def apply(on: (String, js.Function0[Unit]) => Unit): PortUsedError = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), portAlreadyUsed = true)
      __obj.asInstanceOf[PortUsedError]
    }
    
    extension [Self <: PortUsedError](x: Self) {
      
      inline def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setPortAlreadyUsed(value: `true`): Self = StObject.set(x, "portAlreadyUsed", value.asInstanceOf[js.Any])
    }
  }
}
