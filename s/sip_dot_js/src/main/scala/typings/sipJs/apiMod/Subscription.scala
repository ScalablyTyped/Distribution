package typings.sipJs.apiMod

import typings.sipJs.subscriptionOptionsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Subscription")
@js.native
abstract class Subscription protected ()
  extends typings.sipJs.subscriptionMod.Subscription {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: SubscriptionOptions) = this()
}

