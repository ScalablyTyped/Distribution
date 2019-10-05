package typings.atPulumiAws.cognitoUserPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.cognito.UserPoolAdminCreateUserConfig
import typings.atPulumiAws.typesInputMod.cognito.UserPoolDeviceConfiguration
import typings.atPulumiAws.typesInputMod.cognito.UserPoolEmailConfiguration
import typings.atPulumiAws.typesInputMod.cognito.UserPoolLambdaConfig
import typings.atPulumiAws.typesInputMod.cognito.UserPoolPasswordPolicy
import typings.atPulumiAws.typesInputMod.cognito.UserPoolSchema
import typings.atPulumiAws.typesInputMod.cognito.UserPoolSmsConfiguration
import typings.atPulumiAws.typesInputMod.cognito.UserPoolUserPoolAddOns
import typings.atPulumiAws.typesInputMod.cognito.UserPoolVerificationMessageTemplate
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolState extends js.Object {
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: js.UndefOr[Input[UserPoolAdminCreateUserConfig]] = js.undefined
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `usernameAttributes`.
    */
  val aliasAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN of the user pool.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The date the user pool was created.
    */
  val creationDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: js.UndefOr[Input[UserPoolDeviceConfiguration]] = js.undefined
  /**
    * The Email Configuration.
    */
  val emailConfiguration: js.UndefOr[Input[UserPoolEmailConfiguration]] = js.undefined
  /**
    * A string representing the email verification message. Conflicts with `verificationMessageTemplate` configuration block `emailMessage` argument.
    */
  val emailVerificationMessage: js.UndefOr[Input[String]] = js.undefined
  /**
    * A string representing the email verification subject. Conflicts with `verificationMessageTemplate` configuration block `emailSubject` argument.
    */
  val emailVerificationSubject: js.UndefOr[Input[String]] = js.undefined
  /**
    * The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: js.UndefOr[Input[UserPoolLambdaConfig]] = js.undefined
  /**
    * The date the user pool was last modified.
    */
  val lastModifiedDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * Set to enable multi-factor authentication. Must be one of the following values (ON, OFF, OPTIONAL)
    */
  val mfaConfiguration: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the attribute.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: js.UndefOr[Input[UserPoolPasswordPolicy]] = js.undefined
  /**
    * A container with the schema attributes of a user pool. Maximum of 50 attributes.
    */
  val schemas: js.UndefOr[Input[js.Array[Input[UserPoolSchema]]]] = js.undefined
  /**
    * A string representing the SMS authentication message.
    */
  val smsAuthenticationMessage: js.UndefOr[Input[String]] = js.undefined
  /**
    * The SMS Configuration.
    */
  val smsConfiguration: js.UndefOr[Input[UserPoolSmsConfiguration]] = js.undefined
  /**
    * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
    */
  val smsVerificationMessage: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Configuration block for user pool add-ons to enable user pool advanced security mode features.
    */
  val userPoolAddOns: js.UndefOr[Input[UserPoolUserPoolAddOns]] = js.undefined
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
    */
  val usernameAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: js.UndefOr[Input[UserPoolVerificationMessageTemplate]] = js.undefined
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
    tags: Input[StringDictionary[_]] = null,
    userPoolAddOns: Input[UserPoolUserPoolAddOns] = null,
    usernameAttributes: Input[js.Array[Input[String]]] = null,
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
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userPoolAddOns != null) __obj.updateDynamic("userPoolAddOns")(userPoolAddOns.asInstanceOf[js.Any])
    if (usernameAttributes != null) __obj.updateDynamic("usernameAttributes")(usernameAttributes.asInstanceOf[js.Any])
    if (verificationMessageTemplate != null) __obj.updateDynamic("verificationMessageTemplate")(verificationMessageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolState]
  }
}

