package typings.atPulumiAws.appmeshMod

import typings.atPulumiAws.appmeshVirtualServiceMod.VirtualServiceArgs
import typings.atPulumiAws.appmeshVirtualServiceMod.VirtualServiceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh", "VirtualService")
@js.native
class VirtualService protected ()
  extends typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService {
  /**
    * Create a VirtualService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VirtualServiceArgs) = this()
  def this(name: String, args: VirtualServiceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appmesh", "VirtualService")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService = js.native
  def get(name: String, id: Input[ID], state: VirtualServiceState): typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService = js.native
  def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService = js.native
  /**
    * Returns true if the given object is an instance of VirtualService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = js.native
}

