package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEbsOptions extends StObject {
  
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean = js.native
  
  /**
    * The baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
    */
  var iops: js.UndefOr[Double] = js.native
  
  /**
    * The size of EBS volumes attached to data nodes (in GiB).
    * **Required** if `ebsEnabled` is set to `true`.
    */
  var volumeSize: js.UndefOr[Double] = js.native
  
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: String = js.native
}
object DomainEbsOptions {
  
  @scala.inline
  def apply(ebsEnabled: Boolean, volumeType: String): DomainEbsOptions = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEbsOptions]
  }
  
  @scala.inline
  implicit class DomainEbsOptionsMutableBuilder[Self <: DomainEbsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsEnabled(value: Boolean): Self = StObject.set(x, "ebsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
