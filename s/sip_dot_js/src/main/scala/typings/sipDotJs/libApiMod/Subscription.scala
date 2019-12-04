package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiSubscriptionDashOptionsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Subscription")
@js.native
abstract class Subscription protected ()
  extends typings.sipDotJs.libApiSubscriptionMod.Subscription {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent) = this()
  protected def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent, options: SubscriptionOptions) = this()
}

