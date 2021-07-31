package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupEbsConfig extends StObject {
  
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var iops: js.UndefOr[Double] = js.undefined
  
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var size: Double
  
  /**
    * The volume type. Valid options are 'gp2', 'io1' and 'standard'.
    */
  var `type`: String
  
  /**
    * The number of EBS Volumes to attach per instance.
    */
  var volumesPerInstance: js.UndefOr[Double] = js.undefined
}
object InstanceGroupEbsConfig {
  
  @scala.inline
  def apply(size: Double, `type`: String): InstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupEbsConfig]
  }
  
  @scala.inline
  implicit class InstanceGroupEbsConfigMutableBuilder[Self <: InstanceGroupEbsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesPerInstance(value: Double): Self = StObject.set(x, "volumesPerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesPerInstanceUndefined: Self = StObject.set(x, "volumesPerInstance", js.undefined)
  }
}
