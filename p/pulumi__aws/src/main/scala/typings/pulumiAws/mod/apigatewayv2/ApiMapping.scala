package typings.pulumiAws.mod.apigatewayv2

import typings.pulumiAws.apiMappingMod.ApiMappingArgs
import typings.pulumiAws.apiMappingMod.ApiMappingState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "apigatewayv2.ApiMapping")
@js.native
class ApiMapping protected ()
  extends typings.pulumiAws.apigatewayv2Mod.ApiMapping {
  /**
    * Create a ApiMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiMappingArgs) = this()
  def this(name: String, args: ApiMappingArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "apigatewayv2.ApiMapping")
@js.native
object ApiMapping extends js.Object {
  
  /**
    * Get an existing ApiMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.apiMappingMod.ApiMapping = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.apiMappingMod.ApiMapping = js.native
  def get(name: String, id: Input[ID], state: ApiMappingState): typings.pulumiAws.apiMappingMod.ApiMapping = js.native
  def get(name: String, id: Input[ID], state: ApiMappingState, opts: CustomResourceOptions): typings.pulumiAws.apiMappingMod.ApiMapping = js.native
  
  /**
    * Returns true if the given object is an instance of ApiMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean = js.native
}
