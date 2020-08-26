package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.AuthCert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cert extends js.Object {
  var cert: AuthCert = js.native
  var ledgerVersion: Double = js.native
  var listeningPort: Double = js.native
  var networkId: Buffer = js.native
  var nonce: Buffer = js.native
  var overlayMinVersion: Double = js.native
  var overlayVersion: Double = js.native
  var peerId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  var versionStr: String | Buffer = js.native
}

object Cert {
  @scala.inline
  def apply(
    cert: AuthCert,
    ledgerVersion: Double,
    listeningPort: Double,
    networkId: Buffer,
    nonce: Buffer,
    overlayMinVersion: Double,
    overlayVersion: Double,
    peerId: typings.stellarBase.xdrMod.xdr.NodeId,
    versionStr: String | Buffer
  ): Cert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], ledgerVersion = ledgerVersion.asInstanceOf[js.Any], listeningPort = listeningPort.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], overlayMinVersion = overlayMinVersion.asInstanceOf[js.Any], overlayVersion = overlayVersion.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], versionStr = versionStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cert]
  }
  @scala.inline
  implicit class CertOps[Self <: Cert] (val x: Self) extends AnyVal {
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
    def setCert(value: AuthCert): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerVersion(value: Double): Self = this.set("ledgerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setListeningPort(value: Double): Self = this.set("listeningPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkId(value: Buffer): Self = this.set("networkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: Buffer): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayMinVersion(value: Double): Self = this.set("overlayMinVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayVersion(value: Double): Self = this.set("overlayVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = this.set("peerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionStr(value: String | Buffer): Self = this.set("versionStr", value.asInstanceOf[js.Any])
  }
  
}

