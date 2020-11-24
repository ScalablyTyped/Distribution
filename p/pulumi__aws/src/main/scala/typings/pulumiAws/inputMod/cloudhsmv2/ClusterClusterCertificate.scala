package typings.pulumiAws.inputMod.cloudhsmv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ClusterClusterCertificate = {
    val __obj = js.Dynamic.literal()
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
    def setAwsHardwareCertificate(value: Input[String]): Self = this.set("awsHardwareCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsHardwareCertificate: Self = this.set("awsHardwareCertificate", js.undefined)
    
    @scala.inline
    def setClusterCertificate(value: Input[String]): Self = this.set("clusterCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCertificate: Self = this.set("clusterCertificate", js.undefined)
    
    @scala.inline
    def setClusterCsr(value: Input[String]): Self = this.set("clusterCsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCsr: Self = this.set("clusterCsr", js.undefined)
    
    @scala.inline
    def setHsmCertificate(value: Input[String]): Self = this.set("hsmCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmCertificate: Self = this.set("hsmCertificate", js.undefined)
    
    @scala.inline
    def setManufacturerHardwareCertificate(value: Input[String]): Self = this.set("manufacturerHardwareCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturerHardwareCertificate: Self = this.set("manufacturerHardwareCertificate", js.undefined)
  }
}
