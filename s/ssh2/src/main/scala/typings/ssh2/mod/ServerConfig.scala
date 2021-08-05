package typings.ssh2.mod

import typings.node.Buffer
import typings.ssh2Streams.mod.Algorithms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfig extends StObject {
  
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  
  /** A message that is sent to clients once, right before authentication begins. */
  var banner: js.UndefOr[String] = js.undefined
  
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, js.Any]] = js.undefined
  
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var greeting: js.UndefOr[String] = js.undefined
  
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  /** An array of host private keys. */
  var hostKeys: js.Array[Buffer | String | EncryptedPrivateKey]
  
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[String] = js.undefined
  
  /** This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations. */
  var maxPacketSize: js.UndefOr[Double] = js.undefined
}
object ServerConfig {
  
  inline def apply(hostKeys: js.Array[Buffer | String | EncryptedPrivateKey]): ServerConfig = {
    val __obj = js.Dynamic.literal(hostKeys = hostKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  
  extension [Self <: ServerConfig](x: Self) {
    
    inline def setAlgorithms(value: Algorithms): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setDebug(value: /* information */ String => js.Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
    
    inline def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setHostKeys(value: js.Array[Buffer | String | EncryptedPrivateKey]): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
    
    inline def setHostKeysVarargs(value: (Buffer | String | EncryptedPrivateKey)*): Self = StObject.set(x, "hostKeys", js.Array(value :_*))
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    inline def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    inline def setMaxPacketSizeUndefined: Self = StObject.set(x, "maxPacketSize", js.undefined)
  }
}
