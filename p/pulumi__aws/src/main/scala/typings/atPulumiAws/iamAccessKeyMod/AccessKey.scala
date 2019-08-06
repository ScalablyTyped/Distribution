package typings.atPulumiAws.iamAccessKeyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/accessKey", "AccessKey")
@js.native
class AccessKey protected () extends CustomResource {
  /**
    * Create a AccessKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccessKeyArgs) = this()
  def this(name: String, args: AccessKeyArgs, opts: CustomResourceOptions) = this()
  /**
    * The encrypted secret, base64 encoded.
    * > **NOTE:** The encrypted secret may be decrypted using the command line,
    * for example: `... | base64 --decode | keybase pgp decrypt`.
    */
  val encryptedSecret: Output[String] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt
    * the secret
    */
  val keyFingerprint: Output[String] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`.
    */
  val pgpKey: Output[js.UndefOr[String]] = js.native
  /**
    * The secret access key. Note that this will be written
    * to the state file. Please supply a `pgp_key` instead, which will prevent the
    * secret from being stored in plain text
    */
  val secret: Output[String] = js.native
  /**
    * The secret access key converted into an SES SMTP
    * password by applying [AWS's documented conversion
    * algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert).
    */
  val sesSmtpPassword: Output[String] = js.native
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: Output[String] = js.native
  /**
    * The IAM user to associate with this access key.
    */
  val user: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/accessKey", "AccessKey")
@js.native
object AccessKey extends js.Object {
  /**
    * Get an existing AccessKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): AccessKey = js.native
  def get(name: String, id: Input[ID], state: AccessKeyState): AccessKey = js.native
  def get(name: String, id: Input[ID], state: AccessKeyState, opts: CustomResourceOptions): AccessKey = js.native
  /**
    * Returns true if the given object is an instance of AccessKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accessKey.AccessKey */ Boolean = js.native
}

