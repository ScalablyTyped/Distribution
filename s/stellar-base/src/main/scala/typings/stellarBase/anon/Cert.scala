package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.AuthCert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cert extends StObject {
  
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
  implicit class CertMutableBuilder[Self <: Cert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: AuthCert): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerVersion(value: Double): Self = StObject.set(x, "ledgerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListeningPort(value: Double): Self = StObject.set(x, "listeningPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: Buffer): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayMinVersion(value: Double): Self = StObject.set(x, "overlayMinVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayVersion(value: Double): Self = StObject.set(x, "overlayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStr(value: String | Buffer): Self = StObject.set(x, "versionStr", value.asInstanceOf[js.Any])
  }
}
