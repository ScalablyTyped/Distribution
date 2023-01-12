package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfig extends StObject {
  
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  
  /** A message that is sent to clients once, right before authentication begins. */
  var banner: js.UndefOr[String] = js.undefined
  
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[DebugFunction] = js.undefined
  
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var greeting: js.UndefOr[String] = js.undefined
  
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  /** An array of host private keys. */
  var hostKeys: PrivateKeys
  
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[String] = js.undefined
  
  /** The most allowed failed keep alive attempts before closing a connection */
  var keepaliveCountMax: js.UndefOr[Double] = js.undefined
  
  // in docs but not in code
  /** The keep alive interval for this server */
  var keepaliveInterval: js.UndefOr[Double] = js.undefined
}
object ServerConfig {
  
  inline def apply(hostKeys: PrivateKeys): ServerConfig = {
    val __obj = js.Dynamic.literal(hostKeys = hostKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
    
    inline def setAlgorithms(value: Algorithms): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setDebug(value: /* message */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
    
    inline def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setHostKeys(value: PrivateKeys): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
    
    inline def setHostKeysVarargs(value: (Buffer | ParsedKey | EncryptedPrivateKey | String)*): Self = StObject.set(x, "hostKeys", js.Array(value*))
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    inline def setKeepaliveCountMax(value: Double): Self = StObject.set(x, "keepaliveCountMax", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveCountMaxUndefined: Self = StObject.set(x, "keepaliveCountMax", js.undefined)
    
    inline def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
  }
}
