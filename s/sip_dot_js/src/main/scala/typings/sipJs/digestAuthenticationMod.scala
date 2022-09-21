package typings.sipJs

import typings.sipJs.logMod.LoggerFactory
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digestAuthenticationMod {
  
  @JSImport("sip.js/lib/core/messages/digest-authentication", "DigestAuthentication")
  @js.native
  open class DigestAuthentication protected () extends StObject {
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: LoggerFactory) = this()
    def this(loggerFactory: LoggerFactory, ha1: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: Unit, username: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: String, password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: Unit, password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: Unit, username: String, password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: Unit, username: Unit, password: String) = this()
    
    /* private */ var algorithm: Any = js.native
    
    /**
      * Performs Digest authentication given a SIP request and the challenge
      * received in a response to that request.
      * @param request -
      * @param challenge -
      * @returns true if credentials were successfully generated, false otherwise.
      */
    def authenticate(request: OutgoingRequestMessage, challenge: Any): Boolean = js.native
    def authenticate(request: OutgoingRequestMessage, challenge: Any, body: String): Boolean = js.native
    
    /**
      * Generate Digest 'response' value.
      */
    /* private */ var calculateResponse: Any = js.native
    
    /* private */ var cnonce: Any = js.native
    
    /* private */ var ha1: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var method: Any = js.native
    
    /* private */ var nc: Any = js.native
    
    /* private */ var ncHex: Any = js.native
    
    /* private */ var nonce: Any = js.native
    
    /* private */ var opaque: Any = js.native
    
    /* private */ var password: Any = js.native
    
    /* private */ var qop: Any = js.native
    
    /* private */ var realm: Any = js.native
    
    /* private */ var response: Any = js.native
    
    var stale: js.UndefOr[Boolean] = js.native
    
    /**
      * Generate the 'nc' value as required by Digest in this.ncHex by reading this.nc.
      */
    /* private */ var updateNcHex: Any = js.native
    
    /* private */ var uri: Any = js.native
    
    /* private */ var username: Any = js.native
  }
}
