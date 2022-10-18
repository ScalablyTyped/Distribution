package typings.sipJs.mod

import typings.sipJs.libApiSubscriptionOptionsMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js", "Subscription")
@js.native
open class Subscription protected ()
  extends typings.sipJs.libApiMod.Subscription {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  /* protected */ def this(userAgent: typings.sipJs.libApiUserAgentMod.UserAgent) = this()
  /* protected */ def this(userAgent: typings.sipJs.libApiUserAgentMod.UserAgent, options: SubscriptionOptions) = this()
}
