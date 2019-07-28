package typings.atPulumiAws.iamOpenIdConnectProviderMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider")
@js.native
class OpenIdConnectProvider protected () extends CustomResource {
  /**
    * Create a OpenIdConnectProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OpenIdConnectProviderArgs) = this()
  def this(name: String, args: OpenIdConnectProviderArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN assigned by AWS for this provider.
    */
  val arn: Output[String] = js.native
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
    */
  val clientIdLists: Output[js.Array[String]] = js.native
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: Output[js.Array[String]] = js.native
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider")
@js.native
object OpenIdConnectProvider extends js.Object {
  /**
    * Get an existing OpenIdConnectProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): OpenIdConnectProvider = js.native
  def get(name: String, id: Input[ID], state: OpenIdConnectProviderState): OpenIdConnectProvider = js.native
  def get(name: String, id: Input[ID], state: OpenIdConnectProviderState, opts: CustomResourceOptions): OpenIdConnectProvider = js.native
  /**
    * Returns true if the given object is an instance of OpenIdConnectProvider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/openIdConnectProvider.OpenIdConnectProvider */ Boolean = js.native
}

