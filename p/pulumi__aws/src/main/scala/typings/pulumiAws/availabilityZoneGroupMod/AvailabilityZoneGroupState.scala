package typings.pulumiAws.availabilityZoneGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZoneGroupState extends js.Object {
  /**
    * Name of the Availability Zone Group.
    */
  val groupName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
    */
  val optInStatus: js.UndefOr[Input[String]] = js.native
}

object AvailabilityZoneGroupState {
  @scala.inline
  def apply(groupName: Input[String] = null, optInStatus: Input[String] = null): AvailabilityZoneGroupState = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (optInStatus != null) __obj.updateDynamic("optInStatus")(optInStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZoneGroupState]
  }
}

