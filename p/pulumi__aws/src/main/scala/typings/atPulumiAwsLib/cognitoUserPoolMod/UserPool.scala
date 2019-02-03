package typings
package atPulumiAwsLib.cognitoUserPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userPool", "UserPool")
@js.native
class UserPool protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UserPool resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: UserPoolArgs) = this()
  def this(name: java.lang.String, args: UserPoolArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_AllowAdminCreateUserOnly] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `username_attributes`.
    */
  val aliasAttributes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN of the user pool.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The date the user pool was created.
    */
  val creationDate: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ChallengeRequiredOnNewDevice]] = js.native
  /**
    * The Email Configuration.
    */
  val emailConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ReplyToEmailAddress]] = js.native
  /**
    * A string representing the email verification message. Must contain the `{####}` placeholder. **NOTE:** - If `email_verification_message` and `verification_message_template.email_message` are specified and the values are different, either one is prioritized and updated.
    */
  val emailVerificationMessage: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A string representing the email verification subject. **NOTE:** - If `email_verification_subject` and `verification_message_template.email_subject` are specified and the values are different, either one is prioritized and updated.
    */
  val emailVerificationSubject: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
    */
  val endpoint: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_CreateAuthChallenge] = js.native
  /**
    * The date the user pool was last modified.
    */
  val lastModifiedDate: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Set to enable multi-factor authentication. Must be one of the following values (ON, OFF, OPTIONAL)
    */
  val mfaConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the attribute.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_MinimumLength] = js.native
  /**
    * A container with the schema attributes of a user pool. Maximum of 50 attributes.
    */
  val schemas: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_AttributeDataType]]] = js.native
  /**
    * A string representing the SMS authentication message.
    */
  val smsAuthenticationMessage: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The SMS Configuration.
    */
  val smsConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ExternalId]] = js.native
  /**
    * A string representing the SMS verification message.
    */
  val smsVerificationMessage: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
    */
  val usernameAttributes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_DefaultEmailOption] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cognito/userPool", "UserPool")
@js.native
object UserPool extends js.Object {
  /**
    * Get an existing UserPool resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolMod.UserPoolState
  ): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolMod.UserPoolState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
}

