package typings.sipJs.mod

import typings.sipJs.subscriberOptionsMod.SubscriberOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Subscriber")
@js.native
class Subscriber protected ()
  extends typings.sipJs.apiMod.Subscriber {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - The request URI identifying the subscribed event.
    * @param eventType - The event type identifying the subscribed event.
    * @param options - Options bucket. See {@link SubscriberOptions} for details.
    */
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    eventType: String
  ) = this()
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    eventType: String,
    options: SubscriberOptions
  ) = this()
}
