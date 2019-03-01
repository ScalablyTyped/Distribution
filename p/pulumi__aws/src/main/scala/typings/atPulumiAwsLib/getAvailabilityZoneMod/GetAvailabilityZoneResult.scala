package typings
package atPulumiAwsLib.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the selected availability zone.
    */
  val name: java.lang.String
  /**
    * The part of the AZ name that appears after the region name,
    * uniquely identifying the AZ within its region.
    */
  val nameSuffix: java.lang.String
  /**
    * The region where the selected availability zone resides.
    * This is always the region selected on the provider, since this data source
    * searches only within that region.
    */
  val region: java.lang.String
  /**
    * The current state of the AZ.
    */
  val state: java.lang.String
  /**
    * (Optional) The zone ID of the selected availability zone.
    */
  val zoneId: java.lang.String
}

object GetAvailabilityZoneResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    nameSuffix: java.lang.String,
    region: java.lang.String,
    state: java.lang.String,
    zoneId: java.lang.String
  ): GetAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nameSuffix")(nameSuffix)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[GetAvailabilityZoneResult]
  }
}

