package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionInfoEncryptionInTransit extends js.Object {
  /**
    * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value: `TLS_PLAINTEXT`.
    */
  var clientBroker: js.UndefOr[String] = js.native
  /**
    * Whether data communication among broker nodes is encrypted. Default value: `true`.
    */
  var inCluster: js.UndefOr[Boolean] = js.native
}

object ClusterEncryptionInfoEncryptionInTransit {
  @scala.inline
  def apply(clientBroker: String = null, inCluster: js.UndefOr[Boolean] = js.undefined): ClusterEncryptionInfoEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (clientBroker != null) __obj.updateDynamic("clientBroker")(clientBroker.asInstanceOf[js.Any])
    if (!js.isUndefined(inCluster)) __obj.updateDynamic("inCluster")(inCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionInfoEncryptionInTransit]
  }
}

