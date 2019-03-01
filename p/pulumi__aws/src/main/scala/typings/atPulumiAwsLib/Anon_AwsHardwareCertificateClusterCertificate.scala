package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsHardwareCertificateClusterCertificate extends js.Object {
  var awsHardwareCertificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var clusterCertificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var clusterCsr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var hsmCertificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var manufacturerHardwareCertificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AwsHardwareCertificateClusterCertificate {
  @scala.inline
  def apply(
    awsHardwareCertificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterCertificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterCsr: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hsmCertificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    manufacturerHardwareCertificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AwsHardwareCertificateClusterCertificate = {
    val __obj = js.Dynamic.literal()
    if (awsHardwareCertificate != null) __obj.updateDynamic("awsHardwareCertificate")(awsHardwareCertificate.asInstanceOf[js.Any])
    if (clusterCertificate != null) __obj.updateDynamic("clusterCertificate")(clusterCertificate.asInstanceOf[js.Any])
    if (clusterCsr != null) __obj.updateDynamic("clusterCsr")(clusterCsr.asInstanceOf[js.Any])
    if (hsmCertificate != null) __obj.updateDynamic("hsmCertificate")(hsmCertificate.asInstanceOf[js.Any])
    if (manufacturerHardwareCertificate != null) __obj.updateDynamic("manufacturerHardwareCertificate")(manufacturerHardwareCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AwsHardwareCertificateClusterCertificate]
  }
}

