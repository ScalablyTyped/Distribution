package typings.socketDotIoDashP2p.socketDotIoDashP2pMod

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
    val __obj = js.Dynamic.literal(autoUpgrade = autoUpgrade, numClients = numClients)
  
    __obj.asInstanceOf[DefaultOps]
  }
}

