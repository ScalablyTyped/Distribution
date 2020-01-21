package typings.pulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceArgs extends js.Object {
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: Input[String] = js.native
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: Input[String] = js.native
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: Input[String] = js.native
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
    */
  val keyPairName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[Input[String]] = js.native
}

object InstanceArgs {
  @scala.inline
  def apply(
    availabilityZone: Input[String],
    blueprintId: Input[String],
    bundleId: Input[String],
    keyPairName: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    userData: Input[String] = null
  ): InstanceArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], blueprintId = blueprintId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any])
    if (keyPairName != null) __obj.updateDynamic("keyPairName")(keyPairName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
}

