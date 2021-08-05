package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainEbsOption extends StObject {
  
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean
  
  /**
    * The baseline input/output (I/O) performance of EBS volumes attached to data nodes.
    */
  var iops: Double
  
  /**
    * The size of EBS volumes attached to data nodes (in GB).
    */
  var volumeSize: Double
  
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: String
}
object GetDomainEbsOption {
  
  inline def apply(ebsEnabled: Boolean, iops: Double, volumeSize: Double, volumeType: String): GetDomainEbsOption = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainEbsOption]
  }
  
  extension [Self <: GetDomainEbsOption](x: Self) {
    
    inline def setEbsEnabled(value: Boolean): Self = StObject.set(x, "ebsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
