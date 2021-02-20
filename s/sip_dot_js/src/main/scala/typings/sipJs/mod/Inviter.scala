package typings.sipJs.mod

import typings.sipJs.inviterOptionsMod.InviterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Inviter")
@js.native
class Inviter protected ()
  extends typings.sipJs.apiMod.Inviter {
  /**
    * Constructs a new instance of the `Inviter` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param options - Options bucket. See {@link InviterOptions} for details.
    */
  def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: typings.sipJs.coreMod.URI) = this()
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    options: InviterOptions
  ) = this()
}
