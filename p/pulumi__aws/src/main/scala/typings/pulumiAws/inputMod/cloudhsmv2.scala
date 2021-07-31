package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudhsmv2 {
  
  trait ClusterClusterCertificate extends StObject {
    
    var awsHardwareCertificate: js.UndefOr[Input[String]] = js.undefined
    
    var clusterCertificate: js.UndefOr[Input[String]] = js.undefined
    
    var clusterCsr: js.UndefOr[Input[String]] = js.undefined
    
    var hsmCertificate: js.UndefOr[Input[String]] = js.undefined
    
    var manufacturerHardwareCertificate: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterClusterCertificate {
    
    @scala.inline
    def apply(): ClusterClusterCertificate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterClusterCertificate]
    }
    
    @scala.inline
    implicit class ClusterClusterCertificateMutableBuilder[Self <: ClusterClusterCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsHardwareCertificate(value: Input[String]): Self = StObject.set(x, "awsHardwareCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsHardwareCertificateUndefined: Self = StObject.set(x, "awsHardwareCertificate", js.undefined)
      
      @scala.inline
      def setClusterCertificate(value: Input[String]): Self = StObject.set(x, "clusterCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterCertificateUndefined: Self = StObject.set(x, "clusterCertificate", js.undefined)
      
      @scala.inline
      def setClusterCsr(value: Input[String]): Self = StObject.set(x, "clusterCsr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterCsrUndefined: Self = StObject.set(x, "clusterCsr", js.undefined)
      
      @scala.inline
      def setHsmCertificate(value: Input[String]): Self = StObject.set(x, "hsmCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsmCertificateUndefined: Self = StObject.set(x, "hsmCertificate", js.undefined)
      
      @scala.inline
      def setManufacturerHardwareCertificate(value: Input[String]): Self = StObject.set(x, "manufacturerHardwareCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerHardwareCertificateUndefined: Self = StObject.set(x, "manufacturerHardwareCertificate", js.undefined)
    }
  }
}
