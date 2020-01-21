package typings.pulumiAws.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the selected availability zone.
    */
  val name: String = js.native
  /**
    * The part of the AZ name that appears after the region name,
    * uniquely identifying the AZ within its region.
    */
  val nameSuffix: String = js.native
  /**
    * The region where the selected availability zone resides.
    * This is always the region selected on the provider, since this data source
    * searches only within that region.
    */
  val region: String = js.native
  /**
    * The current state of the AZ.
    */
  val state: String = js.native
  /**
    * (Optional) The zone ID of the selected availability zone.
    */
  val zoneId: String = js.native
}

object GetAvailabilityZoneResult {
  @scala.inline
  def apply(id: String, name: String, nameSuffix: String, region: String, state: String, zoneId: String): GetAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAvailabilityZoneResult]
  }
}

