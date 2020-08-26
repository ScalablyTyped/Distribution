package typings.pulumiAws.apigatewayv2Mod

import typings.pulumiAws.apiMod.ApiArgs
import typings.pulumiAws.apiMod.ApiState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2", "Api")
@js.native
class Api protected ()
  extends typings.pulumiAws.apiMod.Api {
  /**
    * Create a Api resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiArgs) = this()
  def this(name: String, args: ApiArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2", "Api")
@js.native
object Api extends js.Object {
  /**
    * Get an existing Api resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.apiMod.Api = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.apiMod.Api = js.native
  def get(name: String, id: Input[ID], state: ApiState): typings.pulumiAws.apiMod.Api = js.native
  def get(name: String, id: Input[ID], state: ApiState, opts: CustomResourceOptions): typings.pulumiAws.apiMod.Api = js.native
  /**
    * Returns true if the given object is an instance of Api.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean = js.native
}

