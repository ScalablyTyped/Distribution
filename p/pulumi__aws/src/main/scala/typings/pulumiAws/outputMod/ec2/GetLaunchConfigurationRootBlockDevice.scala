package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchConfigurationRootBlockDevice extends StObject {
  
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean
  
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean
  
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double
  
  /**
    * The Size of the volume.
    */
  var volumeSize: Double
  
  /**
    * The Type of the volume.
    */
  var volumeType: String
}
object GetLaunchConfigurationRootBlockDevice {
  
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    encrypted: Boolean,
    iops: Double,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchConfigurationRootBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationRootBlockDevice]
  }
  
  @scala.inline
  implicit class GetLaunchConfigurationRootBlockDeviceMutableBuilder[Self <: GetLaunchConfigurationRootBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
