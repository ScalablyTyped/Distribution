package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libSubscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Subscription")
@js.native
class Subscription protected ()
  extends typings.sipDotJs.libSubscriptionMod.Subscription {
  /**
    * Constructor.
    * @param ua User agent.
    * @param target Subscription target.
    * @param event Subscription event.
    * @param options Options bucket.
    */
  def this(ua: typings.sipDotJs.libUAMod.UA, target: String, event: String) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: typings.sipDotJs.libCoreMod.URI, event: String) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: String, event: String, options: SubscriptionOptions) = this()
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    target: typings.sipDotJs.libCoreMod.URI,
    event: String,
    options: SubscriptionOptions
  ) = this()
}

