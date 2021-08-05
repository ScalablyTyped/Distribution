package typings.sentryBrowser

import typings.sentryBrowser.baseMod.BaseTransport
import typings.sentryTypes.responseMod.Response
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.transportMod.TransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("@sentry/browser/dist/transports/fetch", "FetchTransport")
  @js.native
  class FetchTransport protected () extends BaseTransport {
    def this(options: TransportOptions) = this()
    
    /**
      * @param sentryRequest Prepared SentryRequest to be delivered
      * @param originalPayload Original payload used to create SentryRequest
      */
    /* private */ var _sendRequest: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("sendSession")
    def sendSession_MFetchTransport(session: Session): js.Thenable[Response] = js.native
  }
}
