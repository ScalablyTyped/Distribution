package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchSpecificationRootBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  
  var encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  
  var iops: js.UndefOr[Input[Double]] = js.undefined
  
  var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}
object SpotFleetRequestLaunchSpecificationRootBlockDevice {
  
  @scala.inline
  def apply(): SpotFleetRequestLaunchSpecificationRootBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationRootBlockDevice]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationRootBlockDeviceMutableBuilder[Self <: SpotFleetRequestLaunchSpecificationRootBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Input[Boolean]): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: Input[String]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
