package typings
package atPulumiAwsLib.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZonesArgs extends js.Object {
  /**
    * Allows to filter list of Availability Zones based on their
    * current state. Can be either `"available"`, `"information"`, `"impaired"` or
    * `"unavailable"`. By default the list includes a complete set of Availability Zones
    * to which the underlying AWS account has access, regardless of their state.
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
}

object GetAvailabilityZonesArgs {
  @scala.inline
  def apply(state: java.lang.String = null): GetAvailabilityZonesArgs = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GetAvailabilityZonesArgs]
  }
}

