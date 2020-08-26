package typings.sipJs.mod

import typings.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Session")
@js.native
abstract class Session protected ()
  extends typings.sipJs.apiMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
}

