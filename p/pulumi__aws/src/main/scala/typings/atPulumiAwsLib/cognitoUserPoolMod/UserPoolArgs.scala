package typings
package atPulumiAwsLib.cognitoUserPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolArgs extends js.Object {
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowAdminCreateUserOnlyInviteMessageTemplate]
  ] = js.undefined
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `username_attributes`.
    */
  val aliasAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ChallengeRequiredOnNewDeviceDeviceOnlyRememberedOnUserPrompt]
  ] = js.undefined
  /**
    * The Email Configuration.
    */
  val emailConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EmailSendingAccountReplyToEmailAddress]
  ] = js.undefined
  /**
    * A string representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
    */
  val emailVerificationMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A string representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
    */
  val emailVerificationSubject: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CreateAuthChallengeCustomMessage]
  ] = js.undefined
  /**
    * Set to enable multi-factor authentication. Must be one of the following values (ON, OFF, OPTIONAL)
    */
  val mfaConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the attribute.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MinimumLengthRequireLowercase]
  ] = js.undefined
  /**
    * A container with the schema attributes of a user pool. Maximum of 50 attributes.
    */
  val schemas: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttributeDataTypeDeveloperOnlyAttribute]
      ]
    ]
  ] = js.undefined
  /**
    * A string representing the SMS authentication message.
    */
  val smsAuthenticationMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The SMS Configuration.
    */
  val smsConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExternalIdSnsCallerArn]] = js.undefined
  /**
    * A string representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
    */
  val smsVerificationMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Configuration block for user pool add-ons to enable user pool advanced security mode features.
    */
  val userPoolAddOns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdvancedSecurityModeInput]] = js.undefined
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
    */
  val usernameAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultEmailOptionEmailMessage]
  ] = js.undefined
}

object UserPoolArgs {
  @scala.inline
  def apply(
    adminCreateUserConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowAdminCreateUserOnlyInviteMessageTemplate] = null,
    aliasAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    autoVerifiedAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    deviceConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ChallengeRequiredOnNewDeviceDeviceOnlyRememberedOnUserPrompt] = null,
    emailConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EmailSendingAccountReplyToEmailAddress] = null,
    emailVerificationMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    emailVerificationSubject: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lambdaConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CreateAuthChallengeCustomMessage] = null,
    mfaConfiguration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    passwordPolicy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MinimumLengthRequireLowercase] = null,
    schemas: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttributeDataTypeDeveloperOnlyAttribute]
      ]
    ] = null,
    smsAuthenticationMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    smsConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExternalIdSnsCallerArn] = null,
    smsVerificationMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    userPoolAddOns: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdvancedSecurityModeInput] = null,
    usernameAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    verificationMessageTemplate: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultEmailOptionEmailMessage] = null
  ): UserPoolArgs = {
    val __obj = js.Dynamic.literal()
    if (adminCreateUserConfig != null) __obj.updateDynamic("adminCreateUserConfig")(adminCreateUserConfig.asInstanceOf[js.Any])
    if (aliasAttributes != null) __obj.updateDynamic("aliasAttributes")(aliasAttributes.asInstanceOf[js.Any])
    if (autoVerifiedAttributes != null) __obj.updateDynamic("autoVerifiedAttributes")(autoVerifiedAttributes.asInstanceOf[js.Any])
    if (deviceConfiguration != null) __obj.updateDynamic("deviceConfiguration")(deviceConfiguration.asInstanceOf[js.Any])
    if (emailConfiguration != null) __obj.updateDynamic("emailConfiguration")(emailConfiguration.asInstanceOf[js.Any])
    if (emailVerificationMessage != null) __obj.updateDynamic("emailVerificationMessage")(emailVerificationMessage.asInstanceOf[js.Any])
    if (emailVerificationSubject != null) __obj.updateDynamic("emailVerificationSubject")(emailVerificationSubject.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[UserPoolArgs]
  }
}

