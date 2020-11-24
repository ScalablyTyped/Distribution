package typings.sipJs.apiMod

import typings.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "Session")
@js.native
abstract class Session protected ()
  extends typings.sipJs.sessionMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
}
