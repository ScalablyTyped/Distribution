package typings.sentryBrowser

import typings.sentryBrowser.baseMod.BaseTransport
import typings.sentryTypes.responseMod.Response
import typings.sentryTypes.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/transports/xhr", JSImport.Namespace)
@js.native
object xhrMod extends js.Object {
  
  @js.native
  class XHRTransport () extends BaseTransport {
    
    /**
      * @param sentryRequest Prepared SentryRequest to be delivered
      * @param originalPayload Original payload used to create SentryRequest
      */
    var _sendRequest: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("sendSession")
    def sendSession_MXHRTransport(session: Session): js.Thenable[Response] = js.native
  }
}
