package typings
package atPulumiAwsLib.lightsailInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceArgs extends js.Object {
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws_key_pair` at this time)
    */
  val keyPairName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Lightsail Instance
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object InstanceArgs {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    blueprintId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bundleId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    keyPairName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    userData: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): InstanceArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], blueprintId = blueprintId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any])
    if (keyPairName != null) __obj.updateDynamic("keyPairName")(keyPairName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
}

