package typings
package atPulumiAwsLib.iamAccountPasswordPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy")
@js.native
class AccountPasswordPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a AccountPasswordPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: AccountPasswordPolicyArgs) = this()
  def this(name: java.lang.String, args: AccountPasswordPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether to allow users to change their own password
    */
  val allowUsersToChangePassword: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Indicates whether passwords in the account expire.
    * Returns `true` if `max_password_age` contains a value greater than `0`.
    * Returns `false` if it is `0` or _not present_.
    */
  val expirePasswords: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Whether users are prevented from setting a new password after their password has expired
    * (i.e. require administrator reset)
    */
  val hardExpiry: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The number of days that an user password is valid.
    */
  val maxPasswordAge: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Minimum length to require for user passwords.
    */
  val minimumPasswordLength: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The number of previous passwords that users are prevented from reusing.
    */
  val passwordReusePrevention: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Whether to require lowercase characters for user passwords.
    */
  val requireLowercaseCharacters: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Whether to require numbers for user passwords.
    */
  val requireNumbers: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Whether to require symbols for user passwords.
    */
  val requireSymbols: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Whether to require uppercase characters for user passwords.
    */
  val requireUppercaseCharacters: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy")
@js.native
object AccountPasswordPolicy extends js.Object {
  /**
    * Get an existing AccountPasswordPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicyState
  ): atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
  /**
    * Returns true if the given object is an instance of AccountPasswordPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountPasswordPolicy.AccountPasswordPolicy */ scala.Boolean = js.native
}

