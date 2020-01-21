package typings.pulumiAws.virtualNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.VirtualNodeSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/virtualNode", "VirtualNode")
@js.native
class VirtualNode protected () extends CustomResource {
  /**
    * Create a VirtualNode resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VirtualNodeArgs) = this()
  def this(name: String, args: VirtualNodeArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the virtual node.
    */
  val arn: Output_[String] = js.native
  /**
    * The creation date of the virtual node.
    */
  val createdDate: Output_[String] = js.native
  /**
    * The last update date of the virtual node.
    */
  val lastUpdatedDate: Output_[String] = js.native
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: Output_[String] = js.native
  /**
    * The name to use for the virtual node.
    */
  val name: Output_[String] = js.native
  /**
    * The virtual node specification to apply.
    */
  val spec: Output_[VirtualNodeSpec] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/virtualNode", "VirtualNode")
@js.native
object VirtualNode extends js.Object {
  /**
    * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VirtualNode = js.native
  def get(name: String, id: Input[ID], state: VirtualNodeState): VirtualNode = js.native
  def get(name: String, id: Input[ID], state: VirtualNodeState, opts: CustomResourceOptions): VirtualNode = js.native
  /**
    * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean = js.native
}

