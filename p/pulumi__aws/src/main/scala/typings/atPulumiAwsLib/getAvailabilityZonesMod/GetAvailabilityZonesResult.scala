package typings
package atPulumiAwsLib.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZonesResult extends js.Object {
  val blacklistedNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val blacklistedZoneIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of the Availability Zone names available to the account.
    */
  val names: js.Array[java.lang.String]
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of the Availability Zone IDs available to the account.
    */
  val zoneIds: js.Array[java.lang.String]
}

object GetAvailabilityZonesResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    names: js.Array[java.lang.String],
    zoneIds: js.Array[java.lang.String],
    blacklistedNames: js.Array[java.lang.String] = null,
    blacklistedZoneIds: js.Array[java.lang.String] = null,
    state: java.lang.String = null
  ): GetAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal(id = id, names = names, zoneIds = zoneIds)
    if (blacklistedNames != null) __obj.updateDynamic("blacklistedNames")(blacklistedNames)
    if (blacklistedZoneIds != null) __obj.updateDynamic("blacklistedZoneIds")(blacklistedZoneIds)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GetAvailabilityZonesResult]
  }
}

