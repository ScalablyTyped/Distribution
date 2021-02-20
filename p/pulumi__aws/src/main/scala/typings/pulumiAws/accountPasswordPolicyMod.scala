package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountPasswordPolicyMod {
  
  @JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy")
  @js.native
  class AccountPasswordPolicy protected () extends CustomResource {
    /**
      * Create a AccountPasswordPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountPasswordPolicyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AccountPasswordPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether to allow users to change their own password
      */
    val allowUsersToChangePassword: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Indicates whether passwords in the account expire. Returns `true` if `maxPasswordAge` contains a value greater than `0`. Returns `false` if it is `0` or _not present_.
      */
    val expirePasswords: Output_[Boolean] = js.native
    
    /**
      * Whether users are prevented from setting a new password after their password has expired (i.e. require administrator reset)
      */
    val hardExpiry: Output_[Boolean] = js.native
    
    /**
      * The number of days that an user password is valid.
      */
    val maxPasswordAge: Output_[Double] = js.native
    
    /**
      * Minimum length to require for user passwords.
      */
    val minimumPasswordLength: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The number of previous passwords that users are prevented from reusing.
      */
    val passwordReusePrevention: Output_[Double] = js.native
    
    /**
      * Whether to require lowercase characters for user passwords.
      */
    val requireLowercaseCharacters: Output_[Boolean] = js.native
    
    /**
      * Whether to require numbers for user passwords.
      */
    val requireNumbers: Output_[Boolean] = js.native
    
    /**
      * Whether to require symbols for user passwords.
      */
    val requireSymbols: Output_[Boolean] = js.native
    
    /**
      * Whether to require uppercase characters for user passwords.
      */
    val requireUppercaseCharacters: Output_[Boolean] = js.native
  }
  /* static members */
  object AccountPasswordPolicy {
    
    /**
      * Get an existing AccountPasswordPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): AccountPasswordPolicy = js.native
    @JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccountPasswordPolicy = js.native
    @JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountPasswordPolicyState): AccountPasswordPolicy = js.native
    @JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountPasswordPolicyState, opts: CustomResourceOptions): AccountPasswordPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of AccountPasswordPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/accountPasswordPolicy", "AccountPasswordPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountPasswordPolicy.AccountPasswordPolicy */ Boolean = js.native
  }
  
  @js.native
  trait AccountPasswordPolicyArgs extends StObject {
    
    /**
      * Whether to allow users to change their own password
      */
    val allowUsersToChangePassword: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether users are prevented from setting a new password after their password has expired (i.e. require administrator reset)
      */
    val hardExpiry: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of days that an user password is valid.
      */
    val maxPasswordAge: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Minimum length to require for user passwords.
      */
    val minimumPasswordLength: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of previous passwords that users are prevented from reusing.
      */
    val passwordReusePrevention: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Whether to require lowercase characters for user passwords.
      */
    val requireLowercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to require numbers for user passwords.
      */
    val requireNumbers: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to require symbols for user passwords.
      */
    val requireSymbols: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to require uppercase characters for user passwords.
      */
    val requireUppercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
  }
  object AccountPasswordPolicyArgs {
    
    @scala.inline
    def apply(): AccountPasswordPolicyArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountPasswordPolicyArgs]
    }
    
    @scala.inline
    implicit class AccountPasswordPolicyArgsMutableBuilder[Self <: AccountPasswordPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUsersToChangePassword(value: Input[Boolean]): Self = StObject.set(x, "allowUsersToChangePassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUsersToChangePasswordUndefined: Self = StObject.set(x, "allowUsersToChangePassword", js.undefined)
      
      @scala.inline
      def setHardExpiry(value: Input[Boolean]): Self = StObject.set(x, "hardExpiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardExpiryUndefined: Self = StObject.set(x, "hardExpiry", js.undefined)
      
      @scala.inline
      def setMaxPasswordAge(value: Input[Double]): Self = StObject.set(x, "maxPasswordAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPasswordAgeUndefined: Self = StObject.set(x, "maxPasswordAge", js.undefined)
      
      @scala.inline
      def setMinimumPasswordLength(value: Input[Double]): Self = StObject.set(x, "minimumPasswordLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumPasswordLengthUndefined: Self = StObject.set(x, "minimumPasswordLength", js.undefined)
      
      @scala.inline
      def setPasswordReusePrevention(value: Input[Double]): Self = StObject.set(x, "passwordReusePrevention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordReusePreventionUndefined: Self = StObject.set(x, "passwordReusePrevention", js.undefined)
      
      @scala.inline
      def setRequireLowercaseCharacters(value: Input[Boolean]): Self = StObject.set(x, "requireLowercaseCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireLowercaseCharactersUndefined: Self = StObject.set(x, "requireLowercaseCharacters", js.undefined)
      
      @scala.inline
      def setRequireNumbers(value: Input[Boolean]): Self = StObject.set(x, "requireNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireNumbersUndefined: Self = StObject.set(x, "requireNumbers", js.undefined)
      
      @scala.inline
      def setRequireSymbols(value: Input[Boolean]): Self = StObject.set(x, "requireSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireSymbolsUndefined: Self = StObject.set(x, "requireSymbols", js.undefined)
      
      @scala.inline
      def setRequireUppercaseCharacters(value: Input[Boolean]): Self = StObject.set(x, "requireUppercaseCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireUppercaseCharactersUndefined: Self = StObject.set(x, "requireUppercaseCharacters", js.undefined)
    }
  }
  
  @js.native
  trait AccountPasswordPolicyState extends StObject {
    
    /**
      * Whether to allow users to change their own password
      */
    val allowUsersToChangePassword: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Indicates whether passwords in the account expire. Returns `true` if `maxPasswordAge` contains a value greater than `0`. Returns `false` if it is `0` or _not present_.
      */
    val expirePasswords: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether users are prevented from setting a new password after their password has expired (i.e. require administrator reset)
      */
    val hardExpiry: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of days that an user password is valid.
      */
    val maxPasswordAge: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Minimum length to require for user passwords.
      */
    val minimumPasswordLength: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of previous passwords that users are prevented from reusing.
      */
    val passwordReusePrevention: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Whether to require lowercase characters for user passwords.
      */
    val requireLowercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to require numbers for user passwords.
      */
    val requireNumbers: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to require symbols for user passwords.
      */
    val requireSymbols: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to require uppercase characters for user passwords.
      */
    val requireUppercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
  }
  object AccountPasswordPolicyState {
    
    @scala.inline
    def apply(): AccountPasswordPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountPasswordPolicyState]
    }
    
    @scala.inline
    implicit class AccountPasswordPolicyStateMutableBuilder[Self <: AccountPasswordPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUsersToChangePassword(value: Input[Boolean]): Self = StObject.set(x, "allowUsersToChangePassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUsersToChangePasswordUndefined: Self = StObject.set(x, "allowUsersToChangePassword", js.undefined)
      
      @scala.inline
      def setExpirePasswords(value: Input[Boolean]): Self = StObject.set(x, "expirePasswords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirePasswordsUndefined: Self = StObject.set(x, "expirePasswords", js.undefined)
      
      @scala.inline
      def setHardExpiry(value: Input[Boolean]): Self = StObject.set(x, "hardExpiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardExpiryUndefined: Self = StObject.set(x, "hardExpiry", js.undefined)
      
      @scala.inline
      def setMaxPasswordAge(value: Input[Double]): Self = StObject.set(x, "maxPasswordAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPasswordAgeUndefined: Self = StObject.set(x, "maxPasswordAge", js.undefined)
      
      @scala.inline
      def setMinimumPasswordLength(value: Input[Double]): Self = StObject.set(x, "minimumPasswordLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumPasswordLengthUndefined: Self = StObject.set(x, "minimumPasswordLength", js.undefined)
      
      @scala.inline
      def setPasswordReusePrevention(value: Input[Double]): Self = StObject.set(x, "passwordReusePrevention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordReusePreventionUndefined: Self = StObject.set(x, "passwordReusePrevention", js.undefined)
      
      @scala.inline
      def setRequireLowercaseCharacters(value: Input[Boolean]): Self = StObject.set(x, "requireLowercaseCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireLowercaseCharactersUndefined: Self = StObject.set(x, "requireLowercaseCharacters", js.undefined)
      
      @scala.inline
      def setRequireNumbers(value: Input[Boolean]): Self = StObject.set(x, "requireNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireNumbersUndefined: Self = StObject.set(x, "requireNumbers", js.undefined)
      
      @scala.inline
      def setRequireSymbols(value: Input[Boolean]): Self = StObject.set(x, "requireSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireSymbolsUndefined: Self = StObject.set(x, "requireSymbols", js.undefined)
      
      @scala.inline
      def setRequireUppercaseCharacters(value: Input[Boolean]): Self = StObject.set(x, "requireUppercaseCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireUppercaseCharactersUndefined: Self = StObject.set(x, "requireUppercaseCharacters", js.undefined)
    }
  }
}
