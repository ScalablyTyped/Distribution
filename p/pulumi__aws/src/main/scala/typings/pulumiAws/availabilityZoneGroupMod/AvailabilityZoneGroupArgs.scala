package typings.pulumiAws.availabilityZoneGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZoneGroupArgs extends js.Object {
  /**
    * Name of the Availability Zone Group.
    */
  val groupName: Input[String] = js.native
  /**
    * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
    */
  val optInStatus: Input[String] = js.native
}

object AvailabilityZoneGroupArgs {
  @scala.inline
  def apply(groupName: Input[String], optInStatus: Input[String]): AvailabilityZoneGroupArgs = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvailabilityZoneGroupArgs]
  }
}

