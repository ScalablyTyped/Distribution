package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchSpecificationRootBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  var encrypted: Boolean
  
  var iops: Double
  
  var kmsKeyId: String
  
  var volumeSize: Double
  
  var volumeType: String
}
object SpotFleetRequestLaunchSpecificationRootBlockDevice {
  
  inline def apply(encrypted: Boolean, iops: Double, kmsKeyId: String, volumeSize: Double, volumeType: String): SpotFleetRequestLaunchSpecificationRootBlockDevice = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationRootBlockDevice]
  }
  
  extension [Self <: SpotFleetRequestLaunchSpecificationRootBlockDevice](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
