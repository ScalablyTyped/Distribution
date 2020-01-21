package typings.pulumiAws.ec2Mod

import typings.pulumiAws.vpcEndpointServiceMod.VpcEndpointServiceArgs
import typings.pulumiAws.vpcEndpointServiceMod.VpcEndpointServiceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "VpcEndpointService")
@js.native
class VpcEndpointService protected ()
  extends typings.pulumiAws.vpcEndpointServiceMod.VpcEndpointService {
  /**
    * Create a VpcEndpointService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointServiceArgs) = this()
  def this(name: String, args: VpcEndpointServiceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "VpcEndpointService")
@js.native
object VpcEndpointService extends js.Object {
  /**
    * Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.vpcEndpointServiceMod.VpcEndpointService = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointServiceState): typings.pulumiAws.vpcEndpointServiceMod.VpcEndpointService = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointServiceState, opts: CustomResourceOptions): typings.pulumiAws.vpcEndpointServiceMod.VpcEndpointService = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpointService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointService.VpcEndpointService */ Boolean = js.native
}

