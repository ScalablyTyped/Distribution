package typings
package atPulumiAwsLib.cognitoIdentityProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/identityProvider", "IdentityProvider")
@js.native
class IdentityProvider protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a IdentityProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: IdentityProviderArgs) = this()
  def this(name: java.lang.String, args: IdentityProviderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
    */
  val attributeMapping: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The list of identity providers.
    */
  val idpIdentifiers: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The map of identity details, such as access token
    */
  val providerDetails: atPulumiPulumiLib.pulumiMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * The provider name
    */
  val providerName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The user pool id
    */
  val userPoolId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/cognito/identityProvider", "IdentityProvider")
@js.native
object IdentityProvider extends js.Object {
  /**
    * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderState
  ): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
}

