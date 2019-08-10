package typings.atPulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail/instance", "Instance")
@js.native
class Instance protected () extends CustomResource {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceArgs) = this()
  def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Lightsail instance (matches `id`).
    * * `availabilityZone`
    * * `blueprintId`
    * * `bundleId`
    * * `keyPairName`
    * * `userData`
    */
  val arn: Output[String] = js.native
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: Output[String] = js.native
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: Output[String] = js.native
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: Output[String] = js.native
  val cpuCount: Output[Double] = js.native
  val createdAt: Output[String] = js.native
  val ipv6Address: Output[String] = js.native
  val isStaticIp: Output[Boolean] = js.native
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
    */
  val keyPairName: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the Lightsail Instance
    */
  val name: Output[String] = js.native
  val privateIpAddress: Output[String] = js.native
  val publicIpAddress: Output[String] = js.native
  val ramSize: Output[Double] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: Output[js.UndefOr[String]] = js.native
  val username: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
}

