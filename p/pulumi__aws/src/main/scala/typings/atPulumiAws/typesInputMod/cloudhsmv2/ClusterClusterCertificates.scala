package typings.atPulumiAws.typesInputMod.cloudhsmv2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterClusterCertificates extends js.Object {
  var awsHardwareCertificate: js.UndefOr[Input[String]] = js.undefined
  var clusterCertificate: js.UndefOr[Input[String]] = js.undefined
  var clusterCsr: js.UndefOr[Input[String]] = js.undefined
  var hsmCertificate: js.UndefOr[Input[String]] = js.undefined
  var manufacturerHardwareCertificate: js.UndefOr[Input[String]] = js.undefined
}

object ClusterClusterCertificates {
  @scala.inline
  def apply(
    awsHardwareCertificate: Input[String] = null,
    clusterCertificate: Input[String] = null,
    clusterCsr: Input[String] = null,
    hsmCertificate: Input[String] = null,
    manufacturerHardwareCertificate: Input[String] = null
  ): ClusterClusterCertificates = {
    val __obj = js.Dynamic.literal()
    if (awsHardwareCertificate != null) __obj.updateDynamic("awsHardwareCertificate")(awsHardwareCertificate.asInstanceOf[js.Any])
    if (clusterCertificate != null) __obj.updateDynamic("clusterCertificate")(clusterCertificate.asInstanceOf[js.Any])
    if (clusterCsr != null) __obj.updateDynamic("clusterCsr")(clusterCsr.asInstanceOf[js.Any])
    if (hsmCertificate != null) __obj.updateDynamic("hsmCertificate")(hsmCertificate.asInstanceOf[js.Any])
    if (manufacturerHardwareCertificate != null) __obj.updateDynamic("manufacturerHardwareCertificate")(manufacturerHardwareCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClusterCertificates]
  }
}

