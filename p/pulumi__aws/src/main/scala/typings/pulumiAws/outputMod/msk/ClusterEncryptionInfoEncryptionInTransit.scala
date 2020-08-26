package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionInfoEncryptionInTransit extends js.Object {
  /**
    * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS_PLAINTEXT` when `encryptionInTransit` block defined, but `TLS` when `encryptionInTransit` block omitted.
    */
  var clientBroker: js.UndefOr[String] = js.native
  /**
    * Whether data communication among broker nodes is encrypted. Default value: `true`.
    */
  var inCluster: js.UndefOr[Boolean] = js.native
}

object ClusterEncryptionInfoEncryptionInTransit {
  @scala.inline
  def apply(): ClusterEncryptionInfoEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEncryptionInfoEncryptionInTransit]
  }
  @scala.inline
  implicit class ClusterEncryptionInfoEncryptionInTransitOps[Self <: ClusterEncryptionInfoEncryptionInTransit] (val x: Self) extends AnyVal {
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
    def setClientBroker(value: String): Self = this.set("clientBroker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientBroker: Self = this.set("clientBroker", js.undefined)
    @scala.inline
    def setInCluster(value: Boolean): Self = this.set("inCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInCluster: Self = this.set("inCluster", js.undefined)
  }
  
}

