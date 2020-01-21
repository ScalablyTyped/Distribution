package typings.pulumiAws.meshMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.MeshSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/mesh", "Mesh")
@js.native
class Mesh protected () extends CustomResource {
  /**
    * Create a Mesh resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: MeshArgs) = this()
  def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the service mesh.
    */
  val arn: Output_[String] = js.native
  /**
    * The creation date of the service mesh.
    */
  val createdDate: Output_[String] = js.native
  /**
    * The last update date of the service mesh.
    */
  val lastUpdatedDate: Output_[String] = js.native
  /**
    * The name to use for the service mesh.
    */
  val name: Output_[String] = js.native
  /**
    * The service mesh specification to apply.
    */
  val spec: Output_[js.UndefOr[MeshSpec]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/mesh", "Mesh")
@js.native
object Mesh extends js.Object {
  /**
    * Get an existing Mesh resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Mesh = js.native
  def get(name: String, id: Input[ID], state: MeshState): Mesh = js.native
  def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): Mesh = js.native
  /**
    * Returns true if the given object is an instance of Mesh.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
}

