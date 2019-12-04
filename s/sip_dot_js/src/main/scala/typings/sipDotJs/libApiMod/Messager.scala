package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiMessagerDashOptionsMod.MessagerOptions
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Messager")
@js.native
class Messager protected ()
  extends typings.sipDotJs.libApiMessagerMod.Messager {
  /**
    * Constructs a new instance of the `Messager` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param content - Content for the body of the message.
    * @param contentType - Content type of the body of the message.
    * @param options - Options bucket. See {@link MessagerOptions} for details.
    */
  def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent, targetURI: URI, content: String) = this()
  def this(
    userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: String
  ) = this()
  def this(
    userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: String,
    options: MessagerOptions
  ) = this()
}

