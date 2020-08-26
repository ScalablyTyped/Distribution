package typings.socketIoP2p.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait P2POptions extends js.Object {
  /**
    * Upgrade to p2p connection (from s.io one) when peers are ready
    * @default true
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Max number of peers each client can connect to
    * @default 5
    */
  var numClients: js.UndefOr[Double] = js.native
  /**
    * Object of options passed to underlying peers
    * @default {}
    */
  var peerOpts: js.UndefOr[PeerOpts] = js.native
}

object P2POptions {
  @scala.inline
  def apply(): P2POptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[P2POptions]
  }
  @scala.inline
  implicit class P2POptionsOps[Self <: P2POptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoUpgrade(value: Boolean): Self = this.set("autoUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpgrade: Self = this.set("autoUpgrade", js.undefined)
    @scala.inline
    def setNumClients(value: Double): Self = this.set("numClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumClients: Self = this.set("numClients", js.undefined)
    @scala.inline
    def setPeerOpts(value: PeerOpts): Self = this.set("peerOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerOpts: Self = this.set("peerOpts", js.undefined)
  }
  
}

