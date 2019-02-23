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
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ReplyToEmailAddressSourceArn]
  ] = js.undefined
  /**
    * A string representing the email verification message. Must contain the `{####}` placeholder. **NOTE:** - If `email_verification_message` and `verification_message_template.email_message` are specified and the values are different, either one is prioritized and updated.
    */
  val emailVerificationMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A string representing the email verification subject. **NOTE:** - If `email_verification_subject` and `verification_message_template.email_subject` are specified and the values are different, either one is prioritized and updated.
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
    * A string representing the SMS verification message.
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

