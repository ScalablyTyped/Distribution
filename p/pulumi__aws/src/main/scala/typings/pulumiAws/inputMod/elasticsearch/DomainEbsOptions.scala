package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEbsOptions extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Input[Boolean] = js.native
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The size of EBS volumes attached to data nodes (in GB).
    * **Required** if `ebsEnabled` is set to `true`.
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object DomainEbsOptions {
  @scala.inline
  def apply(ebsEnabled: Input[Boolean]): DomainEbsOptions = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEbsOptions]
  }
  @scala.inline
  implicit class DomainEbsOptionsOps[Self <: DomainEbsOptions] (val x: Self) extends AnyVal {
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
    def setEbsEnabled(value: Input[Boolean]): Self = this.set("ebsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setVolumeSize(value: Input[Double]): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSize: Self = this.set("volumeSize", js.undefined)
    @scala.inline
    def setVolumeType(value: Input[String]): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("volumeType", js.undefined)
  }
  
}

