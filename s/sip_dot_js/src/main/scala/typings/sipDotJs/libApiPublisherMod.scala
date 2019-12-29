package typings.sipDotJs

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libApiEmitterMod.Emitter
import typings.sipDotJs.libApiPublisherDashOptionsMod.PublisherOptions
import typings.sipDotJs.libApiPublisherDashPublishDashOptionsMod.PublisherPublishOptions
import typings.sipDotJs.libApiPublisherDashStateMod.PublisherState
import typings.sipDotJs.libApiPublisherDashUnpublishDashOptionsMod.PublisherUnpublishOptions
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libCoreMessagesMethodsPublishMod.OutgoingPublishRequest
import typings.sipDotJs.libCoreMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/publisher", JSImport.Namespace)
@js.native
object libApiPublisherMod extends js.Object {
  @js.native
  class Publisher protected () extends EventEmitter {
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
    var _state: js.Any = js.native
    /** Emits when the registration state changes. */
    var _stateEventEmitter: js.Any = js.native
    var disposed: js.Any = js.native
    var event: js.Any = js.native
    var id: js.Any = js.native
    var logger: js.Any = js.native
    var options: js.Any = js.native
    var pubRequestBody: js.Any = js.native
    var pubRequestEtag: js.Any = js.native
    var pubRequestExpires: js.Any = js.native
    var publishRefreshTimer: js.Any = js.native
    var refreshRequest: js.Any = js.native
    var request: js.Any = js.native
    var sendPublishRequest: js.Any = js.native
    /** The publication state. */
    val state: PublisherState = js.native
    /** Emits when the publisher state changes. */
    val stateChange: Emitter[PublisherState] = js.native
    /**
      * Transition publication state.
      */
    var stateTransition: js.Any = js.native
    var target: js.Any = js.native
    var userAgent: js.Any = js.native
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    /**
      * Publish.
      * @param content - Body to publish
      */
    def publish(content: String): js.Promise[Unit] = js.native
    def publish(content: String, options: PublisherPublishOptions): js.Promise[Unit] = js.native
    /** @internal */
    /* protected */ def receiveResponse(response: IncomingResponseMessage): Unit = js.native
    /** @internal */
    /* protected */ def send(): OutgoingPublishRequest = js.native
    /**
      * Unpublish.
      */
    def unpublish(): js.Promise[Unit] = js.native
    def unpublish(options: PublisherUnpublishOptions): js.Promise[Unit] = js.native
  }
  
}

