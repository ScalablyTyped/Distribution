package typings.sipJs.mod

import typings.sipJs.notifyMod.IncomingNotifyRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Notification")
@js.native
class Notification protected ()
  extends typings.sipJs.apiMod.Notification {
  /** @internal */
  def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
}

