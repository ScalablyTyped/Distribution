package typings
package socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOps extends js.Object {
  var autoUpgrade: scala.Boolean
  var numClients: scala.Double
}

object DefaultOps {
  @scala.inline
  def apply(autoUpgrade: scala.Boolean, numClients: scala.Double): DefaultOps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoUpgrade")(autoUpgrade)
    __obj.updateDynamic("numClients")(numClients)
    __obj.asInstanceOf[DefaultOps]
  }
}

