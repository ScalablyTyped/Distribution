package typings.atPulumiAws.mediastoreContainerPolicyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy")
@js.native
class ContainerPolicy protected () extends CustomResource {
  /**
    * Create a ContainerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ContainerPolicyArgs) = this()
  def this(name: String, args: ContainerPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the container.
    */
  val containerName: Output[String] = js.native
  val policy: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy")
@js.native
object ContainerPolicy extends js.Object {
  /**
    * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ContainerPolicy = js.native
  def get(name: String, id: Input[ID], state: ContainerPolicyState): ContainerPolicy = js.native
  def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): ContainerPolicy = js.native
  /**
    * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = js.native
}

