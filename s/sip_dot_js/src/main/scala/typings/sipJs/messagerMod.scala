package typings.sipJs

import typings.sipJs.coreMod.URI
import typings.sipJs.messagerMessageOptionsMod.MessagerMessageOptions
import typings.sipJs.messagerOptionsMod.MessagerOptions
import typings.sipJs.userAgentMod.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/messager", JSImport.Namespace)
@js.native
object messagerMod extends js.Object {
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
    var logger: js.Any = js.native
    var request: js.Any = js.native
    var userAgent: js.Any = js.native
    /**
      * Send the message.
      */
    def message(): js.Promise[Unit] = js.native
    def message(options: MessagerMessageOptions): js.Promise[Unit] = js.native
  }
  
}

