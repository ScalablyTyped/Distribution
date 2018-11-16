package typings
package socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs

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

