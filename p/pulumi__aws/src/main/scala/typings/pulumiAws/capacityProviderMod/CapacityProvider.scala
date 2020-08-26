package typings.pulumiAws.capacityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider")
@js.native
class CapacityProvider protected () extends CustomResource {
  /**
    * Create a CapacityProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CapacityProviderArgs) = this()
  def this(name: String, args: CapacityProviderArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) that identifies the capacity provider.
    */
  val arn: Output_[String] = js.native
  /**
    * Nested argument defining the provider for the ECS auto scaling group. Defined below.
    */
  val autoScalingGroupProvider: Output_[CapacityProviderAutoScalingGroupProvider] = js.native
  /**
    * The name of the capacity provider.
    */
  val name: Output_[String] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider")
@js.native
object CapacityProvider extends js.Object {
  /**
    * Get an existing CapacityProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CapacityProvider = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CapacityProvider = js.native
  def get(name: String, id: Input[ID], state: CapacityProviderState): CapacityProvider = js.native
  def get(name: String, id: Input[ID], state: CapacityProviderState, opts: CustomResourceOptions): CapacityProvider = js.native
  /**
    * Returns true if the given object is an instance of CapacityProvider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/capacityProvider.CapacityProvider */ Boolean = js.native
}

