package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticWebLayerEbsVolume extends StObject {
  
  var encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var iops: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The path to mount the EBS volume on the layer's instances.
    */
  var mountPoint: Input[String]
  
  /**
    * The number of disks to use for the EBS volume.
    */
  var numberOfDisks: Input[Double]
  
  /**
    * The RAID level to use for the volume.
    */
  var raidLevel: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The size of the volume in gigabytes.
    */
  var size: Input[Double]
  
  /**
    * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object StaticWebLayerEbsVolume {
  
  inline def apply(mountPoint: Input[String], numberOfDisks: Input[Double], size: Input[Double]): StaticWebLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticWebLayerEbsVolume]
  }
  
  extension [Self <: StaticWebLayerEbsVolume](x: Self) {
    
    inline def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setMountPoint(value: Input[String]): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDisks(value: Input[Double]): Self = StObject.set(x, "numberOfDisks", value.asInstanceOf[js.Any])
    
    inline def setRaidLevel(value: Input[String]): Self = StObject.set(x, "raidLevel", value.asInstanceOf[js.Any])
    
    inline def setRaidLevelUndefined: Self = StObject.set(x, "raidLevel", js.undefined)
    
    inline def setSize(value: Input[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
