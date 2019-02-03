package typings
package atPulumiAwsLib.iamUserLoginProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile")
@js.native
class UserLoginProfile protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UserLoginProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: UserLoginProfileArgs) = this()
  def this(name: java.lang.String, args: UserLoginProfileArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The encrypted password, base64 encoded.
    */
  val encryptedPassword: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt
    * the password
    */
  val keyFingerprint: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The length of the generated
    * password.
    */
  val passwordLength: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Whether the
    * user should be forced to reset the generated password on first login.
    */
  val passwordResetRequired: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:username`.
    */
  val pgpKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The IAM user's name.
    */
  val user: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfile = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfileState
  ): atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfile = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfileState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfile = js.native
}

