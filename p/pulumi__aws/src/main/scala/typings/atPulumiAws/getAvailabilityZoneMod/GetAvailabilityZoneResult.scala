package typings.atPulumiAws.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The name of the selected availability zone.
    */
  val name: String
  /**
    * The part of the AZ name that appears after the region name,
    * uniquely identifying the AZ within its region.
    */
  val nameSuffix: String
  /**
    * The region where the selected availability zone resides.
    * This is always the region selected on the provider, since this data source
    * searches only within that region.
    */
  val region: String
  /**
    * The current state of the AZ.
    */
  val state: String
  /**
    * (Optional) The zone ID of the selected availability zone.
    */
  val zoneId: String
}

object GetAvailabilityZoneResult {
  @scala.inline
  def apply(id: String, name: String, nameSuffix: String, region: String, state: String, zoneId: String): GetAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, nameSuffix = nameSuffix, region = region, state = state, zoneId = zoneId)
  
    __obj.asInstanceOf[GetAvailabilityZoneResult]
  }
}

