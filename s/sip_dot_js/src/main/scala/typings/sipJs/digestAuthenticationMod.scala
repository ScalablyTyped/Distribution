package typings.sipJs

import typings.sipJs.logMod.LoggerFactory
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/digest-authentication", JSImport.Namespace)
@js.native
object digestAuthenticationMod extends js.Object {
  @js.native
  class DigestAuthentication protected () extends js.Object {
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: LoggerFactory) = this()
    def this(loggerFactory: LoggerFactory, ha1: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: js.UndefOr[scala.Nothing], username: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: String) = this()
    def this(
      loggerFactory: LoggerFactory,
      ha1: js.UndefOr[scala.Nothing],
      username: js.UndefOr[scala.Nothing],
      password: String
    ) = this()
    def this(loggerFactory: LoggerFactory, ha1: js.UndefOr[scala.Nothing], username: String, password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: js.UndefOr[scala.Nothing], password: String) = this()
    def this(loggerFactory: LoggerFactory, ha1: String, username: String, password: String) = this()
    var algorithm: js.Any = js.native
    /**
      * Generate Digest 'response' value.
      */
    var calculateResponse: js.Any = js.native
    var cnonce: js.Any = js.native
    var ha1: js.Any = js.native
    var logger: js.Any = js.native
    var method: js.Any = js.native
    var nc: js.Any = js.native
    var ncHex: js.Any = js.native
    var nonce: js.Any = js.native
    var opaque: js.Any = js.native
    var password: js.Any = js.native
    var qop: js.Any = js.native
    var realm: js.Any = js.native
    var response: js.Any = js.native
    var stale: js.UndefOr[Boolean] = js.native
    /**
      * Generate the 'nc' value as required by Digest in this.ncHex by reading this.nc.
      */
    var updateNcHex: js.Any = js.native
    var uri: js.Any = js.native
    var username: js.Any = js.native
    /**
      * Performs Digest authentication given a SIP request and the challenge
      * received in a response to that request.
      * @param request -
      * @param challenge -
      * @returns true if credentials were successfully generated, false otherwise.
      */
    def authenticate(request: OutgoingRequestMessage, challenge: js.Any): Boolean = js.native
    def authenticate(request: OutgoingRequestMessage, challenge: js.Any, body: String): Boolean = js.native
  }
  
}

