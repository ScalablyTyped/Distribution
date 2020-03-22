package typings.pulumiAws.getInstanceTypeOfferingsMod

import typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set of EC2 Instance Types.
    */
  val instanceTypes: js.Array[String] = js.native
  val locationType: js.UndefOr[String] = js.native
}

object GetInstanceTypeOfferingsResult {
  @scala.inline
  def apply(
    id: String,
    instanceTypes: js.Array[String],
    filters: js.Array[GetInstanceTypeOfferingsFilter] = null,
    locationType: String = null
  ): GetInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingsResult]
  }
}

