package typings.atPulumiAws.typesOutputMod.cloudhsmv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterClusterCertificates extends js.Object {
  var awsHardwareCertificate: String
  var clusterCertificate: String
  var clusterCsr: String
  var hsmCertificate: String
  var manufacturerHardwareCertificate: String
}

object GetClusterClusterCertificates {
  @scala.inline
  def apply(
    awsHardwareCertificate: String,
    clusterCertificate: String,
    clusterCsr: String,
    hsmCertificate: String,
    manufacturerHardwareCertificate: String
  ): GetClusterClusterCertificates = {
    val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate, clusterCertificate = clusterCertificate, clusterCsr = clusterCsr, hsmCertificate = hsmCertificate, manufacturerHardwareCertificate = manufacturerHardwareCertificate)
  
    __obj.asInstanceOf[GetClusterClusterCertificates]
  }
}

