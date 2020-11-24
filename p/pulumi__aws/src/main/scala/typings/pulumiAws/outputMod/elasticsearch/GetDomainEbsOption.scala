package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainEbsOption extends js.Object {
  
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean = js.native
  
  /**
    * The baseline input/output (I/O) performance of EBS volumes attached to data nodes.
    */
  var iops: Double = js.native
  
  /**
    * The size of EBS volumes attached to data nodes (in GB).
    */
  var volumeSize: Double = js.native
  
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: String = js.native
}
object GetDomainEbsOption {
  
  @scala.inline
  def apply(ebsEnabled: Boolean, iops: Double, volumeSize: Double, volumeType: String): GetDomainEbsOption = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainEbsOption]
  }
  
  @scala.inline
  implicit class GetDomainEbsOptionOps[Self <: GetDomainEbsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEbsEnabled(value: Boolean): Self = this.set("ebsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
  }
}
