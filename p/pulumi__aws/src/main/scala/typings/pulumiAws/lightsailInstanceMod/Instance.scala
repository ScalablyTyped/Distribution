package typings.pulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
    */
  val arn: Output_[String] = js.native
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: Output_[String] = js.native
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: Output_[String] = js.native
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: Output_[String] = js.native
  val cpuCount: Output_[Double] = js.native
  /**
    * The timestamp when the instance was created.
    * * `availabilityZone`
    * * `blueprintId`
    * * `bundleId`
    * * `keyPairName`
    * * `userData`
    */
  val createdAt: Output_[String] = js.native
  val ipv6Address: Output_[String] = js.native
  val isStaticIp: Output_[Boolean] = js.native
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
    */
  val keyPairName: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
    */
  val name: Output_[String] = js.native
  val privateIpAddress: Output_[String] = js.native
  val publicIpAddress: Output_[String] = js.native
  val ramSize: Output_[Double] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: Output_[js.UndefOr[String]] = js.native
  val username: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Instance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
}

