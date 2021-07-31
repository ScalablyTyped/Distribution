package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cognito.UserPoolAdminCreateUserConfig
import typings.pulumiAws.outputMod.cognito.UserPoolDeviceConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolEmailConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolLambdaConfig
import typings.pulumiAws.outputMod.cognito.UserPoolPasswordPolicy
import typings.pulumiAws.outputMod.cognito.UserPoolSchema
import typings.pulumiAws.outputMod.cognito.UserPoolSmsConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolSoftwareTokenMfaConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolUserPoolAddOns
import typings.pulumiAws.outputMod.cognito.UserPoolUsernameConfiguration
import typings.pulumiAws.outputMod.cognito.UserPoolVerificationMessageTemplate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPoolMod {
  
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
      * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
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
      * A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
      */
    val smsAuthenticationMessage: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
      */
    val smsConfiguration: Output_[UserPoolSmsConfiguration] = js.native
    
    /**
      * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
      */
    val smsVerificationMessage: Output_[String] = js.native
    
    /**
      * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
      */
    val softwareTokenMfaConfiguration: Output_[js.UndefOr[UserPoolSoftwareTokenMfaConfiguration]] = js.native
    
    /**
      * A map of tags to assign to the User Pool.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Configuration block for user pool add-ons to enable user pool advanced security mode features.
      */
    val userPoolAddOns: Output_[js.UndefOr[UserPoolUserPoolAddOns]] = js.native
    
    /**
      * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
      */
    val usernameAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The Username Configuration.
      */
    val usernameConfiguration: Output_[js.UndefOr[UserPoolUsernameConfiguration]] = js.native
    
    /**
      * The verification message templates configuration.
      */
    val verificationMessageTemplate: Output_[UserPoolVerificationMessageTemplate] = js.native
  }
  /* static members */
  object UserPool {
    
    @JSImport("@pulumi/aws/cognito/userPool", "UserPool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UserPool]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPool]
    @scala.inline
    def get(name: String, id: Input[ID], state: UserPoolState): UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UserPool]
    @scala.inline
    def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPool]
    
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean]
  }
  
  trait UserPoolArgs extends StObject {
    
    /**
      * The configuration for AdminCreateUser requests.
      */
    val adminCreateUserConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolAdminCreateUserConfig]] = js.undefined
    
    /**
      * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `usernameAttributes`.
      */
    val aliasAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The attributes to be auto-verified. Possible values: email, phone_number.
      */
    val autoVerifiedAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The configuration for the user pool's device tracking.
      */
    val deviceConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolDeviceConfiguration]] = js.undefined
    
    /**
      * The Email Configuration.
      */
    val emailConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolEmailConfiguration]] = js.undefined
    
    /**
      * A string representing the email verification message. Conflicts with `verificationMessageTemplate` configuration block `emailMessage` argument.
      */
    val emailVerificationMessage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A string representing the email verification subject. Conflicts with `verificationMessageTemplate` configuration block `emailSubject` argument.
      */
    val emailVerificationSubject: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A container for the AWS Lambda triggers associated with the user pool.
      */
    val lambdaConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolLambdaConfig]] = js.undefined
    
    /**
      * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
      */
    val mfaConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the attribute.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A container for information about the user pool password policy.
      */
    val passwordPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolPasswordPolicy]] = js.undefined
    
    /**
      * A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
      */
    val schemas: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.UserPoolSchema]]]] = js.undefined
    
    /**
      * A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
      */
    val smsAuthenticationMessage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
      */
    val smsConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolSmsConfiguration]] = js.undefined
    
    /**
      * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
      */
    val smsVerificationMessage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
      */
    val softwareTokenMfaConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolSoftwareTokenMfaConfiguration]] = js.undefined
    
    /**
      * A map of tags to assign to the User Pool.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration block for user pool add-ons to enable user pool advanced security mode features.
      */
    val userPoolAddOns: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolUserPoolAddOns]] = js.undefined
    
    /**
      * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
      */
    val usernameAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Username Configuration.
      */
    val usernameConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolUsernameConfiguration]] = js.undefined
    
    /**
      * The verification message templates configuration.
      */
    val verificationMessageTemplate: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolVerificationMessageTemplate]] = js.undefined
  }
  object UserPoolArgs {
    
    @scala.inline
    def apply(): UserPoolArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPoolArgs]
    }
    
    @scala.inline
    implicit class UserPoolArgsMutableBuilder[Self <: UserPoolArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminCreateUserConfig(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolAdminCreateUserConfig]): Self = StObject.set(x, "adminCreateUserConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "adminCreateUserConfig", js.undefined)
      
      @scala.inline
      def setAliasAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "aliasAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasAttributesUndefined: Self = StObject.set(x, "aliasAttributes", js.undefined)
      
      @scala.inline
      def setAliasAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "aliasAttributes", js.Array(value :_*))
      
      @scala.inline
      def setAutoVerifiedAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoVerifiedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "autoVerifiedAttributes", js.undefined)
      
      @scala.inline
      def setAutoVerifiedAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "autoVerifiedAttributes", js.Array(value :_*))
      
      @scala.inline
      def setDeviceConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolDeviceConfiguration]): Self = StObject.set(x, "deviceConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceConfigurationUndefined: Self = StObject.set(x, "deviceConfiguration", js.undefined)
      
      @scala.inline
      def setEmailConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolEmailConfiguration]): Self = StObject.set(x, "emailConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailConfigurationUndefined: Self = StObject.set(x, "emailConfiguration", js.undefined)
      
      @scala.inline
      def setEmailVerificationMessage(value: Input[String]): Self = StObject.set(x, "emailVerificationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailVerificationMessageUndefined: Self = StObject.set(x, "emailVerificationMessage", js.undefined)
      
      @scala.inline
      def setEmailVerificationSubject(value: Input[String]): Self = StObject.set(x, "emailVerificationSubject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailVerificationSubjectUndefined: Self = StObject.set(x, "emailVerificationSubject", js.undefined)
      
      @scala.inline
      def setLambdaConfig(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolLambdaConfig]): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
      
      @scala.inline
      def setMfaConfiguration(value: Input[String]): Self = StObject.set(x, "mfaConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfaConfigurationUndefined: Self = StObject.set(x, "mfaConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPasswordPolicy(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolPasswordPolicy]): Self = StObject.set(x, "passwordPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordPolicyUndefined: Self = StObject.set(x, "passwordPolicy", js.undefined)
      
      @scala.inline
      def setSchemas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.UserPoolSchema]]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      @scala.inline
      def setSchemasVarargs(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolSchema]*): Self = StObject.set(x, "schemas", js.Array(value :_*))
      
      @scala.inline
      def setSmsAuthenticationMessage(value: Input[String]): Self = StObject.set(x, "smsAuthenticationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "smsAuthenticationMessage", js.undefined)
      
      @scala.inline
      def setSmsConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolSmsConfiguration]): Self = StObject.set(x, "smsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsConfigurationUndefined: Self = StObject.set(x, "smsConfiguration", js.undefined)
      
      @scala.inline
      def setSmsVerificationMessage(value: Input[String]): Self = StObject.set(x, "smsVerificationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsVerificationMessageUndefined: Self = StObject.set(x, "smsVerificationMessage", js.undefined)
      
      @scala.inline
      def setSoftwareTokenMfaConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolSoftwareTokenMfaConfiguration]): Self = StObject.set(x, "softwareTokenMfaConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftwareTokenMfaConfigurationUndefined: Self = StObject.set(x, "softwareTokenMfaConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserPoolAddOns(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolUserPoolAddOns]): Self = StObject.set(x, "userPoolAddOns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolAddOnsUndefined: Self = StObject.set(x, "userPoolAddOns", js.undefined)
      
      @scala.inline
      def setUsernameAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "usernameAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameAttributesUndefined: Self = StObject.set(x, "usernameAttributes", js.undefined)
      
      @scala.inline
      def setUsernameAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "usernameAttributes", js.Array(value :_*))
      
      @scala.inline
      def setUsernameConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolUsernameConfiguration]): Self = StObject.set(x, "usernameConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameConfigurationUndefined: Self = StObject.set(x, "usernameConfiguration", js.undefined)
      
      @scala.inline
      def setVerificationMessageTemplate(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolVerificationMessageTemplate]): Self = StObject.set(x, "verificationMessageTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "verificationMessageTemplate", js.undefined)
    }
  }
  
  trait UserPoolState extends StObject {
    
    /**
      * The configuration for AdminCreateUser requests.
      */
    val adminCreateUserConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolAdminCreateUserConfig]] = js.undefined
    
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
    val deviceConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolDeviceConfiguration]] = js.undefined
    
    /**
      * The Email Configuration.
      */
    val emailConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolEmailConfiguration]] = js.undefined
    
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
    val lambdaConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolLambdaConfig]] = js.undefined
    
    /**
      * The date the user pool was last modified.
      */
    val lastModifiedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
      */
    val mfaConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the attribute.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A container for information about the user pool password policy.
      */
    val passwordPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolPasswordPolicy]] = js.undefined
    
    /**
      * A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
      */
    val schemas: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.UserPoolSchema]]]] = js.undefined
    
    /**
      * A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
      */
    val smsAuthenticationMessage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
      */
    val smsConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolSmsConfiguration]] = js.undefined
    
    /**
      * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
      */
    val smsVerificationMessage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
      */
    val softwareTokenMfaConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolSoftwareTokenMfaConfiguration]] = js.undefined
    
    /**
      * A map of tags to assign to the User Pool.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration block for user pool add-ons to enable user pool advanced security mode features.
      */
    val userPoolAddOns: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolUserPoolAddOns]] = js.undefined
    
    /**
      * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
      */
    val usernameAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Username Configuration.
      */
    val usernameConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolUsernameConfiguration]] = js.undefined
    
    /**
      * The verification message templates configuration.
      */
    val verificationMessageTemplate: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolVerificationMessageTemplate]] = js.undefined
  }
  object UserPoolState {
    
    @scala.inline
    def apply(): UserPoolState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPoolState]
    }
    
    @scala.inline
    implicit class UserPoolStateMutableBuilder[Self <: UserPoolState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminCreateUserConfig(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolAdminCreateUserConfig]): Self = StObject.set(x, "adminCreateUserConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "adminCreateUserConfig", js.undefined)
      
      @scala.inline
      def setAliasAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "aliasAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasAttributesUndefined: Self = StObject.set(x, "aliasAttributes", js.undefined)
      
      @scala.inline
      def setAliasAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "aliasAttributes", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoVerifiedAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoVerifiedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "autoVerifiedAttributes", js.undefined)
      
      @scala.inline
      def setAutoVerifiedAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "autoVerifiedAttributes", js.Array(value :_*))
      
      @scala.inline
      def setCreationDate(value: Input[String]): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setDeviceConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolDeviceConfiguration]): Self = StObject.set(x, "deviceConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceConfigurationUndefined: Self = StObject.set(x, "deviceConfiguration", js.undefined)
      
      @scala.inline
      def setEmailConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolEmailConfiguration]): Self = StObject.set(x, "emailConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailConfigurationUndefined: Self = StObject.set(x, "emailConfiguration", js.undefined)
      
      @scala.inline
      def setEmailVerificationMessage(value: Input[String]): Self = StObject.set(x, "emailVerificationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailVerificationMessageUndefined: Self = StObject.set(x, "emailVerificationMessage", js.undefined)
      
      @scala.inline
      def setEmailVerificationSubject(value: Input[String]): Self = StObject.set(x, "emailVerificationSubject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailVerificationSubjectUndefined: Self = StObject.set(x, "emailVerificationSubject", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setLambdaConfig(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolLambdaConfig]): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: Input[String]): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      @scala.inline
      def setMfaConfiguration(value: Input[String]): Self = StObject.set(x, "mfaConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfaConfigurationUndefined: Self = StObject.set(x, "mfaConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPasswordPolicy(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolPasswordPolicy]): Self = StObject.set(x, "passwordPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordPolicyUndefined: Self = StObject.set(x, "passwordPolicy", js.undefined)
      
      @scala.inline
      def setSchemas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cognito.UserPoolSchema]]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      @scala.inline
      def setSchemasVarargs(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolSchema]*): Self = StObject.set(x, "schemas", js.Array(value :_*))
      
      @scala.inline
      def setSmsAuthenticationMessage(value: Input[String]): Self = StObject.set(x, "smsAuthenticationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "smsAuthenticationMessage", js.undefined)
      
      @scala.inline
      def setSmsConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolSmsConfiguration]): Self = StObject.set(x, "smsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsConfigurationUndefined: Self = StObject.set(x, "smsConfiguration", js.undefined)
      
      @scala.inline
      def setSmsVerificationMessage(value: Input[String]): Self = StObject.set(x, "smsVerificationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmsVerificationMessageUndefined: Self = StObject.set(x, "smsVerificationMessage", js.undefined)
      
      @scala.inline
      def setSoftwareTokenMfaConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolSoftwareTokenMfaConfiguration]): Self = StObject.set(x, "softwareTokenMfaConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftwareTokenMfaConfigurationUndefined: Self = StObject.set(x, "softwareTokenMfaConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserPoolAddOns(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolUserPoolAddOns]): Self = StObject.set(x, "userPoolAddOns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolAddOnsUndefined: Self = StObject.set(x, "userPoolAddOns", js.undefined)
      
      @scala.inline
      def setUsernameAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "usernameAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameAttributesUndefined: Self = StObject.set(x, "usernameAttributes", js.undefined)
      
      @scala.inline
      def setUsernameAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "usernameAttributes", js.Array(value :_*))
      
      @scala.inline
      def setUsernameConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolUsernameConfiguration]): Self = StObject.set(x, "usernameConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameConfigurationUndefined: Self = StObject.set(x, "usernameConfiguration", js.undefined)
      
      @scala.inline
      def setVerificationMessageTemplate(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolVerificationMessageTemplate]): Self = StObject.set(x, "verificationMessageTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "verificationMessageTemplate", js.undefined)
    }
  }
}
