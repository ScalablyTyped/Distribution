package typings.pulumiAws.identityPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cognito.IdentityPoolCognitoIdentityProvider
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool")
@js.native
class IdentityPool protected () extends CustomResource {
  /**
    * Create a IdentityPool resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IdentityPoolArgs) = this()
  def this(name: String, args: IdentityPoolArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The ARN of the identity pool.
    */
  val arn: Output_[String] = js.native
  
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: Output_[js.UndefOr[js.Array[IdentityPoolCognitoIdentityProvider]]] = js.native
  
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: Output_[String] = js.native
  
  /**
    * Set of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A map of tags to assign to the Identity Pool.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cognito/identityPool", "IdentityPool")
@js.native
object IdentityPool extends js.Object {
  
  /**
    * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IdentityPool = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IdentityPool = js.native
  def get(name: String, id: Input[ID], state: IdentityPoolState): IdentityPool = js.native
  def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): IdentityPool = js.native
  
  /**
    * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
}
