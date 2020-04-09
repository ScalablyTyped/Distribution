package typings.pulumiAws.userPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cognito.UserPoolAdminCreateUserConfig
import typings.pulumiAws.inputMod.cognito.UserPoolDeviceConfiguration
import typings.pulumiAws.inputMod.cognito.UserPoolEmailConfiguration
import typings.pulumiAws.inputMod.cognito.UserPoolLambdaConfig
import typings.pulumiAws.inputMod.cognito.UserPoolPasswordPolicy
import typings.pulumiAws.inputMod.cognito.UserPoolSchema
import typings.pulumiAws.inputMod.cognito.UserPoolSmsConfiguration
import typings.pulumiAws.inputMod.cognito.UserPoolSoftwareTokenMfaConfiguration
import typings.pulumiAws.inputMod.cognito.UserPoolUserPoolAddOns
import typings.pulumiAws.inputMod.cognito.UserPoolUsernameConfiguration
import typings.pulumiAws.inputMod.cognito.UserPoolVerificationMessageTemplate
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolState extends js.Object {
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: js.UndefOr[Input[UserPoolAdminCreateUserConfig]] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `usernameAttributes`.
    */
  val aliasAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of the user pool.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The date the user pool was created.
    */
  val creationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: js.UndefOr[Input[UserPoolDeviceConfiguration]] = js.native
  /**
    * The Email Configuration.
    */
  val emailConfiguration: js.UndefOr[Input[UserPoolEmailConfiguration]] = js.native
  /**
    * A string representing the email verification message. Conflicts with `verificationMessageTemplate` configuration block `emailMessage` argument.
    */
  val emailVerificationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * A string representing the email verification subject. Conflicts with `verificationMessageTemplate` configuration block `emailSubject` argument.
    */
  val emailVerificationSubject: js.UndefOr[Input[String]] = js.native
  /**
    * The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: js.UndefOr[Input[UserPoolLambdaConfig]] = js.native
  /**
    * The date the user pool was last modified.
    */
  val lastModifiedDate: js.UndefOr[Input[String]] = js.native
  /**
    * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
    */
  val mfaConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the attribute.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: js.UndefOr[Input[UserPoolPasswordPolicy]] = js.native
  /**
    * A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
    */
  val schemas: js.UndefOr[Input[js.Array[Input[UserPoolSchema]]]] = js.native
  /**
    * A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
    */
  val smsAuthenticationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
    */
  val smsConfiguration: js.UndefOr[Input[UserPoolSmsConfiguration]] = js.native
  /**
    * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
    */
  val smsVerificationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
    */
  val softwareTokenMfaConfiguration: js.UndefOr[Input[UserPoolSoftwareTokenMfaConfiguration]] = js.native
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration block for user pool add-ons to enable user pool advanced security mode features.
    */
  val userPoolAddOns: js.UndefOr[Input[UserPoolUserPoolAddOns]] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
    */
  val usernameAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The Username Configuration.
    */
  val usernameConfiguration: js.UndefOr[Input[UserPoolUsernameConfiguration]] = js.native
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: js.UndefOr[Input[UserPoolVerificationMessageTemplate]] = js.native
}

object UserPoolState {
  @scala.inline
  def apply(
    adminCreateUserConfig: Input[UserPoolAdminCreateUserConfig] = null,
    aliasAttributes: Input[js.Array[Input[String]]] = null,
    arn: Input[String] = null,
    autoVerifiedAttributes: Input[js.Array[Input[String]]] = null,
    creationDate: Input[String] = null,
    deviceConfiguration: Input[UserPoolDeviceConfiguration] = null,
    emailConfiguration: Input[UserPoolEmailConfiguration] = null,
    emailVerificationMessage: Input[String] = null,
    emailVerificationSubject: Input[String] = null,
    endpoint: Input[String] = null,
    lambdaConfig: Input[UserPoolLambdaConfig] = null,
    lastModifiedDate: Input[String] = null,
    mfaConfiguration: Input[String] = null,
    name: Input[String] = null,
    passwordPolicy: Input[UserPoolPasswordPolicy] = null,
    schemas: Input[js.Array[Input[UserPoolSchema]]] = null,
    smsAuthenticationMessage: Input[String] = null,
    smsConfiguration: Input[UserPoolSmsConfiguration] = null,
    smsVerificationMessage: Input[String] = null,
    softwareTokenMfaConfiguration: Input[UserPoolSoftwareTokenMfaConfiguration] = null,
    tags: Input[StringDictionary[_]] = null,
    userPoolAddOns: Input[UserPoolUserPoolAddOns] = null,
    usernameAttributes: Input[js.Array[Input[String]]] = null,
    usernameConfiguration: Input[UserPoolUsernameConfiguration] = null,
    verificationMessageTemplate: Input[UserPoolVerificationMessageTemplate] = null
  ): UserPoolState = {
    val __obj = js.Dynamic.literal()
    if (adminCreateUserConfig != null) __obj.updateDynamic("adminCreateUserConfig")(adminCreateUserConfig.asInstanceOf[js.Any])
    if (aliasAttributes != null) __obj.updateDynamic("aliasAttributes")(aliasAttributes.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (autoVerifiedAttributes != null) __obj.updateDynamic("autoVerifiedAttributes")(autoVerifiedAttributes.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (deviceConfiguration != null) __obj.updateDynamic("deviceConfiguration")(deviceConfiguration.asInstanceOf[js.Any])
    if (emailConfiguration != null) __obj.updateDynamic("emailConfiguration")(emailConfiguration.asInstanceOf[js.Any])
    if (emailVerificationMessage != null) __obj.updateDynamic("emailVerificationMessage")(emailVerificationMessage.asInstanceOf[js.Any])
    if (emailVerificationSubject != null) __obj.updateDynamic("emailVerificationSubject")(emailVerificationSubject.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (mfaConfiguration != null) __obj.updateDynamic("mfaConfiguration")(mfaConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (passwordPolicy != null) __obj.updateDynamic("passwordPolicy")(passwordPolicy.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (smsAuthenticationMessage != null) __obj.updateDynamic("smsAuthenticationMessage")(smsAuthenticationMessage.asInstanceOf[js.Any])
    if (smsConfiguration != null) __obj.updateDynamic("smsConfiguration")(smsConfiguration.asInstanceOf[js.Any])
    if (smsVerificationMessage != null) __obj.updateDynamic("smsVerificationMessage")(smsVerificationMessage.asInstanceOf[js.Any])
    if (softwareTokenMfaConfiguration != null) __obj.updateDynamic("softwareTokenMfaConfiguration")(softwareTokenMfaConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userPoolAddOns != null) __obj.updateDynamic("userPoolAddOns")(userPoolAddOns.asInstanceOf[js.Any])
    if (usernameAttributes != null) __obj.updateDynamic("usernameAttributes")(usernameAttributes.asInstanceOf[js.Any])
    if (usernameConfiguration != null) __obj.updateDynamic("usernameConfiguration")(usernameConfiguration.asInstanceOf[js.Any])
    if (verificationMessageTemplate != null) __obj.updateDynamic("verificationMessageTemplate")(verificationMessageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolState]
  }
}

