package typings.atPulumiAws.transferServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_VpcEndpointId
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/transfer/server", "Server")
@js.native
class Server protected () extends CustomResource {
  /**
    * Create a Server resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ServerArgs) = this()
  def this(name: String, args: ServerArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of Transfer Server
    */
  val arn: Output[String] = js.native
  /**
    * The endpoint of the Transfer Server (e.g. `s-12345678.server.transfer.REGION.amazonaws.com`)
    */
  val endpoint: Output[String] = js.native
  /**
    * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
    */
  val endpointDetails: Output[js.UndefOr[Anon_VpcEndpointId]] = js.native
  /**
    * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC_ENDPOINT`, your SFTP server isn't accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.
    */
  val endpointType: Output[js.UndefOr[String]] = js.native
  /**
    * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`.
    */
  val forceDestroy: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
    */
  val identityProviderType: Output[js.UndefOr[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
    */
  val invocationRole: Output[js.UndefOr[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
    */
  val loggingRole: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * - URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
    */
  val url: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/transfer/server", "Server")
@js.native
object Server extends js.Object {
  /**
    * Get an existing Server resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Server = js.native
  def get(name: String, id: Input[ID], state: ServerState): Server = js.native
  def get(name: String, id: Input[ID], state: ServerState, opts: CustomResourceOptions): Server = js.native
  /**
    * Returns true if the given object is an instance of Server.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean = js.native
}

