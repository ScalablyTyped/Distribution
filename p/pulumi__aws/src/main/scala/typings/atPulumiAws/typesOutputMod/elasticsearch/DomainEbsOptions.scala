package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainEbsOptions extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
    */
  var iops: js.UndefOr[Double] = js.undefined
  /**
    * The size of EBS volumes attached to data nodes (in GB).
    * **Required** if `ebsEnabled` is set to `true`.
    */
  var volumeSize: js.UndefOr[Double] = js.undefined
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: String
}

object DomainEbsOptions {
  @scala.inline
  def apply(
    ebsEnabled: Boolean,
    volumeType: String,
    iops: Int | Double = null,
    volumeSize: Int | Double = null
  ): DomainEbsOptions = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled, volumeType = volumeType)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEbsOptions]
  }
}

