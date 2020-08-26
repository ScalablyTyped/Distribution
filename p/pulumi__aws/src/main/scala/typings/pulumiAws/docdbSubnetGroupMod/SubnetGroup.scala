package typings.pulumiAws.docdbSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/docdb/subnetGroup", "SubnetGroup")
@js.native
class SubnetGroup protected () extends CustomResource {
  /**
    * Create a SubnetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SubnetGroupArgs) = this()
  def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the docDB subnet group.
    */
  val arn: Output_[String] = js.native
  /**
    * The description of the docDB subnet group. Defaults to "Managed by Pulumi".
    */
  val description: Output_[String] = js.native
  /**
    * The name of the docDB subnet group. If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[String] = js.native
  /**
    * A list of VPC subnet IDs.
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/docdb/subnetGroup", "SubnetGroup")
@js.native
object SubnetGroup extends js.Object {
  /**
    * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SubnetGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SubnetGroup = js.native
  def get(name: String, id: Input[ID], state: SubnetGroupState): SubnetGroup = js.native
  def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): SubnetGroup = js.native
  /**
    * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/subnetGroup.SubnetGroup */ Boolean = js.native
}

