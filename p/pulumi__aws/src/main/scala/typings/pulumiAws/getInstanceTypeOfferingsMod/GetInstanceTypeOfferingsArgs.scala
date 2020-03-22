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
  def apply(filters: js.Array[GetInstanceTypeOfferingsFilter] = null, locationType: String = null): GetInstanceTypeOfferingsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingsArgs]
  }
}

