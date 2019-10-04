package typings.atPulumiAws.typesOutputMod.mskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEncryptionInfoEncryptionInTransit extends js.Object {
  /**
    * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value: `TLS_PLAINTEXT`.
    */
  var clientBroker: js.UndefOr[String] = js.undefined
  /**
    * Whether data communication among broker nodes is encrypted. Default value: `true`.
    */
  var inCluster: js.UndefOr[Boolean] = js.undefined
}

object ClusterEncryptionInfoEncryptionInTransit {
  @scala.inline
  def apply(clientBroker: String = null, inCluster: js.UndefOr[Boolean] = js.undefined): ClusterEncryptionInfoEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (clientBroker != null) __obj.updateDynamic("clientBroker")(clientBroker)
    if (!js.isUndefined(inCluster)) __obj.updateDynamic("inCluster")(inCluster)
    __obj.asInstanceOf[ClusterEncryptionInfoEncryptionInTransit]
  }
}

