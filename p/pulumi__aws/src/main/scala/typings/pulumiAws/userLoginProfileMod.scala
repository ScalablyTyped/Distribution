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

object userLoginProfileMod {
  
  @JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile")
  @js.native
  class UserLoginProfile protected () extends CustomResource {
    /**
      * Create a UserLoginProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserLoginProfileArgs) = this()
    def this(name: String, args: UserLoginProfileArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
      */
    val encryptedPassword: Output_[String] = js.native
    
    /**
      * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
      */
    val keyFingerprint: Output_[String] = js.native
    
    /**
      * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val passwordLength: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val passwordResetRequired: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val pgpKey: Output_[String] = js.native
    
    /**
      * The IAM user's name.
      */
    val user: Output_[String] = js.native
  }
  /* static members */
  object UserLoginProfile {
    
    /**
      * Get an existing UserLoginProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile.get")
    @js.native
    def get(name: String, id: Input[ID]): UserLoginProfile = js.native
    @JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserLoginProfile = js.native
    @JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserLoginProfileState): UserLoginProfile = js.native
    @JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserLoginProfileState, opts: CustomResourceOptions): UserLoginProfile = js.native
    
    /**
      * Returns true if the given object is an instance of UserLoginProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/userLoginProfile", "UserLoginProfile.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userLoginProfile.UserLoginProfile */ Boolean = js.native
  }
  
  @js.native
  trait UserLoginProfileArgs extends StObject {
    
    /**
      * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val passwordLength: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val passwordResetRequired: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val pgpKey: Input[String] = js.native
    
    /**
      * The IAM user's name.
      */
    val user: Input[String] = js.native
  }
  object UserLoginProfileArgs {
    
    @scala.inline
    def apply(pgpKey: Input[String], user: Input[String]): UserLoginProfileArgs = {
      val __obj = js.Dynamic.literal(pgpKey = pgpKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserLoginProfileArgs]
    }
    
    @scala.inline
    implicit class UserLoginProfileArgsMutableBuilder[Self <: UserLoginProfileArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPasswordLength(value: Input[Double]): Self = StObject.set(x, "passwordLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordLengthUndefined: Self = StObject.set(x, "passwordLength", js.undefined)
      
      @scala.inline
      def setPasswordResetRequired(value: Input[Boolean]): Self = StObject.set(x, "passwordResetRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordResetRequiredUndefined: Self = StObject.set(x, "passwordResetRequired", js.undefined)
      
      @scala.inline
      def setPgpKey(value: Input[String]): Self = StObject.set(x, "pgpKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserLoginProfileState extends StObject {
    
    /**
      * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
      */
    val encryptedPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
      */
    val keyFingerprint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val passwordLength: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val passwordResetRequired: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
      */
    val pgpKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM user's name.
      */
    val user: js.UndefOr[Input[String]] = js.native
  }
  object UserLoginProfileState {
    
    @scala.inline
    def apply(): UserLoginProfileState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserLoginProfileState]
    }
    
    @scala.inline
    implicit class UserLoginProfileStateMutableBuilder[Self <: UserLoginProfileState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptedPassword(value: Input[String]): Self = StObject.set(x, "encryptedPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedPasswordUndefined: Self = StObject.set(x, "encryptedPassword", js.undefined)
      
      @scala.inline
      def setKeyFingerprint(value: Input[String]): Self = StObject.set(x, "keyFingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFingerprintUndefined: Self = StObject.set(x, "keyFingerprint", js.undefined)
      
      @scala.inline
      def setPasswordLength(value: Input[Double]): Self = StObject.set(x, "passwordLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordLengthUndefined: Self = StObject.set(x, "passwordLength", js.undefined)
      
      @scala.inline
      def setPasswordResetRequired(value: Input[Boolean]): Self = StObject.set(x, "passwordResetRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordResetRequiredUndefined: Self = StObject.set(x, "passwordResetRequired", js.undefined)
      
      @scala.inline
      def setPgpKey(value: Input[String]): Self = StObject.set(x, "pgpKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgpKeyUndefined: Self = StObject.set(x, "pgpKey", js.undefined)
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
