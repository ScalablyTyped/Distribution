package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.anon.Error
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libCoreLogMod.LoggerFactory
import typings.sipJs.libCoreMessagesBodyMod.Body
import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessageOptions
import typings.sipJs.libCoreMessagesOutgoingResponseMod.OutgoingResponse
import typings.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMessagesMod {
  
  @JSImport("sip.js/lib/core/messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object C {
    
    @JSImport("sip.js/lib/core/messages", "C.ACK")
    @js.native
    val ACK: /* "ACK" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.BYE")
    @js.native
    val BYE: /* "BYE" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.CANCEL")
    @js.native
    val CANCEL: /* "CANCEL" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.INFO")
    @js.native
    val INFO: /* "INFO" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.INVITE")
    @js.native
    val INVITE: /* "INVITE" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.MESSAGE")
    @js.native
    val MESSAGE: /* "MESSAGE" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.NOTIFY")
    @js.native
    val NOTIFY: /* "NOTIFY" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.OPTIONS")
    @js.native
    val OPTIONS: /* "OPTIONS" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.PRACK")
    @js.native
    val PRACK: /* "PRACK" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.PUBLISH")
    @js.native
    val PUBLISH: /* "PUBLISH" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.REFER")
    @js.native
    val REFER: /* "REFER" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.REGISTER")
    @js.native
    val REGISTER: /* "REGISTER" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.SUBSCRIBE")
    @js.native
    val SUBSCRIBE: /* "SUBSCRIBE" */ String = js.native
    
    @JSImport("sip.js/lib/core/messages", "C.UPDATE")
    @js.native
    val UPDATE: /* "UPDATE" */ String = js.native
  }
  
  @JSImport("sip.js/lib/core/messages", "DigestAuthentication")
  @js.native
  open class DigestAuthentication protected ()
    extends typings.sipJs.libCoreMessagesDigestAuthenticationMod.DigestAuthentication {
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
  }
  
  object Grammar {
    
    @JSImport("sip.js/lib/core/messages", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    inline def URIParse(uri: String): js.UndefOr[typings.sipJs.libGrammarUriMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("URIParse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.libGrammarUriMod.URI]]
    
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    inline def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typings.sipJs.libGrammarNameAddrHeaderMod.NameAddrHeader] = ^.asInstanceOf[js.Dynamic].applyDynamic("nameAddrHeaderParse")(nameAddrHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.libGrammarNameAddrHeaderMod.NameAddrHeader]]
    
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    inline def parse(input: String, startRule: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], startRule.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("sip.js/lib/core/messages", "IncomingMessage")
  @js.native
  open class IncomingMessage ()
    extends typings.sipJs.libCoreMessagesIncomingMessageMod.IncomingMessage
  
  @JSImport("sip.js/lib/core/messages", "IncomingRequestMessage")
  @js.native
  open class IncomingRequestMessage ()
    extends typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
  
  @JSImport("sip.js/lib/core/messages", "IncomingResponseMessage")
  @js.native
  open class IncomingResponseMessage ()
    extends typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
  
  @JSImport("sip.js/lib/core/messages", "NameAddrHeader")
  @js.native
  open class NameAddrHeader protected ()
    extends typings.sipJs.libGrammarMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: typings.sipJs.libGrammarUriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
  }
  
  @JSImport("sip.js/lib/core/messages", "OutgoingRequestMessage")
  @js.native
  open class OutgoingRequestMessage protected ()
    extends typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage {
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: Unit,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: Unit,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: Unit,
      extraHeaders: Unit,
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: typings.sipJs.libGrammarMod.URI,
      fromURI: typings.sipJs.libGrammarMod.URI,
      toURI: typings.sipJs.libGrammarMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: Unit,
      body: Body
    ) = this()
  }
  /* static members */
  object OutgoingRequestMessage {
    
    @JSImport("sip.js/lib/core/messages", "OutgoingRequestMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /** Get a copy of the default options. */
    @JSImport("sip.js/lib/core/messages", "OutgoingRequestMessage.getDefaultOptions")
    @js.native
    def getDefaultOptions: Any = js.native
    inline def getDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages", "OutgoingRequestMessage.makeNameAddrHeader")
    @js.native
    def makeNameAddrHeader: Any = js.native
    inline def makeNameAddrHeader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeNameAddrHeader")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/core/messages", "Parameters")
  @js.native
  open class Parameters protected ()
    extends typings.sipJs.libGrammarMod.Parameters {
    def this(parameters: StringDictionary[js.UndefOr[String | Double | Null]]) = this()
  }
  
  object Parser {
    
    @JSImport("sip.js/lib/core/messages", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getHeader(data: Any, headerStart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeader")(data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def parseHeader(
      message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
      data: Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any], headerEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean | Error]
    inline def parseHeader(
      message: typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage,
      data: Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any], headerEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean | Error]
    
    inline def parseMessage(data: String, logger: Logger): js.UndefOr[
        typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage | typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMessage")(data.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage | typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
      ]]
  }
  
  @JSImport("sip.js/lib/core/messages", "URI")
  @js.native
  open class URI protected ()
    extends typings.sipJs.libGrammarMod.URI {
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
    def this(scheme: Unit, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: Unit, user: String, host: String, port: Double) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
  }
  
  inline def constructOutgoingResponse(
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("constructOutgoingResponse")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OutgoingResponse]
  
  inline def equivalentURI(a: typings.sipJs.libGrammarUriMod.URI, b: typings.sipJs.libGrammarUriMod.URI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalentURI")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromBodyLegacy(bodyLegacy: String): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
  inline def fromBodyLegacy(bodyLegacy: typings.sipJs.anon.Body): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
  
  inline def getBody(message: Body): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  
  inline def isBody(body: Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBody")(body.asInstanceOf[js.Any]).asInstanceOf[/* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean]
}
