package typings.atPulumiAws.ecsMod

import typings.atPulumiAws.ecsServiceMod.ServiceArgs
import typings.atPulumiAws.ecsServiceMod.ServiceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs", "Service")
@js.native
class Service protected ()
  extends typings.atPulumiAws.ecsServiceMod.Service {
  /**
    * Create a Service resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServiceArgs) = this()
  def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ecs", "Service")
@js.native
object Service extends js.Object {
  /**
    * Get an existing Service resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ecsServiceMod.Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState): typings.atPulumiAws.ecsServiceMod.Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typings.atPulumiAws.ecsServiceMod.Service = js.native
  /**
    * Returns true if the given object is an instance of Service.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
}

