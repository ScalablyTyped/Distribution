package typings.pulumiAws.inputMod.cloudhsmv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClusterCertificate extends js.Object {
  var awsHardwareCertificate: js.UndefOr[Input[String]] = js.native
  var clusterCertificate: js.UndefOr[Input[String]] = js.native
  var clusterCsr: js.UndefOr[Input[String]] = js.native
  var hsmCertificate: js.UndefOr[Input[String]] = js.native
  var manufacturerHardwareCertificate: js.UndefOr[Input[String]] = js.native
}

object ClusterClusterCertificate {
  @scala.inline
  def apply(
    awsHardwareCertificate: Input[String] = null,
    clusterCertificate: Input[String] = null,
    clusterCsr: Input[String] = null,
    hsmCertificate: Input[String] = null,
    manufacturerHardwareCertificate: Input[String] = null
  ): ClusterClusterCertificate = {
    val __obj = js.Dynamic.literal()
    if (awsHardwareCertificate != null) __obj.updateDynamic("awsHardwareCertificate")(awsHardwareCertificate.asInstanceOf[js.Any])
    if (clusterCertificate != null) __obj.updateDynamic("clusterCertificate")(clusterCertificate.asInstanceOf[js.Any])
    if (clusterCsr != null) __obj.updateDynamic("clusterCsr")(clusterCsr.asInstanceOf[js.Any])
    if (hsmCertificate != null) __obj.updateDynamic("hsmCertificate")(hsmCertificate.asInstanceOf[js.Any])
    if (manufacturerHardwareCertificate != null) __obj.updateDynamic("manufacturerHardwareCertificate")(manufacturerHardwareCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClusterCertificate]
  }
}

