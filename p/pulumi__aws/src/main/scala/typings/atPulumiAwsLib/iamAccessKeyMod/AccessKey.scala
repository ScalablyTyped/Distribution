package typings
package atPulumiAwsLib.iamAccessKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/accessKey", "AccessKey")
@js.native
class AccessKey protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a AccessKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: AccessKeyArgs) = this()
  def this(name: java.lang.String, args: AccessKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The encrypted secret, base64 encoded.
    * > **NOTE:** The encrypted secret may be decrypted using the command line,
    * for example: `terraform output encrypted_secret | base64 --decode | keybase pgp decrypt`.
    */
  val encryptedSecret: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt
    * the secret
    */
  val keyFingerprint: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`.
    */
  val pgpKey: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The secret access key. Note that this will be written
    * to the state file. Please supply a `pgp_key` instead, which will prevent the
    * secret from being stored in plain text
    */
  val secret: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The secret access key converted into an SES SMTP
    * password by applying [AWS's documented conversion
    * algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert).
    */
  val sesSmtpPassword: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * "Active" or "Inactive". Keys are initially active, but can be made
    * inactive by other means.
    */
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The IAM user to associate with this access key.
    */
  val user: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamAccessKeyMod.AccessKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamAccessKeyMod.AccessKeyState
  ): atPulumiAwsLib.iamAccessKeyMod.AccessKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamAccessKeyMod.AccessKeyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamAccessKeyMod.AccessKey = js.native
}

