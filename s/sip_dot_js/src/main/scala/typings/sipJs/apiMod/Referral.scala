package typings.sipJs.apiMod

import typings.sipJs.referMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "Referral")
@js.native
class Referral protected ()
  extends typings.sipJs.referralMod.Referral {
  /** @internal */
  def this(incomingReferRequest: IncomingReferRequest, session: typings.sipJs.sessionMod.Session) = this()
}
