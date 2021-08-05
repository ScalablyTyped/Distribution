package typings.sipJs

import typings.sipJs.logMod.LoggerFactory
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digestAuthenticationMod {
  
  @JSImport("sip.js/lib/core/messages/digest-authentication", "DigestAuthentication")
  @js.native
  class DigestAuthentication protected () extends StObject {
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
    
    /* private */ var algorithm: js.Any = js.native
    
    /**
      * Performs Digest authentication given a SIP request and the challenge
      * received in a response to that request.
      * @param request -
      * @param challenge -
      * @returns true if credentials were successfully generated, false otherwise.
      */
    def authenticate(request: OutgoingRequestMessage, challenge: js.Any): Boolean = js.native
    def authenticate(request: OutgoingRequestMessage, challenge: js.Any, body: String): Boolean = js.native
    
    /**
      * Generate Digest 'response' value.
      */
    /* private */ var calculateResponse: js.Any = js.native
    
    /* private */ var cnonce: js.Any = js.native
    
    /* private */ var ha1: js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
    /* private */ var method: js.Any = js.native
    
    /* private */ var nc: js.Any = js.native
    
    /* private */ var ncHex: js.Any = js.native
    
    /* private */ var nonce: js.Any = js.native
    
    /* private */ var opaque: js.Any = js.native
    
    /* private */ var password: js.Any = js.native
    
    /* private */ var qop: js.Any = js.native
    
    /* private */ var realm: js.Any = js.native
    
    /* private */ var response: js.Any = js.native
    
    var stale: js.UndefOr[Boolean] = js.native
    
    /**
      * Generate the 'nc' value as required by Digest in this.ncHex by reading this.nc.
      */
    /* private */ var updateNcHex: js.Any = js.native
    
    /* private */ var uri: js.Any = js.native
    
    /* private */ var username: js.Any = js.native
  }
}
