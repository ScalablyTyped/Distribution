package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsHardwareCertificate extends js.Object {
  var awsHardwareCertificate: String
  var clusterCertificate: String
  var clusterCsr: String
  var hsmCertificate: String
  var manufacturerHardwareCertificate: String
}

object Anon_AwsHardwareCertificate {
  @scala.inline
  def apply(
    awsHardwareCertificate: String,
    clusterCertificate: String,
    clusterCsr: String,
    hsmCertificate: String,
    manufacturerHardwareCertificate: String
  ): Anon_AwsHardwareCertificate = {
    val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate, clusterCertificate = clusterCertificate, clusterCsr = clusterCsr, hsmCertificate = hsmCertificate, manufacturerHardwareCertificate = manufacturerHardwareCertificate)
  
    __obj.asInstanceOf[Anon_AwsHardwareCertificate]
  }
}

