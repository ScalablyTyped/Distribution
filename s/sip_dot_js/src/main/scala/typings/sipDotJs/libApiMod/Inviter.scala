package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiInviterDashOptionsMod.InviterOptions
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Inviter")
@js.native
class Inviter protected ()
  extends typings.sipDotJs.libApiInviterMod.Inviter {
  /**
    * Constructs a new instance of the `Inviter` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param options - Options bucket. See {@link InviterOptions} for details.
    */
  def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent, targetURI: URI) = this()
  def this(
    userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    options: InviterOptions
  ) = this()
}

