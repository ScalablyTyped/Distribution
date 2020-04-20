package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainEbsOption extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean = js.native
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes.
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
}

