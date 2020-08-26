package typings.pulumiAws.getInstanceTypeOfferingsMod

import typings.pulumiAws.inputMod.ec2.GetInstanceTypeOfferingsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingsArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingsFilter]] = js.native
  /**
    * Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
    */
  val locationType: js.UndefOr[String] = js.native
}

object GetInstanceTypeOfferingsArgs {
  @scala.inline
  def apply(): GetInstanceTypeOfferingsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypeOfferingsArgs]
  }
  @scala.inline
  implicit class GetInstanceTypeOfferingsArgsOps[Self <: GetInstanceTypeOfferingsArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetInstanceTypeOfferingsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInstanceTypeOfferingsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
  }
  
}

