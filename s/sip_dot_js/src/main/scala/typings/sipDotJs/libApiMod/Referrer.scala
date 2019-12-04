package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiReferrerDashOptionsMod.ReferrerOptions
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Referrer")
@js.native
class Referrer protected ()
  extends typings.sipDotJs.libApiReferrerMod.Referrer {
  def this(
    session: typings.sipDotJs.libApiSessionMod.Session,
    referTo: typings.sipDotJs.libApiSessionMod.Session
  ) = this()
  /**
    * Constructs a new instance of the `Referrer` class.
    * @param session - The session the REFER will be sent from. See {@link Session} for details.
    * @param referTo - The referral target. If a `Session`, a REFER w/Replaces is sent.
    * @param options - An options bucket. See {@link ReferrerOptions} for details.
    */
  def this(session: typings.sipDotJs.libApiSessionMod.Session, referTo: URI) = this()
  def this(
    session: typings.sipDotJs.libApiSessionMod.Session,
    referTo: typings.sipDotJs.libApiSessionMod.Session,
    options: ReferrerOptions
  ) = this()
  def this(session: typings.sipDotJs.libApiSessionMod.Session, referTo: URI, options: ReferrerOptions) = this()
}

