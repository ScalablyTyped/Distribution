package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiInfoerDashOptionsMod.InfoerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Infoer")
@js.native
class Infoer protected ()
  extends typings.sipDotJs.libApiInfoerMod.Infoer {
  /**
    * Constructs a new instance of the `Infoer` class.
    * @param session - The session the INFO will be sent from. See {@link Session} for details.
    * @param options - An options bucket.
    */
  def this(session: typings.sipDotJs.libApiSessionMod.Session) = this()
  def this(session: typings.sipDotJs.libApiSessionMod.Session, options: InfoerOptions) = this()
}

