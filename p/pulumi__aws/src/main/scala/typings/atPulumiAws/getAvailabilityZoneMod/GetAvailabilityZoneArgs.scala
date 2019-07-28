package typings.atPulumiAws.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZoneArgs extends js.Object {
  /**
    * The full name of the availability zone to select.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * A specific availability zone state to require. May
    * be any of `"available"`, `"information"` or `"impaired"`.
    */
  val state: js.UndefOr[String] = js.undefined
  /**
    * The zone ID of the availability zone to select.
    */
  val zoneId: js.UndefOr[String] = js.undefined
}

object GetAvailabilityZoneArgs {
  @scala.inline
  def apply(name: String = null, state: String = null, zoneId: String = null): GetAvailabilityZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (state != null) __obj.updateDynamic("state")(state)
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[GetAvailabilityZoneArgs]
  }
}

