package typings.sipDotJs

import typings.sipDotJs.libApiMessagerDashMessageDashOptionsMod.MessagerMessageOptions
import typings.sipDotJs.libApiMessagerDashOptionsMod.MessagerOptions
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/messager", JSImport.Namespace)
@js.native
object libApiMessagerMod extends js.Object {
  @js.native
  class Messager protected () extends js.Object {
    /**
      * Constructs a new instance of the `Messager` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param content - Content for the body of the message.
      * @param contentType - Content type of the body of the message.
      * @param options - Options bucket. See {@link MessagerOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, content: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, content: String, contentType: String) = this()
    def this(
      userAgent: UserAgent,
      targetURI: URI,
      content: String,
      contentType: String,
      options: MessagerOptions
    ) = this()
    var _disposed: js.Any = js.native
    var logger: js.Any = js.native
    var request: js.Any = js.native
    var userAgent: js.Any = js.native
    /**
      * Destructor.
      * @internal
      */
    def _dispose(): Unit = js.native
    /**
      * Send the message.
      */
    def message(): js.Promise[Unit] = js.native
    def message(options: MessagerMessageOptions): js.Promise[Unit] = js.native
  }
  
}

