package typings.pulumiAws.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZoneArgs extends js.Object {
  /**
    * The full name of the availability zone to select.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * A specific availability zone state to require. May
    * be any of `"available"`, `"information"` or `"impaired"`.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * The zone ID of the availability zone to select.
    */
  val zoneId: js.UndefOr[String] = js.native
}

object GetAvailabilityZoneArgs {
  @scala.inline
  def apply(name: String = null, state: String = null, zoneId: String = null): GetAvailabilityZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZoneArgs]
  }
}

