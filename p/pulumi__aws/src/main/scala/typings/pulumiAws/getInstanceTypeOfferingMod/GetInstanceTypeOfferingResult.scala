package typings.pulumiAws.getInstanceTypeOfferingMod

import typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * EC2 Instance Type.
    */
  val instanceType: String = js.native
  val locationType: js.UndefOr[String] = js.native
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetInstanceTypeOfferingResult {
  @scala.inline
  def apply(
    id: String,
    instanceType: String,
    filters: js.Array[GetInstanceTypeOfferingFilter] = null,
    locationType: String = null,
    preferredInstanceTypes: js.Array[String] = null
  ): GetInstanceTypeOfferingResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (preferredInstanceTypes != null) __obj.updateDynamic("preferredInstanceTypes")(preferredInstanceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingResult]
  }
}

