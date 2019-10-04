package typings.atPulumiAws.appmeshVirtualServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.appmeshNs.VirtualServiceSpec
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/virtualService", "VirtualService")
@js.native
class VirtualService protected () extends CustomResource {
  /**
    * Create a VirtualService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VirtualServiceArgs) = this()
  def this(name: String, args: VirtualServiceArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the virtual service.
    */
  val arn: Output[String] = js.native
  /**
    * The creation date of the virtual service.
    */
  val createdDate: Output[String] = js.native
  /**
    * The last update date of the virtual service.
    */
  val lastUpdatedDate: Output[String] = js.native
  /**
    * The name of the service mesh in which to create the virtual service.
    */
  val meshName: Output[String] = js.native
  /**
    * The name to use for the virtual service.
    */
  val name: Output[String] = js.native
  /**
    * The virtual service specification to apply.
    */
  val spec: Output[VirtualServiceSpec] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/virtualService", "VirtualService")
@js.native
object VirtualService extends js.Object {
  /**
    * Get an existing VirtualService resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VirtualService = js.native
  def get(name: String, id: Input[ID], state: VirtualServiceState): VirtualService = js.native
  def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): VirtualService = js.native
  /**
    * Returns true if the given object is an instance of VirtualService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = js.native
}

