package typings
package atPulumiAwsLib.lightsailInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail/instance", "Instance")
@js.native
class Instance protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: InstanceArgs) = this()
  def this(name: java.lang.String, args: InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the Lightsail instance (matches `id`).
    * * `availability_zone`
    * * `blueprint_id`
    * * `bundle_id`
    * * `key_pair_name`
    * * `user_data`
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val cpuCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  val createdAt: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val ipv6Address: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val isStaticIp: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws_key_pair` at this time)
    */
  val keyPairName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the Lightsail Instance
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val privateIpAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val publicIpAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val ramSize: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val username: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lightsail/instance", "Instance")
@js.native
object Instance extends js.Object {
  /**
    * Get an existing Instance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailInstanceMod.InstanceState
  ): atPulumiAwsLib.lightsailInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailInstanceMod.InstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lightsailInstanceMod.Instance = js.native
}

