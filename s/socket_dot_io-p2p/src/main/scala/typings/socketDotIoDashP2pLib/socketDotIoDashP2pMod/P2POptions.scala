package typings
package socketDotIoDashP2pLib.socketDotIoDashP2pMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait P2POptions extends js.Object {
  /**
    * Upgrade to p2p connection (from s.io one) when peers are ready
    * @default true
    */
  var autoUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Max number of peers each client can connect to
    * @default 5
    */
  var numClients: js.UndefOr[scala.Double] = js.undefined
  /**
    * Object of options passed to underlying peers
    * @default {}
    */
  var peerOpts: js.UndefOr[PeerOpts] = js.undefined
}

object P2POptions {
  @scala.inline
  def apply(
    autoUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    numClients: scala.Int | scala.Double = null,
    peerOpts: PeerOpts = null
  ): P2POptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpgrade)) __obj.updateDynamic("autoUpgrade")(autoUpgrade)
    if (numClients != null) __obj.updateDynamic("numClients")(numClients.asInstanceOf[js.Any])
    if (peerOpts != null) __obj.updateDynamic("peerOpts")(peerOpts)
    __obj.asInstanceOf[P2POptions]
  }
}

