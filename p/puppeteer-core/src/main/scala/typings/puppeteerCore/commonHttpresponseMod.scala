package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Network.Response
import typings.node.Buffer
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonFrameManagerMod.Frame
import typings.puppeteerCore.commonHttprequestMod.HTTPRequest
import typings.puppeteerCore.commonSecurityDetailsMod.SecurityDetails
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonHttpresponseMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/HTTPResponse", "HTTPResponse")
  @js.native
  class HTTPResponse protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, request: HTTPRequest, responsePayload: Response) = this()
    
    /* private */ var _bodyLoadedPromise: js.Any = js.native
    
    /* private */ var _bodyLoadedPromiseFulfill: js.Any = js.native
    
    /* private */ var _client: js.Any = js.native
    
    /* private */ var _contentPromise: js.Any = js.native
    
    /* private */ var _fromDiskCache: js.Any = js.native
    
    /* private */ var _fromServiceWorker: js.Any = js.native
    
    /* private */ var _headers: js.Any = js.native
    
    /* private */ var _remoteAddress: js.Any = js.native
    
    /* private */ var _request: js.Any = js.native
    
    /**
      * @internal
      */
    def _resolveBody(): Unit = js.native
    def _resolveBody(err: Error): Unit = js.native
    
    /* private */ var _securityDetails: js.Any = js.native
    
    /* private */ var _status: js.Any = js.native
    
    /* private */ var _statusText: js.Any = js.native
    
    /* private */ var _url: js.Any = js.native
    
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
    def json(): js.Promise[js.Any] = js.native
    
    /**
      * @returns True if the response was successful (status in the range 200-299).
      */
    def ok(): Boolean = js.native
    
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
      * @returns  The status text of the response (e.g. usually an "OK" for a
      * success).
      */
    def statusText(): String = js.native
    
    /**
      * @returns Promise which resolves to a text representation of response body.
      */
    def text(): js.Promise[String] = js.native
    
    /**
      * @returns The URL of the response.
      */
    def url(): String = js.native
  }
  
  trait RemoteAddress extends StObject {
    
    var ip: String
    
    var port: Double
  }
  object RemoteAddress {
    
    inline def apply(ip: String, port: Double): RemoteAddress = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteAddress]
    }
    
    extension [Self <: RemoteAddress](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
