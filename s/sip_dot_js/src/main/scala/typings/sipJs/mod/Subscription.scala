package typings.sipJs.mod

import typings.sipJs.subscriptionOptionsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Subscription")
@js.native
abstract class Subscription protected ()
  extends typings.sipJs.apiMod.Subscription {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: SubscriptionOptions) = this()
}
