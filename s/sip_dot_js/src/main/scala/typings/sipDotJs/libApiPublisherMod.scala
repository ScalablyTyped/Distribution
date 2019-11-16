package typings.sipDotJs

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libApiPublisherDashOptionsMod.PublisherOptions
import typings.sipDotJs.libApiPublisherDashPublishDashOptionsMod.PublisherPublishOptions
import typings.sipDotJs.libApiPublisherDashUnpublishDashOptionsMod.PublisherUnpublishOptions
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
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
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param eventType - The event type identifying the published document.
      * @param options - Options bucket. See {@link PublisherOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, eventType: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, eventType: String, options: PublisherOptions) = this()
    var event: js.Any = js.native
    var logger: js.Any = js.native
    var options: js.Any = js.native
    var pubRequestBody: js.Any = js.native
    var pubRequestEtag: js.Any = js.native
    var pubRequestExpires: js.Any = js.native
    var publishRefreshTimer: js.Any = js.native
    var refreshRequest: js.Any = js.native
    var request: js.Any = js.native
    var sendPublishRequest: js.Any = js.native
    var target: js.Any = js.native
    var userAgent: js.Any = js.native
    /**
      * Close
      * @internal
      */
    def _close(): Unit = js.native
    /**
      * Publish
      * @param content - Body to publish
      */
    def publish(content: String): Unit = js.native
    def publish(content: String, options: PublisherPublishOptions): Unit = js.native
    /** @internal */
    /* protected */ def receiveResponse(response: IncomingResponseMessage): Unit = js.native
    /** @internal */
    /* protected */ def send(): this.type = js.native
    /**
      * Unpublish
      */
    def unpublish(): Unit = js.native
    def unpublish(options: PublisherUnpublishOptions): Unit = js.native
  }
  
}

