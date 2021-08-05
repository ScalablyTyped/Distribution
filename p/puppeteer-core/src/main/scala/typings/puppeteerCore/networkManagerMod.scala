package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Fetch.AuthRequiredEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestPausedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFailedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestServedFromCacheEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.Response
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedEvent
import typings.puppeteerCore.connectionMod.CDPSession
import typings.puppeteerCore.eventEmitterMod.EventEmitter
import typings.puppeteerCore.frameManagerMod.FrameManager
import typings.puppeteerCore.httprequestMod.HTTPRequest
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkManagerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/NetworkManager", "NetworkManager")
  @js.native
  class NetworkManager protected () extends EventEmitter {
    def this(client: CDPSession, ignoreHTTPSErrors: Boolean, frameManager: FrameManager) = this()
    
    var _attemptedAuthentications: Set[String] = js.native
    
    var _client: CDPSession = js.native
    
    var _credentials: js.UndefOr[Credentials] = js.native
    
    var _extraHTTPHeaders: Record[String, String] = js.native
    
    var _frameManager: FrameManager = js.native
    
    def _handleRequestRedirect(request: HTTPRequest, responsePayload: Response): Unit = js.native
    
    var _ignoreHTTPSErrors: Boolean = js.native
    
    var _offline: Boolean = js.native
    
    def _onAuthRequired(event: AuthRequiredEvent): Unit = js.native
    
    def _onLoadingFailed(event: LoadingFailedEvent): Unit = js.native
    
    def _onLoadingFinished(event: LoadingFinishedEvent): Unit = js.native
    
    def _onRequest(event: RequestWillBeSentEvent): Unit = js.native
    def _onRequest(event: RequestWillBeSentEvent, interceptionId: String): Unit = js.native
    
    def _onRequestPaused(event: RequestPausedEvent): Unit = js.native
    
    def _onRequestServedFromCache(event: RequestServedFromCacheEvent): Unit = js.native
    
    def _onRequestWillBeSent(event: RequestWillBeSentEvent): Unit = js.native
    
    def _onResponseReceived(event: ResponseReceivedEvent): Unit = js.native
    
    var _protocolRequestInterceptionEnabled: Boolean = js.native
    
    var _requestIdToInterceptionId: Map[String, String] = js.native
    
    var _requestIdToRequest: Map[String, HTTPRequest] = js.native
    
    var _requestIdToRequestWillBeSentEvent: Map[String, RequestWillBeSentEvent] = js.native
    
    def _updateProtocolCacheDisabled(): js.Promise[Unit] = js.native
    
    def _updateProtocolRequestInterception(): js.Promise[Unit] = js.native
    
    var _userCacheDisabled: Boolean = js.native
    
    var _userRequestInterceptionEnabled: Boolean = js.native
    
    def authenticate(): js.Promise[Unit] = js.native
    def authenticate(credentials: Credentials): js.Promise[Unit] = js.native
    
    def extraHTTPHeaders(): Record[String, String] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def setCacheEnabled(enabled: Boolean): js.Promise[Unit] = js.native
    
    def setExtraHTTPHeaders(extraHTTPHeaders: Record[String, String]): js.Promise[Unit] = js.native
    
    def setOfflineMode(value: Boolean): js.Promise[Unit] = js.native
    
    def setRequestInterception(value: Boolean): js.Promise[Unit] = js.native
    
    def setUserAgent(userAgent: String): js.Promise[Unit] = js.native
  }
  
  object NetworkManagerEmittedEvents {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.Request")
    @js.native
    val Request: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.RequestFailed")
    @js.native
    val RequestFailed: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.RequestFinished")
    @js.native
    val RequestFinished: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.Response")
    @js.native
    val Response: js.Symbol = js.native
  }
  
  trait Credentials extends StObject {
    
    var password: String
    
    var username: String
  }
  object Credentials {
    
    inline def apply(password: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
