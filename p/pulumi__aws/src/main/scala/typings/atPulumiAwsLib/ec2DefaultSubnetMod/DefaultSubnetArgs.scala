package typings
package atPulumiAwsLib.ec2DefaultSubnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSubnetArgs extends js.Object {
  val availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object DefaultSubnetArgs {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    mapPublicIpOnLaunch: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): DefaultSubnetArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any])
    if (mapPublicIpOnLaunch != null) __obj.updateDynamic("mapPublicIpOnLaunch")(mapPublicIpOnLaunch.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSubnetArgs]
  }
}

