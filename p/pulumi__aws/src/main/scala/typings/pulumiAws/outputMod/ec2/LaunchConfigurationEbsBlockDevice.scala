package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationEbsBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  var deviceName: String
  
  var encrypted: Boolean
  
  var iops: Double
  
  var noDevice: js.UndefOr[Boolean] = js.undefined
  
  var snapshotId: String
  
  var volumeSize: Double
  
  var volumeType: String
}
object LaunchConfigurationEbsBlockDevice {
  
  inline def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): LaunchConfigurationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationEbsBlockDevice]
  }
  
  extension [Self <: LaunchConfigurationEbsBlockDevice](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setNoDevice(value: Boolean): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
