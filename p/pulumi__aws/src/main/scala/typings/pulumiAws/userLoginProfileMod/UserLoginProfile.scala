package typings.pulumiAws.userLoginProfileMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile")
@js.native
class UserLoginProfile protected () extends CustomResource {
  /**
    * Create a UserLoginProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserLoginProfileArgs) = this()
  def this(name: String, args: UserLoginProfileArgs, opts: CustomResourceOptions) = this()
  /**
    * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
    */
  val encryptedPassword: Output_[String] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
    */
  val keyFingerprint: Output_[String] = js.native
  /**
    * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordLength: Output_[js.UndefOr[Double]] = js.native
  /**
    * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordResetRequired: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val pgpKey: Output_[String] = js.native
  /**
    * The IAM user's name.
    */
  val user: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile")
@js.native
object UserLoginProfile extends js.Object {
  /**
    * Get an existing UserLoginProfile resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): UserLoginProfile = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserLoginProfile = js.native
  def get(name: String, id: Input[ID], state: UserLoginProfileState): UserLoginProfile = js.native
  def get(name: String, id: Input[ID], state: UserLoginProfileState, opts: CustomResourceOptions): UserLoginProfile = js.native
  /**
    * Returns true if the given object is an instance of UserLoginProfile.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userLoginProfile.UserLoginProfile */ Boolean = js.native
}

