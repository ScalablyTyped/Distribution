package typings.atPulumiAws.dmsMod

import typings.atPulumiAws.dmsEndpointMod.EndpointArgs
import typings.atPulumiAws.dmsEndpointMod.EndpointState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms", "Endpoint")
@js.native
class Endpoint protected ()
  extends typings.atPulumiAws.dmsEndpointMod.Endpoint {
  /**
    * Create a Endpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointArgs) = this()
  def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dms", "Endpoint")
@js.native
object Endpoint extends js.Object {
  /**
    * Get an existing Endpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsEndpointMod.Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState): typings.atPulumiAws.dmsEndpointMod.Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.atPulumiAws.dmsEndpointMod.Endpoint = js.native
  /**
    * Returns true if the given object is an instance of Endpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
}

