package typings.atPulumiAws.typesInputMod.mskNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEncryptionInfoEncryptionInTransit extends js.Object {
  /**
    * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value: `TLS_PLAINTEXT`.
    */
  var clientBroker: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether data communication among broker nodes is encrypted. Default value: `true`.
    */
  var inCluster: js.UndefOr[Input[Boolean]] = js.undefined
}

object ClusterEncryptionInfoEncryptionInTransit {
  @scala.inline
  def apply(clientBroker: Input[String] = null, inCluster: Input[Boolean] = null): ClusterEncryptionInfoEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (clientBroker != null) __obj.updateDynamic("clientBroker")(clientBroker.asInstanceOf[js.Any])
    if (inCluster != null) __obj.updateDynamic("inCluster")(inCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionInfoEncryptionInTransit]
  }
}

