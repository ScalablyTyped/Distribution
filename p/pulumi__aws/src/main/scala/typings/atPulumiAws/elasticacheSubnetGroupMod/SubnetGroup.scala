package typings.atPulumiAws.elasticacheSubnetGroupMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache/subnetGroup", "SubnetGroup")
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
  val description: Output[String] = js.native
  /**
    * Name for the cache subnet group. Elasticache converts this name to lowercase.
    */
  val name: Output[String] = js.native
  /**
    * List of VPC Subnet IDs for the cache subnet group
    */
  val subnetIds: Output[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticache/subnetGroup", "SubnetGroup")
@js.native
object SubnetGroup extends js.Object {
  /**
    * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SubnetGroup = js.native
  def get(name: String, id: Input[ID], state: SubnetGroupState): SubnetGroup = js.native
  def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): SubnetGroup = js.native
  /**
    * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/subnetGroup.SubnetGroup */ Boolean = js.native
}

