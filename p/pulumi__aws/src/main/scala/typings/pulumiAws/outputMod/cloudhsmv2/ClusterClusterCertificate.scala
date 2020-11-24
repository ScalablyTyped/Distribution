package typings.pulumiAws.outputMod.cloudhsmv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterClusterCertificate extends js.Object {
  
  var awsHardwareCertificate: String = js.native
  
  var clusterCertificate: String = js.native
  
  var clusterCsr: String = js.native
  
  var hsmCertificate: String = js.native
  
  var manufacturerHardwareCertificate: String = js.native
}
object ClusterClusterCertificate {
  
  @scala.inline
  def apply(
    awsHardwareCertificate: String,
    clusterCertificate: String,
    clusterCsr: String,
    hsmCertificate: String,
    manufacturerHardwareCertificate: String
  ): ClusterClusterCertificate = {
    val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate.asInstanceOf[js.Any], clusterCertificate = clusterCertificate.asInstanceOf[js.Any], clusterCsr = clusterCsr.asInstanceOf[js.Any], hsmCertificate = hsmCertificate.asInstanceOf[js.Any], manufacturerHardwareCertificate = manufacturerHardwareCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClusterCertificate]
  }
  
  @scala.inline
  implicit class ClusterClusterCertificateOps[Self <: ClusterClusterCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsHardwareCertificate(value: String): Self = this.set("awsHardwareCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCertificate(value: String): Self = this.set("clusterCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCsr(value: String): Self = this.set("clusterCsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmCertificate(value: String): Self = this.set("hsmCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerHardwareCertificate(value: String): Self = this.set("manufacturerHardwareCertificate", value.asInstanceOf[js.Any])
  }
}
