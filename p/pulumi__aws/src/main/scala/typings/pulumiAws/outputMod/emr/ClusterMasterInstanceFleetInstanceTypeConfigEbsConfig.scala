package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig extends StObject {
  
  /**
    * The number of I/O operations per second (IOPS) that the volume supports
    */
  var iops: js.UndefOr[Double] = js.undefined
  
  /**
    * The volume size, in gibibytes (GiB).
    */
  var size: Double
  
  /**
    * The volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
    */
  var `type`: String
  
  /**
    * The number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1)
    */
  var volumesPerInstance: js.UndefOr[Double] = js.undefined
}
object ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig {
  
  inline def apply(size: Double, `type`: String): ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig]
  }
  
  extension [Self <: ClusterMasterInstanceFleetInstanceTypeConfigEbsConfig](x: Self) {
    
    inline def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVolumesPerInstance(value: Double): Self = StObject.set(x, "volumesPerInstance", value.asInstanceOf[js.Any])
    
    inline def setVolumesPerInstanceUndefined: Self = StObject.set(x, "volumesPerInstance", js.undefined)
  }
}
