package typings.socketIoP2p.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOps extends js.Object {
  var autoUpgrade: Boolean
  var numClients: Double
}

object DefaultOps {
  @scala.inline
  def apply(autoUpgrade: Boolean, numClients: Double): DefaultOps = {
    val __obj = js.Dynamic.literal(autoUpgrade = autoUpgrade.asInstanceOf[js.Any], numClients = numClients.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOps]
  }
}

