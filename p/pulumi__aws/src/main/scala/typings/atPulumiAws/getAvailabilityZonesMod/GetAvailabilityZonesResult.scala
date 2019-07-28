package typings.atPulumiAws.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZonesResult extends js.Object {
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.undefined
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * A list of the Availability Zone names available to the account.
    */
  val names: js.Array[String]
  val state: js.UndefOr[String] = js.undefined
  /**
    * A list of the Availability Zone IDs available to the account.
    */
  val zoneIds: js.Array[String]
}

object GetAvailabilityZonesResult {
  @scala.inline
  def apply(
    id: String,
    names: js.Array[String],
    zoneIds: js.Array[String],
    blacklistedNames: js.Array[String] = null,
    blacklistedZoneIds: js.Array[String] = null,
    state: String = null
  ): GetAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal(id = id, names = names, zoneIds = zoneIds)
    if (blacklistedNames != null) __obj.updateDynamic("blacklistedNames")(blacklistedNames)
    if (blacklistedZoneIds != null) __obj.updateDynamic("blacklistedZoneIds")(blacklistedZoneIds)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GetAvailabilityZonesResult]
  }
}

