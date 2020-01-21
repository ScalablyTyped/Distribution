package typings.sipJs.apiMod

import typings.sipJs.infoerOptionsMod.InfoerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Infoer")
@js.native
class Infoer protected ()
  extends typings.sipJs.infoerMod.Infoer {
  /**
    * Constructs a new instance of the `Infoer` class.
    * @param session - The session the INFO will be sent from. See {@link Session} for details.
    * @param options - An options bucket.
    */
  def this(session: typings.sipJs.sessionMod.Session) = this()
  def this(session: typings.sipJs.sessionMod.Session, options: InfoerOptions) = this()
}

