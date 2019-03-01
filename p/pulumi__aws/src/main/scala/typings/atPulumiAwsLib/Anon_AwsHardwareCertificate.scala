package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsHardwareCertificate extends js.Object {
  var awsHardwareCertificate: java.lang.String
  var clusterCertificate: java.lang.String
  var clusterCsr: java.lang.String
  var hsmCertificate: java.lang.String
  var manufacturerHardwareCertificate: java.lang.String
}

object Anon_AwsHardwareCertificate {
  @scala.inline
  def apply(
    awsHardwareCertificate: java.lang.String,
    clusterCertificate: java.lang.String,
    clusterCsr: java.lang.String,
    hsmCertificate: java.lang.String,
    manufacturerHardwareCertificate: java.lang.String
  ): Anon_AwsHardwareCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("awsHardwareCertificate")(awsHardwareCertificate)
    __obj.updateDynamic("clusterCertificate")(clusterCertificate)
    __obj.updateDynamic("clusterCsr")(clusterCsr)
    __obj.updateDynamic("hsmCertificate")(hsmCertificate)
    __obj.updateDynamic("manufacturerHardwareCertificate")(manufacturerHardwareCertificate)
    __obj.asInstanceOf[Anon_AwsHardwareCertificate]
  }
}

