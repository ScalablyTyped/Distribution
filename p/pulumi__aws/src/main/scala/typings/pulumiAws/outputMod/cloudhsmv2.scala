package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudhsmv2 {
  
  trait ClusterClusterCertificate extends StObject {
    
    var awsHardwareCertificate: String
    
    var clusterCertificate: String
    
    var clusterCsr: String
    
    var hsmCertificate: String
    
    var manufacturerHardwareCertificate: String
  }
  object ClusterClusterCertificate {
    
    inline def apply(
      awsHardwareCertificate: String,
      clusterCertificate: String,
      clusterCsr: String,
      hsmCertificate: String,
      manufacturerHardwareCertificate: String
    ): ClusterClusterCertificate = {
      val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate.asInstanceOf[js.Any], clusterCertificate = clusterCertificate.asInstanceOf[js.Any], clusterCsr = clusterCsr.asInstanceOf[js.Any], hsmCertificate = hsmCertificate.asInstanceOf[js.Any], manufacturerHardwareCertificate = manufacturerHardwareCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterClusterCertificate]
    }
    
    extension [Self <: ClusterClusterCertificate](x: Self) {
      
      inline def setAwsHardwareCertificate(value: String): Self = StObject.set(x, "awsHardwareCertificate", value.asInstanceOf[js.Any])
      
      inline def setClusterCertificate(value: String): Self = StObject.set(x, "clusterCertificate", value.asInstanceOf[js.Any])
      
      inline def setClusterCsr(value: String): Self = StObject.set(x, "clusterCsr", value.asInstanceOf[js.Any])
      
      inline def setHsmCertificate(value: String): Self = StObject.set(x, "hsmCertificate", value.asInstanceOf[js.Any])
      
      inline def setManufacturerHardwareCertificate(value: String): Self = StObject.set(x, "manufacturerHardwareCertificate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetClusterClusterCertificates extends StObject {
    
    var awsHardwareCertificate: String
    
    var clusterCertificate: String
    
    var clusterCsr: String
    
    var hsmCertificate: String
    
    var manufacturerHardwareCertificate: String
  }
  object GetClusterClusterCertificates {
    
    inline def apply(
      awsHardwareCertificate: String,
      clusterCertificate: String,
      clusterCsr: String,
      hsmCertificate: String,
      manufacturerHardwareCertificate: String
    ): GetClusterClusterCertificates = {
      val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate.asInstanceOf[js.Any], clusterCertificate = clusterCertificate.asInstanceOf[js.Any], clusterCsr = clusterCsr.asInstanceOf[js.Any], hsmCertificate = hsmCertificate.asInstanceOf[js.Any], manufacturerHardwareCertificate = manufacturerHardwareCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterClusterCertificates]
    }
    
    extension [Self <: GetClusterClusterCertificates](x: Self) {
      
      inline def setAwsHardwareCertificate(value: String): Self = StObject.set(x, "awsHardwareCertificate", value.asInstanceOf[js.Any])
      
      inline def setClusterCertificate(value: String): Self = StObject.set(x, "clusterCertificate", value.asInstanceOf[js.Any])
      
      inline def setClusterCsr(value: String): Self = StObject.set(x, "clusterCsr", value.asInstanceOf[js.Any])
      
      inline def setHsmCertificate(value: String): Self = StObject.set(x, "hsmCertificate", value.asInstanceOf[js.Any])
      
      inline def setManufacturerHardwareCertificate(value: String): Self = StObject.set(x, "manufacturerHardwareCertificate", value.asInstanceOf[js.Any])
    }
  }
}
