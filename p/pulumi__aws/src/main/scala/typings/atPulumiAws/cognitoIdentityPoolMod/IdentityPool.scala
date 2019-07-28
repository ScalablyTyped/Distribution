package typings.atPulumiAws.cognitoIdentityPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ClientId
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val allowUnauthenticatedIdentities: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN of the identity pool.
    */
  val arn: Output[String] = js.native
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: Output[js.UndefOr[js.Array[Anon_ClientId]]] = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: Output[js.UndefOr[String]] = js.native
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: Output[String] = js.native
  /**
    * A list of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: Output[js.UndefOr[StringDictionary[String]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): IdentityPool = js.native
  def get(name: String, id: Input[ID], state: IdentityPoolState): IdentityPool = js.native
  def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): IdentityPool = js.native
  /**
    * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
}

