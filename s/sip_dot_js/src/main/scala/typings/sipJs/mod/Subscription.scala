package typings.sipJs.mod

import typings.sipJs.libSubscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Subscription")
@js.native
class Subscription protected ()
  extends typings.sipJs.libSubscriptionMod.Subscription {
  /**
    * Constructor.
    * @param ua User agent.
    * @param target Subscription target.
    * @param event Subscription event.
    * @param options Options bucket.
    */
  def this(ua: typings.sipJs.uAMod.UA, target: String, event: String) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: typings.sipJs.coreMod.URI, event: String) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: String, event: String, options: SubscriptionOptions) = this()
  def this(
    ua: typings.sipJs.uAMod.UA,
    target: typings.sipJs.coreMod.URI,
    event: String,
    options: SubscriptionOptions
  ) = this()
}

