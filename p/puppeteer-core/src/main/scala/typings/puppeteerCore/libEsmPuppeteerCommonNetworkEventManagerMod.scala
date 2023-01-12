package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestPausedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFailedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonNetworkEventManagerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkEventManager", "NetworkEventManager")
  @js.native
  open class NetworkEventManager () extends StObject {
    
    def forget(networkRequestId: NetworkRequestId): Unit = js.native
    
    def forgetQueuedEventGroup(networkRequestId: NetworkRequestId): Unit = js.native
    
    def forgetRequest(networkRequestId: NetworkRequestId): Unit = js.native
    
    def forgetRequestPaused(networkRequestId: NetworkRequestId): Unit = js.native
    
    def forgetRequestWillBeSent(networkRequestId: NetworkRequestId): Unit = js.native
    
    def getQueuedEventGroup(networkRequestId: NetworkRequestId): js.UndefOr[QueuedEventGroup] = js.native
    
    def getRequest(networkRequestId: NetworkRequestId): js.UndefOr[HTTPRequest] = js.native
    
    def getRequestPaused(networkRequestId: NetworkRequestId): js.UndefOr[RequestPausedEvent] = js.native
    
    def getRequestWillBeSent(networkRequestId: NetworkRequestId): js.UndefOr[RequestWillBeSentEvent] = js.native
    
    def numRequestsInProgress(): Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def queueEventGroup(networkRequestId: NetworkRequestId, event: QueuedEventGroup): Unit = js.native
    
    def queueRedirectInfo(fetchRequestId: FetchRequestId, redirectInfo: RedirectInfo): Unit = js.native
    
    /* private */ var queuedRedirectInfo: Any = js.native
    
    def responseExtraInfo(networkRequestId: NetworkRequestId): js.Array[ResponseReceivedExtraInfoEvent] = js.native
    
    def storeRequest(networkRequestId: NetworkRequestId, request: HTTPRequest): Unit = js.native
    
    def storeRequestPaused(networkRequestId: NetworkRequestId, event: RequestPausedEvent): Unit = js.native
    
    def storeRequestWillBeSent(networkRequestId: NetworkRequestId, event: RequestWillBeSentEvent): Unit = js.native
    
    def takeQueuedRedirectInfo(fetchRequestId: FetchRequestId): js.UndefOr[RedirectInfo] = js.native
  }
  
  type FetchRequestId = String
  
  type NetworkRequestId = String
  
  trait QueuedEventGroup extends StObject {
    
    var loadingFailedEvent: js.UndefOr[LoadingFailedEvent] = js.undefined
    
    var loadingFinishedEvent: js.UndefOr[LoadingFinishedEvent] = js.undefined
    
    var responseReceivedEvent: ResponseReceivedEvent
  }
  object QueuedEventGroup {
    
    inline def apply(responseReceivedEvent: ResponseReceivedEvent): QueuedEventGroup = {
      val __obj = js.Dynamic.literal(responseReceivedEvent = responseReceivedEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuedEventGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueuedEventGroup] (val x: Self) extends AnyVal {
      
      inline def setLoadingFailedEvent(value: LoadingFailedEvent): Self = StObject.set(x, "loadingFailedEvent", value.asInstanceOf[js.Any])
      
      inline def setLoadingFailedEventUndefined: Self = StObject.set(x, "loadingFailedEvent", js.undefined)
      
      inline def setLoadingFinishedEvent(value: LoadingFinishedEvent): Self = StObject.set(x, "loadingFinishedEvent", value.asInstanceOf[js.Any])
      
      inline def setLoadingFinishedEventUndefined: Self = StObject.set(x, "loadingFinishedEvent", js.undefined)
      
      inline def setResponseReceivedEvent(value: ResponseReceivedEvent): Self = StObject.set(x, "responseReceivedEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedirectInfo extends StObject {
    
    var event: RequestWillBeSentEvent
    
    var fetchRequestId: js.UndefOr[FetchRequestId] = js.undefined
  }
  object RedirectInfo {
    
    inline def apply(event: RequestWillBeSentEvent): RedirectInfo = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectInfo] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: RequestWillBeSentEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFetchRequestId(value: FetchRequestId): Self = StObject.set(x, "fetchRequestId", value.asInstanceOf[js.Any])
      
      inline def setFetchRequestIdUndefined: Self = StObject.set(x, "fetchRequestId", js.undefined)
    }
  }
}
