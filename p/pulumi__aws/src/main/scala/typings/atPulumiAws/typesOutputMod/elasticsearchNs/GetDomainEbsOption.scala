package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainEbsOption extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes.
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
  @scala.inline
  def apply(ebsEnabled: Boolean, iops: Double, volumeSize: Double, volumeType: String): GetDomainEbsOption = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[GetDomainEbsOption]
  }
}

