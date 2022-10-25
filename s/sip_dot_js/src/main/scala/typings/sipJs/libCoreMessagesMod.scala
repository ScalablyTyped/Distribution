package typings.sipJs

import typings.sipJs.anon.Error
import typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libCoreMessagesBodyMod.Body
import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessageOptions
import typings.sipJs.libCoreMessagesOutgoingResponseMod.OutgoingResponse
import typings.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import typings.sipJs.libGrammarUriMod.URI
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
  
  @JSImport("sip.js/lib/core/messages", "OutgoingRequestMessage")
  @js.native
  open class OutgoingRequestMessage protected ()
    extends typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage {
    def this(method: String, ruri: URI, fromURI: URI, toURI: URI) = this()
    def this(method: String, ruri: URI, fromURI: URI, toURI: URI, options: OutgoingRequestMessageOptions) = this()
    def this(method: String, ruri: URI, fromURI: URI, toURI: URI, options: Unit, extraHeaders: js.Array[String]) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: Unit,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    def this(method: String, ruri: URI, fromURI: URI, toURI: URI, options: Unit, extraHeaders: Unit, body: Body) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
    def this(
      method: String,
      ruri: URI,
      fromURI: URI,
      toURI: URI,
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
  
  inline def constructOutgoingResponse(
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("constructOutgoingResponse")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OutgoingResponse]
  
  inline def fromBodyLegacy(bodyLegacy: String): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
  inline def fromBodyLegacy(bodyLegacy: typings.sipJs.anon.Body): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
  
  inline def getBody(message: Body): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  
  inline def isBody(body: Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBody")(body.asInstanceOf[js.Any]).asInstanceOf[/* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean]
}
