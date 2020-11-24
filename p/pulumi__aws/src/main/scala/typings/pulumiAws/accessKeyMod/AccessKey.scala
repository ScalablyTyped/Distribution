package typings.pulumiAws.accessKeyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  val encryptedSecret: Output_[String] = js.native
  
  /**
    * The fingerprint of the PGP key used to encrypt
    * the secret
    */
  val keyFingerprint: Output_[String] = js.native
  
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`, for use
    * in the `encryptedSecret` output attribute.
    */
  val pgpKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The secret access key. Note that this will be written
    * to the state file. If you use this, please protect your backend state file
    * judiciously. Alternatively, you may supply a `pgpKey` instead, which will
    * prevent the secret from being stored in plaintext, at the cost of preventing
    * the use of the secret key in automation.
    */
  val secret: Output_[String] = js.native
  
  /**
    * The secret access key converted into an SES SMTP
    * password by applying [AWS's documented Sigv4 conversion
    * algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert).
    * As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region)
    */
  val sesSmtpPasswordV4: Output_[String] = js.native
  
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: Output_[String] = js.native
  
  /**
    * The IAM user to associate with this access key.
    */
  val user: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AccessKey = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccessKey = js.native
  def get(name: String, id: Input[ID], state: AccessKeyState): AccessKey = js.native
  def get(name: String, id: Input[ID], state: AccessKeyState, opts: CustomResourceOptions): AccessKey = js.native
  
  /**
    * Returns true if the given object is an instance of AccessKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accessKey.AccessKey */ Boolean = js.native
}
