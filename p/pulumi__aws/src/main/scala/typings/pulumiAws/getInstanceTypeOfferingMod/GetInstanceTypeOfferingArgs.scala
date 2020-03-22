package typings.pulumiAws.getInstanceTypeOfferingMod

import typings.pulumiAws.inputMod.ec2.GetInstanceTypeOfferingFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.native
  /**
    * Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
    */
  val locationType: js.UndefOr[String] = js.native
  /**
    * Ordered list of preferred EC2 Instance Types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
    */
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetInstanceTypeOfferingArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetInstanceTypeOfferingFilter] = null,
    locationType: String = null,
    preferredInstanceTypes: js.Array[String] = null
  ): GetInstanceTypeOfferingArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (preferredInstanceTypes != null) __obj.updateDynamic("preferredInstanceTypes")(preferredInstanceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingArgs]
  }
}

