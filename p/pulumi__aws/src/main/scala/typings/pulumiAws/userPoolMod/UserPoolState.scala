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
    * A map of tags to assign to the User Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
  def apply(): UserPoolState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolState]
  }
  @scala.inline
  implicit class UserPoolStateOps[Self <: UserPoolState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminCreateUserConfig(value: Input[UserPoolAdminCreateUserConfig]): Self = this.set("adminCreateUserConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminCreateUserConfig: Self = this.set("adminCreateUserConfig", js.undefined)
    @scala.inline
    def setAliasAttributesVarargs(value: Input[String]*): Self = this.set("aliasAttributes", js.Array(value :_*))
    @scala.inline
    def setAliasAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("aliasAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasAttributes: Self = this.set("aliasAttributes", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAutoVerifiedAttributesVarargs(value: Input[String]*): Self = this.set("autoVerifiedAttributes", js.Array(value :_*))
    @scala.inline
    def setAutoVerifiedAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("autoVerifiedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoVerifiedAttributes: Self = this.set("autoVerifiedAttributes", js.undefined)
    @scala.inline
    def setCreationDate(value: Input[String]): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDeviceConfiguration(value: Input[UserPoolDeviceConfiguration]): Self = this.set("deviceConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceConfiguration: Self = this.set("deviceConfiguration", js.undefined)
    @scala.inline
    def setEmailConfiguration(value: Input[UserPoolEmailConfiguration]): Self = this.set("emailConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailConfiguration: Self = this.set("emailConfiguration", js.undefined)
    @scala.inline
    def setEmailVerificationMessage(value: Input[String]): Self = this.set("emailVerificationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailVerificationMessage: Self = this.set("emailVerificationMessage", js.undefined)
    @scala.inline
    def setEmailVerificationSubject(value: Input[String]): Self = this.set("emailVerificationSubject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailVerificationSubject: Self = this.set("emailVerificationSubject", js.undefined)
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setLambdaConfig(value: Input[UserPoolLambdaConfig]): Self = this.set("lambdaConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaConfig: Self = this.set("lambdaConfig", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Input[String]): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setMfaConfiguration(value: Input[String]): Self = this.set("mfaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMfaConfiguration: Self = this.set("mfaConfiguration", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPasswordPolicy(value: Input[UserPoolPasswordPolicy]): Self = this.set("passwordPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPolicy: Self = this.set("passwordPolicy", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: Input[UserPoolSchema]*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: Input[js.Array[Input[UserPoolSchema]]]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    @scala.inline
    def setSmsAuthenticationMessage(value: Input[String]): Self = this.set("smsAuthenticationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsAuthenticationMessage: Self = this.set("smsAuthenticationMessage", js.undefined)
    @scala.inline
    def setSmsConfiguration(value: Input[UserPoolSmsConfiguration]): Self = this.set("smsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsConfiguration: Self = this.set("smsConfiguration", js.undefined)
    @scala.inline
    def setSmsVerificationMessage(value: Input[String]): Self = this.set("smsVerificationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsVerificationMessage: Self = this.set("smsVerificationMessage", js.undefined)
    @scala.inline
    def setSoftwareTokenMfaConfiguration(value: Input[UserPoolSoftwareTokenMfaConfiguration]): Self = this.set("softwareTokenMfaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareTokenMfaConfiguration: Self = this.set("softwareTokenMfaConfiguration", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUserPoolAddOns(value: Input[UserPoolUserPoolAddOns]): Self = this.set("userPoolAddOns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolAddOns: Self = this.set("userPoolAddOns", js.undefined)
    @scala.inline
    def setUsernameAttributesVarargs(value: Input[String]*): Self = this.set("usernameAttributes", js.Array(value :_*))
    @scala.inline
    def setUsernameAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("usernameAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameAttributes: Self = this.set("usernameAttributes", js.undefined)
    @scala.inline
    def setUsernameConfiguration(value: Input[UserPoolUsernameConfiguration]): Self = this.set("usernameConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameConfiguration: Self = this.set("usernameConfiguration", js.undefined)
    @scala.inline
    def setVerificationMessageTemplate(value: Input[UserPoolVerificationMessageTemplate]): Self = this.set("verificationMessageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationMessageTemplate: Self = this.set("verificationMessageTemplate", js.undefined)
  }
  
}

