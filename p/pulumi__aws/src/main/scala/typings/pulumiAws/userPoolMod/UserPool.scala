package typings.pulumiAws.userPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cognito.UserPoolAdminCreateUserConfig
import typings.pulumiAws.outputMod.cognito.UserPoolDeviceConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolEmailConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolLambdaConfig
import typings.pulumiAws.outputMod.cognito.UserPoolPasswordPolicy
import typings.pulumiAws.outputMod.cognito.UserPoolSchema
import typings.pulumiAws.outputMod.cognito.UserPoolSmsConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolUserPoolAddOns
import typings.pulumiAws.outputMod.cognito.UserPoolVerificationMessageTemplate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userPool", "UserPool")
@js.native
class UserPool protected () extends CustomResource {
  /**
    * Create a UserPool resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: UserPoolArgs) = this()
  def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: Output_[UserPoolAdminCreateUserConfig] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `usernameAttributes`.
    */
  val aliasAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ARN of the user pool.
    */
  val arn: Output_[String] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The date the user pool was created.
    */
  val creationDate: Output_[String] = js.native
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: Output_[js.UndefOr[UserPoolDeviceConfiguration]] = js.native
  /**
    * The Email Configuration.
    */
  val emailConfiguration: Output_[js.UndefOr[UserPoolEmailConfiguration]] = js.native
  /**
    * A string representing the email verification message. Conflicts with `verificationMessageTemplate` configuration block `emailMessage` argument.
    */
  val emailVerificationMessage: Output_[String] = js.native
  /**
    * A string representing the email verification subject. Conflicts with `verificationMessageTemplate` configuration block `emailSubject` argument.
    */
  val emailVerificationSubject: Output_[String] = js.native
  /**
    * The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
    */
  val endpoint: Output_[String] = js.native
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: Output_[UserPoolLambdaConfig] = js.native
  /**
    * The date the user pool was last modified.
    */
  val lastModifiedDate: Output_[String] = js.native
  /**
    * Set to enable multi-factor authentication. Must be one of the following values (ON, OFF, OPTIONAL)
    */
  val mfaConfiguration: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the attribute.
    */
  val name: Output_[String] = js.native
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: Output_[UserPoolPasswordPolicy] = js.native
  /**
    * A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
    */
  val schemas: Output_[js.UndefOr[js.Array[UserPoolSchema]]] = js.native
  /**
    * A string representing the SMS authentication message.
    */
  val smsAuthenticationMessage: Output_[js.UndefOr[String]] = js.native
  /**
    * The SMS Configuration.
    */
  val smsConfiguration: Output_[js.UndefOr[UserPoolSmsConfiguration]] = js.native
  /**
    * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
    */
  val smsVerificationMessage: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Configuration block for user pool add-ons to enable user pool advanced security mode features.
    */
  val userPoolAddOns: Output_[js.UndefOr[UserPoolUserPoolAddOns]] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
    */
  val usernameAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: Output_[UserPoolVerificationMessageTemplate] = js.native
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
  def get(name: String, id: Input[ID]): UserPool = js.native
  def get(name: String, id: Input[ID], state: UserPoolState): UserPool = js.native
  def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): UserPool = js.native
  /**
    * Returns true if the given object is an instance of UserPool.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
}

