package typings.sipDotJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipDotJs.libCoreLogLoggerMod.Logger
import typings.sipDotJs.libCoreLogMod.LoggerFactory
import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages", JSImport.Namespace)
@js.native
object libCoreMessagesMod extends js.Object {
  @js.native
  class DigestAuthentication protected ()
    extends typings.sipDotJs.libCoreMessagesDigestDashAuthenticationMod.DigestAuthentication {
    def this(loggerFactory: LoggerFactory) = this()
    def this(loggerFactory: LoggerFactory, username: String) = this()
    def this(loggerFactory: LoggerFactory, username: js.UndefOr[scala.Nothing], password: String) = this()
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: LoggerFactory, username: String, password: String) = this()
  }
  
  @js.native
  class IncomingMessage ()
    extends typings.sipDotJs.libCoreMessagesIncomingDashMessageMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  
  @js.native
  class NameAddrHeader protected ()
    extends typings.sipDotJs.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(
      uri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      displayName: String,
      parameters: StringDictionary[String]
    ) = this()
  }
  
  @js.native
  class OutgoingRequestMessage protected ()
    extends typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage {
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends typings.sipDotJs.libCoreMessagesParametersMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class URI protected ()
    extends typings.sipDotJs.libCoreMessagesUriMod.URI {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
  }
  
  def constructOutgoingResponse(
    message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: Anon_Body): Body = js.native
  def getBody(message: Body): js.UndefOr[Body] = js.native
  def getBody(message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(
    message: typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ): js.UndefOr[Body] = js.native
  def getBody(message: typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
  @js.native
  object C extends js.Object {
    val ACK: typings.sipDotJs.sipDotJsStrings.ACK = js.native
    val BYE: typings.sipDotJs.sipDotJsStrings.BYE = js.native
    val CANCEL: typings.sipDotJs.sipDotJsStrings.CANCEL = js.native
    val INFO: typings.sipDotJs.sipDotJsStrings.INFO = js.native
    val INVITE: typings.sipDotJs.sipDotJsStrings.INVITE = js.native
    val MESSAGE: typings.sipDotJs.sipDotJsStrings.MESSAGE = js.native
    val NOTIFY: typings.sipDotJs.sipDotJsStrings.NOTIFY = js.native
    val OPTIONS: typings.sipDotJs.sipDotJsStrings.OPTIONS = js.native
    val PRACK: typings.sipDotJs.sipDotJsStrings.PRACK = js.native
    val PUBLISH: typings.sipDotJs.sipDotJsStrings.PUBLISH = js.native
    val REFER: typings.sipDotJs.sipDotJsStrings.REFER = js.native
    val REGISTER: typings.sipDotJs.sipDotJsStrings.REGISTER = js.native
    val SUBSCRIBE: typings.sipDotJs.sipDotJsStrings.SUBSCRIBE = js.native
    val UPDATE: typings.sipDotJs.sipDotJsStrings.UPDATE = js.native
  }
  
  @js.native
  object Grammar extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: String): js.UndefOr[typings.sipDotJs.libCoreMessagesUriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typings.sipDotJs.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    def parse(input: String, startRule: String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object OutgoingRequestMessage extends js.Object {
    /** Get a copy of the default options. */
    var getDefaultOptions: js.Any = js.native
    var makeNameAddrHeader: js.Any = js.native
  }
  
  @js.native
  object Parser extends js.Object {
    def getHeader(data: js.Any, headerStart: Double): Double = js.native
    def parseHeader(
      message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Anon_Error = js.native
    def parseHeader(
      message: typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Anon_Error = js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[
        typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage | typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
      ] = js.native
  }
  
}

