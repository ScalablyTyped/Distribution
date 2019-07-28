package typings.atPulumiAws.cognitoMod

import typings.atPulumiAws.cognitoResourceServerMod.ResourceServerArgs
import typings.atPulumiAws.cognitoResourceServerMod.ResourceServerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", "ResourceServer")
@js.native
class ResourceServer protected ()
  extends typings.atPulumiAws.cognitoResourceServerMod.ResourceServer {
  /**
    * Create a ResourceServer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceServerArgs) = this()
  def this(name: String, args: ResourceServerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cognito", "ResourceServer")
@js.native
object ResourceServer extends js.Object {
  /**
    * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
  def get(name: String, id: Input[ID], state: ResourceServerState): typings.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
  def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
  /**
    * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
}

