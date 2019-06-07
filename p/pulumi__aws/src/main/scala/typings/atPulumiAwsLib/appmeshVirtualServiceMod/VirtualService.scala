package typings
package atPulumiAwsLib.appmeshVirtualServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/virtualService", "VirtualService")
@js.native
class VirtualService protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VirtualService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VirtualServiceArgs) = this()
  def this(name: java.lang.String, args: VirtualServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the virtual service.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The creation date of the virtual service.
    */
  val createdDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The last update date of the virtual service.
    */
  val lastUpdatedDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the service mesh in which to create the virtual service.
    */
  val meshName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name to use for the virtual service.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The virtual service specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_Provider] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualServiceMod.VirtualService = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualServiceMod.VirtualServiceState
  ): atPulumiAwsLib.appmeshVirtualServiceMod.VirtualService = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualServiceMod.VirtualServiceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appmeshVirtualServiceMod.VirtualService = js.native
  /**
    * Returns true if the given object is an instance of VirtualService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ scala.Boolean = js.native
}

