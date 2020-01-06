package typings.atPulumiAws.typesOutputMod.cloudhsmv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClusterCertificates extends js.Object {
  var awsHardwareCertificate: String = js.native
  var clusterCertificate: String = js.native
  var clusterCsr: String = js.native
  var hsmCertificate: String = js.native
  var manufacturerHardwareCertificate: String = js.native
}

object ClusterClusterCertificates {
  @scala.inline
  def apply(
    awsHardwareCertificate: String,
    clusterCertificate: String,
    clusterCsr: String,
    hsmCertificate: String,
    manufacturerHardwareCertificate: String
  ): ClusterClusterCertificates = {
    val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate.asInstanceOf[js.Any], clusterCertificate = clusterCertificate.asInstanceOf[js.Any], clusterCsr = clusterCsr.asInstanceOf[js.Any], hsmCertificate = hsmCertificate.asInstanceOf[js.Any], manufacturerHardwareCertificate = manufacturerHardwareCertificate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterClusterCertificates]
  }
}

