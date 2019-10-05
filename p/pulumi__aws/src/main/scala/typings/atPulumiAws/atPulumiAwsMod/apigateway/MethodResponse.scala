package typings.atPulumiAws.atPulumiAwsMod.apigateway

import typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponseArgs
import typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponseState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.MethodResponse")
@js.native
class MethodResponse protected ()
  extends typings.atPulumiAws.apigatewayMod.MethodResponse {
  /**
    * Create a MethodResponse resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MethodResponseArgs) = this()
  def this(name: String, args: MethodResponseArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.MethodResponse")
@js.native
object MethodResponse extends js.Object {
  /**
    * Get an existing MethodResponse resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponse = js.native
  def get(name: String, id: Input[ID], state: MethodResponseState): typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponse = js.native
  def get(name: String, id: Input[ID], state: MethodResponseState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponse = js.native
  /**
    * Returns true if the given object is an instance of MethodResponse.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodResponse.MethodResponse */ Boolean = js.native
}

