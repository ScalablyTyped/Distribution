package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationRootBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  var encrypted: Boolean
  
  var iops: Double
  
  var volumeSize: Double
  
  var volumeType: String
}
object LaunchConfigurationRootBlockDevice {
  
  @scala.inline
  def apply(encrypted: Boolean, iops: Double, volumeSize: Double, volumeType: String): LaunchConfigurationRootBlockDevice = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationRootBlockDevice]
  }
  
  @scala.inline
  implicit class LaunchConfigurationRootBlockDeviceMutableBuilder[Self <: LaunchConfigurationRootBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
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
