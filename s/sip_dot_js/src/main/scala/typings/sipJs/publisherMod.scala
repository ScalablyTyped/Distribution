package typings.sipJs

import typings.sipJs.coreMod.IncomingResponseMessage
import typings.sipJs.coreMod.URI
import typings.sipJs.emitterMod.Emitter
import typings.sipJs.publishMod.OutgoingPublishRequest
import typings.sipJs.publisherOptionsMod.PublisherOptions
import typings.sipJs.publisherPublishOptionsMod.PublisherPublishOptions
import typings.sipJs.publisherStateMod.PublisherState
import typings.sipJs.publisherUnpublishOptionsMod.PublisherUnpublishOptions
import typings.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherMod {
  
  @JSImport("sip.js/lib/api/publisher", "Publisher")
  @js.native
  open class Publisher protected () extends StObject {
    /**
      * Constructs a new instance of the `Publisher` class.
      *
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param eventType - The event type identifying the published document.
      * @param options - Options bucket. See {@link PublisherOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, eventType: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, eventType: String, options: PublisherOptions) = this()
    
    /** The publication state. */
    /* private */ var _state: Any = js.native
    
    /** Emits when the registration state changes. */
    /* private */ var _stateEventEmitter: Any = js.native
    
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    
    /* private */ var disposed: Any = js.native
    
    /* private */ var event: Any = js.native
    
    /* private */ var id: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var pubRequestBody: Any = js.native
    
    /* private */ var pubRequestEtag: Any = js.native
    
    /* private */ var pubRequestExpires: Any = js.native
    
    /**
      * Publish.
      * @param content - Body to publish
      */
    def publish(content: String): js.Promise[Unit] = js.native
    def publish(content: String, options: PublisherPublishOptions): js.Promise[Unit] = js.native
    
    /* private */ var publishRefreshTimer: Any = js.native
    
    /** @internal */
    /* protected */ def receiveResponse(response: IncomingResponseMessage): Unit = js.native
    
    /* private */ var refreshRequest: Any = js.native
    
    /* private */ var request: Any = js.native
    
    /** @internal */
    /* protected */ def send(): OutgoingPublishRequest = js.native
    
    /* private */ var sendPublishRequest: Any = js.native
    
    /** The publication state. */
    def state: PublisherState = js.native
    
    /** Emits when the publisher state changes. */
    def stateChange: Emitter[PublisherState] = js.native
    
    /**
      * Transition publication state.
      */
    /* private */ var stateTransition: Any = js.native
    
    /* private */ var target: Any = js.native
    
    /**
      * Unpublish.
      */
    def unpublish(): js.Promise[Unit] = js.native
    def unpublish(options: PublisherUnpublishOptions): js.Promise[Unit] = js.native
    
    /* private */ var userAgent: Any = js.native
  }
}
