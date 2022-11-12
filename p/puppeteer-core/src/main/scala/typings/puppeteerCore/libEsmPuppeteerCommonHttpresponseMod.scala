package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Network.ResourceTiming
import typings.devtoolsProtocol.mod.Protocol.Network.Response
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import typings.node.bufferMod.global.Buffer
import typings.puppeteerCore.libEsmPuppeteerCommonEventEmitterMod.EventEmitter
import typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame
import typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest
import typings.puppeteerCore.libEsmPuppeteerCommonSecurityDetailsMod.SecurityDetails
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonHttpresponseMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/HTTPResponse", "HTTPResponse")
  @js.native
  open class HTTPResponse protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, request: HTTPRequest, responsePayload: Response) = this()
    def this(
      client: CDPSession,
      request: HTTPRequest,
      responsePayload: Response,
      extraInfo: ResponseReceivedExtraInfoEvent
    ) = this()
    
    /**
      * @internal
      */
    def _resolveBody(): Unit = js.native
    def _resolveBody(err: js.Error): Unit = js.native
    
    /**
      * @returns Promise which resolves to a buffer with response body.
      */
    def buffer(): js.Promise[Buffer] = js.native
    
    /**
      * @returns A {@link Frame} that initiated this response, or `null` if
      * navigating to error pages.
      */
    def frame(): Frame | Null = js.native
    
    /**
      * @returns True if the response was served from either the browser's disk
      * cache or memory cache.
      */
    def fromCache(): Boolean = js.native
    
    /**
      * @returns True if the response was served by a service worker.
      */
    def fromServiceWorker(): Boolean = js.native
    
    /**
      * @returns An object with HTTP headers associated with the response. All
      * header names are lower-case.
      */
    def headers(): Record[String, String] = js.native
    
    /**
      *
      * @returns Promise which resolves to a JSON representation of response body.
      *
      * @remarks
      *
      * This method will throw if the response body is not parsable via
      * `JSON.parse`.
      */
    def json(): js.Promise[Any] = js.native
    
    /**
      * @returns True if the response was successful (status in the range 200-299).
      */
    def ok(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @returns The IP address and port number used to connect to the remote
      * server.
      */
    def remoteAddress(): RemoteAddress = js.native
    
    /**
      * @returns A matching {@link HTTPRequest} object.
      */
    def request(): HTTPRequest = js.native
    
    /**
      * @returns {@link SecurityDetails} if the response was received over the
      * secure connection, or `null` otherwise.
      */
    def securityDetails(): SecurityDetails | Null = js.native
    
    /**
      * @returns The status code of the response (e.g., 200 for a success).
      */
    def status(): Double = js.native
    
    /**
      * @returns The status text of the response (e.g. usually an "OK" for a
      * success).
      */
    def statusText(): String = js.native
    
    /**
      * @returns Promise which resolves to a text representation of response body.
      */
    def text(): js.Promise[String] = js.native
    
    /**
      * @returns Timing information related to the response.
      */
    def timing(): ResourceTiming | Null = js.native
    
    /**
      * @returns The URL of the response.
      */
    def url(): String = js.native
  }
  
  @js.native
  trait CDPSession extends EventEmitter {
    
    @JSName("send")
    def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 541, starting with typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotclearMessages, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotdisable, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotenable */ Any */](
      method: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
      ] = js.native
  }
  
  trait RemoteAddress extends StObject {
    
    var ip: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object RemoteAddress {
    
    inline def apply(): RemoteAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteAddress]
    }
    
    extension [Self <: RemoteAddress](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
