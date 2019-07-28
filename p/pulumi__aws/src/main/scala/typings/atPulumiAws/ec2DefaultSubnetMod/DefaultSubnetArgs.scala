package typings.atPulumiAws.ec2DefaultSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSubnetArgs extends js.Object {
  val availabilityZone: Input[String]
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object DefaultSubnetArgs {
  @scala.inline
  def apply(
    availabilityZone: Input[String],
    mapPublicIpOnLaunch: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null
  ): DefaultSubnetArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any])
    if (mapPublicIpOnLaunch != null) __obj.updateDynamic("mapPublicIpOnLaunch")(mapPublicIpOnLaunch.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSubnetArgs]
  }
}

