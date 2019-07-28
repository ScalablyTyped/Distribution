package typings.atPulumiAws.secretsmanagerSecretVersionMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion")
@js.native
class SecretVersion protected () extends CustomResource {
  /**
    * Create a SecretVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SecretVersionArgs) = this()
  def this(name: String, args: SecretVersionArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the secret.
    */
  val arn: Output[String] = js.native
  /**
    * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
    */
  val secretBinary: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: Output[String] = js.native
  /**
    * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
    */
  val secretString: Output[js.UndefOr[String]] = js.native
  /**
    * The unique identifier of the version of the secret.
    */
  val versionId: Output[String] = js.native
  /**
    * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
    */
  val versionStages: Output[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/secretsmanager/secretVersion", "SecretVersion")
@js.native
object SecretVersion extends js.Object {
  /**
    * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SecretVersion = js.native
  def get(name: String, id: Input[ID], state: SecretVersionState): SecretVersion = js.native
  def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): SecretVersion = js.native
  /**
    * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
}

