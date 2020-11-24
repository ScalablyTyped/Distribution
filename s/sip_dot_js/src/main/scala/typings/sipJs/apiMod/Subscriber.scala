package typings.sipJs.apiMod

import typings.sipJs.coreMod.URI
import typings.sipJs.subscriberOptionsMod.SubscriberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "Subscriber")
@js.native
class Subscriber protected ()
  extends typings.sipJs.subscriberMod.Subscriber {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - The request URI identifying the subscribed event.
    * @param eventType - The event type identifying the subscribed event.
    * @param options - Options bucket. See {@link SubscriberOptions} for details.
    */
  def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    eventType: String,
    options: SubscriberOptions
  ) = this()
}
