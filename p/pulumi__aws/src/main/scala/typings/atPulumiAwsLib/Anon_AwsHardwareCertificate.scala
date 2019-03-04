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
    val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate, clusterCertificate = clusterCertificate, clusterCsr = clusterCsr, hsmCertificate = hsmCertificate, manufacturerHardwareCertificate = manufacturerHardwareCertificate)
  
    __obj.asInstanceOf[Anon_AwsHardwareCertificate]
  }
}

