package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiSubscriberDashOptionsMod.SubscriberOptions
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Subscriber")
@js.native
class Subscriber protected ()
  extends typings.sipDotJs.libApiSubscriberMod.Subscriber {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - The request URI identifying the subscribed event.
    * @param eventType - The event type identifying the subscribed event.
    * @param options - Options bucket. See {@link SubscriberOptions} for details.
    */
  def this(userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
  def this(
    userAgent: typings.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    eventType: String,
    options: SubscriberOptions
  ) = this()
}

