package typings.atPulumiAws.apigatewayMod

import typings.atPulumiAws.apigatewayAuthorizerMod.AuthorizerArgs
import typings.atPulumiAws.apigatewayAuthorizerMod.AuthorizerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "Authorizer")
@js.native
class Authorizer protected ()
  extends typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer {
  /**
    * Create a Authorizer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AuthorizerArgs) = this()
  def this(name: String, args: AuthorizerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "Authorizer")
@js.native
object Authorizer extends js.Object {
  /**
    * Get an existing Authorizer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer = js.native
  def get(name: String, id: Input[ID], state: AuthorizerState): typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer = js.native
  def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer = js.native
  /**
    * Returns true if the given object is an instance of Authorizer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/authorizer.Authorizer */ Boolean = js.native
}

