package typings.sentryBrowser

import typings.sentryBrowser.typesTransportsTypesMod.BrowserTransportOptions
import typings.sentryCore.mod.BaseClient
import typings.sentryCore.mod.Scope
import typings.sentryTypes.typesBrowseroptionsMod.BrowserClientReplayOptions
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesOptionsMod.Options
import typings.sentryTypes.typesUserMod.UserFeedback
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  @JSImport("@sentry/browser/types/client", "BrowserClient")
  @js.native
  open class BrowserClient protected () extends BaseClient[BrowserClientOptions] {
    /**
      * Creates a new Browser SDK instance.
      *
      * @param options Configuration options for this SDK.
      */
    def this(options: BrowserClientOptions) = this()
    
    /**
      * Sends client reports as an envelope.
      */
    /* private */ var _flushOutcomes: Any = js.native
    
    /* protected */ def _prepareEvent(event: Event, hint: EventHint, scope: Scope): PromiseLike[Event | Null] = js.native
    
    /**
      * Sends user feedback to Sentry.
      */
    def captureUserFeedback(feedback: UserFeedback): Unit = js.native
  }
  
  type BrowserClientOptions = ClientOptions[BrowserTransportOptions]
  
  trait BrowserOptions
    extends StObject
       with Options[BrowserTransportOptions]
       with BrowserClientReplayOptions
  object BrowserOptions {
    
    inline def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
  }
}
