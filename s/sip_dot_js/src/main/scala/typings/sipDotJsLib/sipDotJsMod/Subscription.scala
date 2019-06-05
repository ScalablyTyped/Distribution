package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Subscription")
@js.native
class Subscription protected ()
  extends sipDotJsLib.libSubscriptionMod.Subscription {
  /**
    * Constructor.
    * @param ua User agent.
    * @param target Subscription target.
    * @param event Subscription event.
    * @param options Options bucket.
    */
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libCoreMod.URI, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String, options: sipDotJsLib.libSubscriptionMod.SubscriptionOptions) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libCoreMod.URI, event: java.lang.String, options: sipDotJsLib.libSubscriptionMod.SubscriptionOptions) = this()
}

