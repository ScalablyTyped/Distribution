package typings.pulumiAws.iamMod

import typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProviderArgs
import typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProviderState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "OpenIdConnectProvider")
@js.native
class OpenIdConnectProvider protected ()
  extends typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProvider {
  /**
    * Create a OpenIdConnectProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OpenIdConnectProviderArgs) = this()
  def this(name: String, args: OpenIdConnectProviderArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/iam", "OpenIdConnectProvider")
@js.native
object OpenIdConnectProvider extends js.Object {
  
  /**
    * Get an existing OpenIdConnectProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProvider = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProvider = js.native
  def get(name: String, id: Input[ID], state: OpenIdConnectProviderState): typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProvider = js.native
  def get(name: String, id: Input[ID], state: OpenIdConnectProviderState, opts: CustomResourceOptions): typings.pulumiAws.openIdConnectProviderMod.OpenIdConnectProvider = js.native
  
  /**
    * Returns true if the given object is an instance of OpenIdConnectProvider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/openIdConnectProvider.OpenIdConnectProvider */ Boolean = js.native
}
