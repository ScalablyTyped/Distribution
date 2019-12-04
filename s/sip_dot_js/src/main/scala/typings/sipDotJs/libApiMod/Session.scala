package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiSessionDashOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Session")
@js.native
abstract class Session protected ()
  extends typings.sipDotJs.libApiSessionMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent) = this()
  protected def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent, options: SessionOptions) = this()
}

