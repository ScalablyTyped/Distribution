package typings.sipJs.apiMod

import typings.sipJs.notifyMod.IncomingNotifyRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Notification")
@js.native
class Notification protected ()
  extends typings.sipJs.notificationMod.Notification {
  /** @internal */
  def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
}

