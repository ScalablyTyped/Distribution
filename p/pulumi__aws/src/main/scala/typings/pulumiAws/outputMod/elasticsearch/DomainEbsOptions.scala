package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEbsOptions extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Boolean = js.native
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
    */
  var iops: js.UndefOr[Double] = js.native
  /**
    * The size of EBS volumes attached to data nodes (in GB).
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
  def apply(
    ebsEnabled: Boolean,
    volumeType: String,
    iops: js.UndefOr[Double] = js.undefined,
    volumeSize: js.UndefOr[Double] = js.undefined
  ): DomainEbsOptions = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    if (!js.isUndefined(iops)) __obj.updateDynamic("iops")(iops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeSize)) __obj.updateDynamic("volumeSize")(volumeSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEbsOptions]
  }
}

